package com.nit.encoding;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncorder {

	public static void main(String[] args) {
		BCryptPasswordEncoder coder=new BCryptPasswordEncoder(); 
		
		System.out.println(coder.encode("rani"));
		System.out.println(coder.encode("zafar"));
		System.out.println(coder.encode("arkam"));
		System.out.println(coder.encode("delhi"));

	}

}
