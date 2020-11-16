package testCases;

import org.testng.annotations.Test;

import utilities.FormatDate;

public class DateFormat {

	@Test
	public void DateFormatChange(){
		
		String date1 = "06-04-2020";
		String newDate = FormatDate.convertDate(date1,"dd/MM/yyyy");
		String newDate1 = FormatDate.convertDate(date1,"dd-MM-yyyy");	
		String newDate2 = FormatDate.convertDate(date1,"dd/MM/yy");	
		String newDate3 = FormatDate.convertDate(date1,"MM/dd/yyyy");
		String newDate4 = FormatDate.convertDate(date1,"MM/dd/yy");
		String newDate5 = FormatDate.convertDate(date1,"MM/dd");
		String newDate6 = FormatDate.convertDate(date1,"dd/MM");
		
		System.out.println(newDate);
		System.out.println(newDate1);
		System.out.println(newDate2);
		System.out.println(newDate3);
		System.out.println(newDate4);
		System.out.println(newDate5);
		System.out.println(newDate6);
	}
	    
}  
		

