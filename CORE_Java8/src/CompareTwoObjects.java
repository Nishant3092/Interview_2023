
public class CompareTwoObjects {

	public static void main(String[] args) {

		Employee e1 = new Employee(100, "Jhon", 30);

		Employee e2 = new Employee(101, "Amenda", 35);

		// Compare two employee e1, e2 objects

		boolean isSame = e1.equals(e2);

		if (isSame) {
			System.out.println("e1 and e2 are same objects and have the same values");
		} else {
			System.out.println("e1 and e2 are not same objects");
		}

	}

}
