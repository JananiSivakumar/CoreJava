package PradeepPrograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class testDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
	       Calendar queryDate = Calendar.getInstance();
	       queryDate.setTime(new java.util.Date());
	       queryDate.add(Calendar.DATE, -5);
	       queryDate.clear(Calendar.HOUR_OF_DAY);
	       queryDate.clear(Calendar.AM_PM);
	       queryDate.clear(Calendar.MINUTE);
	       queryDate.clear(Calendar.SECOND);
	       queryDate.clear(Calendar.MILLISECOND);
	       String l_sQueryRenewDate = sdf.format(queryDate.getTime());
	       System.out.println(l_sQueryRenewDate);


	}

}