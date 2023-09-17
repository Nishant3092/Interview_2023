import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class MyAge {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1992, Month.MAY, 30);
		Period p = Period.between(birthday, today);
		
		System.out.printf("You Are %d Years %d Months and %d Days Older.",p.getYears(),p.getMonths(),p.getDays());

	}

}
