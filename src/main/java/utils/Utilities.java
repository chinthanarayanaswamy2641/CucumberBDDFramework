package utils;

import java.util.Date;

public class Utilities {
	public static String generateEmailWithTimeStamp() {
		Date date=new Date();
		String timeStamp= date.toString().replace(" ","_").replace(":","_");
		return "chinthanarayanaswamy"+timeStamp+"@gmail.com";
	}
}
