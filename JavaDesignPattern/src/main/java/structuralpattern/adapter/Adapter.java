package structuralpattern.adapter;

/**
 * This class will be an adapter to connect to Adaptee class which is
 * incompatible
 * 
 * @author howard.suksanti
 *
 */
public class Adapter implements PhoneList {

	private Adaptee _adaptee;

	public Adapter(Adaptee adaptee) {
		_adaptee = adaptee;
	}

	public String getPhoneList() {
		String[][] emps = _adaptee.getEmployee();
		StringBuilder phoneList = new StringBuilder();

		for (String[] employee : emps) {
			phoneList.append(employee[1]);
			phoneList.append(',');
			phoneList.append(employee[2]);
			phoneList.append(',');
			phoneList.append(employee[0]);
			phoneList.append('\n');
		}
		return phoneList.toString();
	}

	// test Adapter
	public static void main(String[] args) {

		PhoneList list = new Adapter(new Adaptee());

		System.out.println(list.getPhoneList());
	} // TODO Auto-generated method stub

}
