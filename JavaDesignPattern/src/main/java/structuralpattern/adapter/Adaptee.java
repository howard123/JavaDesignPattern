package structuralpattern.adapter;

public class Adaptee {

	public String[][] getEmployee() {
		String[][] emp = new String[4][];

		emp[0] = new String[]{"1", "Howard", "A"};
		emp[1] = new String[]{"2", "John", "Doe"};
		emp[2] = new String[]{"3", "Frank", "Lin"};
		emp[3] = new String[]{"4", "Chris", "Wall"};

		return emp;

	}

}
