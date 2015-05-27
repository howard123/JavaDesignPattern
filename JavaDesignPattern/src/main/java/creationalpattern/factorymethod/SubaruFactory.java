package creationalpattern.factorymethod;

/**
 * This class will create a car object base on the model that is passing
 * 
 * @author howard.suksanti
 *
 */
public class SubaruFactory extends CarFactory {

	@Override
	public Car createCar(String model) {

		switch (model.toLowerCase()) {

			case "forester" :
				return new Forester();
			case "wrx" :
				return new Wrx();
			default :
				throw new IllegalArgumentException("Invalid model");
		}

	}
}
