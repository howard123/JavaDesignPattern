package creationalpattern.builder;

public class ConcreteBuilder extends Builder {

	@Override
	public void buildDoor() {
		// TODO Auto-generated method stub
		System.out.println("Build Door");
	}

	@Override
	public void buildWindow() {
		// TODO Auto-generated method stub
		System.out.println("Build Window");
	}

	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
		System.out.println("Build Roof");
	}

}
