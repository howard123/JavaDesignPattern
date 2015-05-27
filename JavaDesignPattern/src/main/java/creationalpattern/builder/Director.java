package creationalpattern.builder;

/**
 * This class will give the order on building new product
 * 
 * @author howard.suksanti
 *
 */
public class Director {

	public void construct(Builder builder) {
		builder.buildDoor();
		builder.buildRoof();
		builder.buildWindow();
	}

	public static void main(String[] args) {
		new Director().construct(new ConcreteBuilder());
	}
}
