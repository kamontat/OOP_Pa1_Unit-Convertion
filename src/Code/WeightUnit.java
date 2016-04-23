package Code;

/**
 * The collection of weight unit. <br>
 * Default unit is KG(Kilogram) <br>
 * <p>
 * Created by kamontat on 23/4/59.
 */
public enum WeightUnit implements Unit {
	KILOGRAM("Kilogram", 1);


	// name of unit area
	private final String name;
	// compare 1 unit to ??? kilogram
	private final double value;

	// constructor
	private WeightUnit(String name, double value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getValue() {
		return this.value;
	}
}
