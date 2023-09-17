import java.time.Year;

public class LeapYear {

	public static void main(String[] args) {
		
		int n = 2016;
		Year y = Year.of(n);
		boolean flag = y.isLeap();
		if(flag)
			System.out.printf("%nYear %d is Leap Year",n);
		else
			System.out.printf("%nYear %d is Not Leap Year",n);

	}

}
