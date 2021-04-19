package com.nit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Repository;

import com.nit.model.PoliticalParty;

@Repository("partyDAO")
public class PoliticalPartyDAOImpl implements IPoliticalPartyDAO{
	private static final String GET_PARTY_DETAILS_BY_ID="SELECT PARTYID,PARTYNAME,FLAGCOLORS,PARTYSYMBOL FROM POLITICALPARTY WHERE PARTYID=?";
	private static final String GET_PARTY_DETAILS_BY_PARTYNAME="SELECT PARTYID,PARTYNAME,FLAGCOLORS,PARTYSYMBOL FROM POLITICALPARTY WHERE PARTYNAME IN(?,?,?)";
	private static final String UPDATE_PARTYFLAGCOLOR_BY_PARTYNAME="UPDATE POLITICALPARTY SET FLAGCOLORS=? WHERE PARTYNAME=?";
	
	private PoliticalPartySelector1 selector1;
	private PoloticalPartySelector2 selector2;
	private PoliticalPartyUpdater1 updater1;
    @Autowired
	public PoliticalPartyDAOImpl(DataSource ds) {
    	selector1=new PoliticalPartySelector1(ds,GET_PARTY_DETAILS_BY_ID);
    	selector2=new PoloticalPartySelector2(ds,GET_PARTY_DETAILS_BY_PARTYNAME);
    	updater1=new PoliticalPartyUpdater1(ds,UPDATE_PARTYFLAGCOLOR_BY_PARTYNAME);
		
	}

	@Override
	public PoliticalParty getPoliticalPartyDetailsByPartyId(int partyId) {
		PoliticalParty party=selector1.findObject(partyId);
		return party;
	}
	@Override
	public List<PoliticalParty> getPoliticalPartiesByPartyNames(String partyName1, String partyName2,String partyName3) {
		List<PoliticalParty> list=selector2.execute(partyName1,partyName2,partyName3);
		return list;
	}
	
	//inner class
	private static class PoliticalPartySelector1 extends MappingSqlQuery<PoliticalParty>{
         
		
		public PoliticalPartySelector1(DataSource ds, String query) {
			super(ds, query);
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.compile();
		}

		@Override
		protected PoliticalParty mapRow(ResultSet rs, int rowNum) throws SQLException {
			//copy RS object to Model class obj
			PoliticalParty party=new PoliticalParty();
			party.setPartyId(rs.getInt(1));
			party.setFlagColors(rs.getString(3));
			party.setPartyName(rs.getString(2));
			party.setPartySymbol(rs.getString(4));
			return party;
		}
		
	}
	//inner class
	private static class PoloticalPartySelector2 extends MappingSqlQuery<PoliticalParty>{
       
		
		public PoloticalPartySelector2(DataSource ds, String query) {
			super(ds, query);
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.compile();
		}

		@Override
		protected PoliticalParty mapRow(ResultSet rs, int rowNum) throws SQLException {
			//copy result set object to model class obj
			PoliticalParty party=new PoliticalParty();
			party.setPartyId(rs.getInt(1));
			party.setFlagColors(rs.getString(3));
			party.setPartyName(rs.getString(2));
			party.setPartySymbol(rs.getString(4));
			return party;
		}
		
	}
	
	@Override
	public int updateFlagColorByName(String partyName,String newColor) {
		int count = updater1.update(newColor,partyName);
		return count;
	}
	
 private static class PoliticalPartyUpdater1 extends SqlUpdate{

	public PoliticalPartyUpdater1(DataSource ds, String query) {
		super(ds, query);
		super.declareParameter(new SqlParameter(Types.VARCHAR));
		super.declareParameter(new SqlParameter(Types.VARCHAR));
		super.compile();
		
	}
	 
}
	

}
