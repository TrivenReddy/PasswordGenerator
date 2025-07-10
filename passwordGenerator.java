package com.passwordGenerator;

import java.util.Random;
import java.util.Scanner;

public class passwordGenerator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the desired password length:");
		int length=sc.nextInt();
		System.out.println("Include Number?(Yes/No)");
		boolean isIncludeNumbers=sc.next().equalsIgnoreCase("yes");
		System.out.println("Include symbols or not?");
		boolean isIncludeSymbols=sc.next().equalsIgnoreCase("yes");
		System.out.println("Include UpperCase or not?");
		boolean isIncludeUpperCase=sc.next().equalsIgnoreCase("yes");
		System.out.println("Generated Password:"+generatePassword(length,isIncludeNumbers,isIncludeSymbols,isIncludeUpperCase));

	}
	public static String generatePassword(int length,boolean isIncludeNumbers,boolean isIncludeSymbols,boolean isIncludeUpperCase) {
		String numbers=isIncludeNumbers?"0123456789":"";
		String lowerCase="abcdefghijklmnopqrstuvwxyz";
		String upperCase=isIncludeUpperCase?"ABCDEFGHIJKLMNOPQRSTUVWXYZ":"";
		String symbols=isIncludeSymbols?"&*[]!@%&^%":"";
		String allChars=numbers+lowerCase+upperCase+symbols;
		Random r=new Random();
		StringBuffer sbr=new StringBuffer();
		for(int i=0;i<length;i++) {
			sbr.append((allChars.charAt(r.nextInt(allChars.length()))));
		}
		
		return sbr.toString();
	}

}
