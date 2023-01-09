package javaconversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.volvo.java.SysoExample1;

public class StringToDateAndViceVersa {

	public static void main(String[] args) throws ParseException {
		
	//STRING TO DATE	
		String sDate= "31/12/2022";
		
	Date d=	new SimpleDateFormat("mm/dd/yyyy").parse(sDate);
	
	System.out.println(sDate);
	
	System.out.println(d);
	
	System.out.println();
	
//	DATE TO STRING
	Date date = Calendar.getInstance().getTime();
	DateFormat df=  new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
	System.out.println(date);
	String str= df.format(date);
	System.out.println(str);
	}
	
}
