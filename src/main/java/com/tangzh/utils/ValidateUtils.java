package com.tangzh.utils;

public class ValidateUtils {

	public static boolean isEmpty(String str){
		if(null==str){
			return true;
		}else if(str.trim().equals("") || str.trim().length()<=0){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isSame(String str1,String str2){
		if(null==str1 || null==str2){
			return false;
		}
		return str1.trim().equals(str2.trim());
	}
	
	public static boolean isEmail(String str){
		if(null==str){
			return false;
		}
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,}";
		return str.matches(regex);
	}
	
	public static boolean isPhone(String str){
		if(null==str){
			return false;
		}
		String regex = "[0-9]{7,11}";
		return str.matches(regex);
	}
	
	public static boolean isPassword(String str){
		if(null==str){
			return false;
		}
		String regex = "[a-z0-9_]{6,18}";
		return str.matches(regex);
	}
	
	public static boolean checkLength(String str,int from,int to){
		if(null==str){
			return false;
		}
		int length = str.length();
		if(length>=from && length<=to){
			return true;
		}
		return false;
	}
}
