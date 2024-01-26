package arraylist_DS;
import java.util.Scanner;
public class DaysInYear {



	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first year: ");
	        int year1 = scanner.nextInt();

	        System.out.print("Enter the second year: ");
	        int year2 = scanner.nextInt();

	      

	        int daysBetween = 0;

	        for (int year = year1; year <= year2; year++) {
	            daysBetween += isLeapYear(year) ? 366 : 365;
	        }

	        // Subtract one day if year2 is not a leap year and it's not a full year
	        if (!isLeapYear(year2) && !isFullYear(year2)) {
	            daysBetween--;
	        }

	        System.out.println("Number of days between " + year1 + " and " + year2 + ": " + daysBetween + " days.");
	    }

	   
	    public static boolean isLeapYear(int year) {
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }


	    public static boolean isFullYear(int year) {
	        return isLeapYear(year) ? true : false;
	    }
	}


