package com.nit.external;

public class ICCScoreCompImpl implements IICCScoreComp {

	@Override
	public String getScore(int mid) {
		if(mid==1001)
			return "IND vs PAK :: 307/4 (Ind)";
		else if(mid==1002)
			return "AUS vs ENG :: 260/4(Eng)";
		else if(mid==1003)
			return "NZ vs WI :: 204/4(NZ)";
		else
		throw new IllegalArgumentException("Invalid Match Id");
	}

	

}
