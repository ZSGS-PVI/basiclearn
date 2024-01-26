package arraylist_DS;
import java.util.Scanner;
public class DateYear {

	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first year: ");
	        int year1 = scanner.nextInt();

	        System.out.print("Enter the second year: ");
	        int year2 = scanner.nextInt();

	        scanner.close();

	        int daysBetween = 0;

	        for (int year = year1; year <= year2; year++) {
	            daysBetween += isLeapYear(year) ? 366 : 365;
	        }

	        // Subtract one day if year2 is not a leap year and it's not a full year
	        if (!isLeapYear(year2) && !isFullYear(year2)) {
	            daysBetween--;
	        }

	        int totalYears = year2 - year1;
	        int remainingDays = daysBetween;

	        int years = remainingDays / 365;
	        remainingDays %= 365;

	        int months = remainingDays / 30; // Assuming a month as 30 days for simplicity
	        remainingDays %= 30;

	        int days = remainingDays;

	        System.out.println("Days between " + year1 + " and " + year2 + ": " + daysBetween + " days.");
	        System.out.println("Years: " + years + ", Months: " + months + ", Days: " + days);
	    }

	        public static boolean isFullYear(int year) {
	        return isLeapYear(year) ? true : false;
	    }

		public static boolean isLeapYear(int year) {
	        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
	    }
	}


