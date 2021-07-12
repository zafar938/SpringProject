package com.nit.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;

@Service("localservice")
public class LocaleMgmtServiceImpl implements ILocaleMgmtService {

	@Override
	public List<String> fetchAllCountries() {
		Locale locales[]=Locale.getAvailableLocales();
		List<String> listCountries=new ArrayList(); 
		for(Locale l: locales) {
			if(l!=null && l.getDisplayCountry().length()!=0)
				listCountries.add(l.getDisplayCountry());
		}
		Collections.sort(listCountries);
		return listCountries;
	}

}
