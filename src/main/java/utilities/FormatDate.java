package utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
	
	public static String convertDate(String date1, String date2) {  
		  
		SimpleDateFormat DateFor = new SimpleDateFormat("MM-dd-yyyy");
		Date date = null;
		try {
			date = DateFor.parse(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		SimpleDateFormat DateTo = new SimpleDateFormat(date2);
		String stringDate = DateTo.format(date);
		return stringDate; 
	}  
}


