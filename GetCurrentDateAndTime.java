import java.util.*;
class  GetCurrentDateAndTime
{	public static void main(String[] args) 
	{
		int second,month,year,day,minute,hour;
		GregorianCalendar date=new GregorianCalendar();
		day=date.get(Calendar.DAY_OF_MONTH);
		month=date.get(Calendar.MONTH);
		year=date.get(Calendar.YEAR);
		second=date.get(Calendar.SECOND);
		minute=date.get(Calendar.MINUTE);
		hour=date.get(Calendar.HOUR);
		System.out.println("CURRENT DATE IS:"+day+"/"+(month+1)+"/"+year);
		System.out.println("CURRENT TIME IS:"+hour+":"+minute+":"+second);


		}
}
