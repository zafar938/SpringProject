package com.nit.I18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18nApp {

	public static void main(String[] args) {
		//create Local object
		Locale locale=new Locale(args[0],args[1]);
		//create ResourceBundle object
		ResourceBundle bundle=ResourceBundle.getBundle("com/nit/commns/App",locale);
      System.out.println(bundle.getString("wishMsg")+"    "+bundle.getString("welcome.msg")+"    "+bundle.getString("bye.msg"));
	}

}
