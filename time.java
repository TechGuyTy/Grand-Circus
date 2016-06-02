
import java.util.Calendar;
import java.util.Scanner;

public class Time {

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		// Create Calendar instance
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();

		// Create Scanner prompts for YYYY/MM/DD 
		System.out.println("Enter a start year");
		Scanner year1 = new Scanner(System.in);

		System.out.println("Enter a start month");
		Scanner mo1 = new Scanner(System.in);

		System.out.println("Enter a start day");
		Scanner day1 = new Scanner(System.in);

		System.out.println("Enter an end year");
		Scanner year2 = new Scanner(System.in);

		System.out.println("Enter an end month");
		Scanner mo2 = new Scanner(System.in);

		System.out.println("Enter an end day");
		Scanner day2 = new Scanner(System.in);

		//Declare variables for scanner inputs
		
		int yearS = year1.nextInt();
		int moS = mo1.nextInt();
		int dayS = day1.nextInt();
		int yearE = year2.nextInt();
		int moE = mo2.nextInt();
		int dayE = day2.nextInt();

		// Set the values for the calendar fields YEAR, MONTH, and DAY_OF_MONTH.
		calendar1.set(yearS, moS, dayS);
		calendar2.set(yearE, moE, dayE);

		//Get calendars time values.
		long miliSecondForDate1 = calendar1.getTimeInMillis();
		long miliSecondForDate2 = calendar2.getTimeInMillis();

		// Calculate the difference in millisecond between two dates
		long diffInMilis = miliSecondForDate2 - miliSecondForDate1;

		long diffInYears = diffInMilis / (24 * 60 * 60 * 1000) / 365;
		long diffInMonths = moE - moS;
		long diffInDays = dayE - dayS;

		// ORIGINAL **FLAWED** LOGIC
		// long diffInYears = diffInMilis / (24 * 60 * 60 * 1000) / 365;
		// long diffInMonths = diffInMilis / (24 * 60 * 60 * 1000) / 30 % 12;
		// long diffInDays = diffInMilis / (24 * 60 * 60 * 1000) ;
		// long diffInHour = diffInMilis / (60 * 60 * 1000);
		// long diffInMinute = diffInMilis / (60 * 1000);
		// long diffInSecond = diffInMilis / 1000;

		
		//Logic for if the value of the start Month and/or Day is larger than the end
		
		if (diffInMonths < 0) {

			diffInMonths = diffInMonths + 12;
		}

		if (diffInDays < 0) {
			diffInMonths = diffInMonths - 1;
			diffInDays = diffInDays + 30;
		}

		// System.out.println("Difference in Seconds : " + diffInSecond);
		// System.out.println("Difference in Minute : " + diffInMinute);
		// System.out.println("Difference in Hours : " + diffInHour);
		// System.out.println("Difference in Days : " + diffInDays);
		// System.out.println("Difference in Months : " + diffInMonths);
		// System.out.println("Difference in Years : " + diffInYears);
		// System.out.println(miliSecondForDate1);
		// System.out.println(miliSecondForDate2);
		// System.out.println(diffInMilis);

		System.out.println("Time between dates: " + diffInYears + " Years, " + diffInMonths + " Months, and "
				+ diffInDays + " days. ");

	}

}
