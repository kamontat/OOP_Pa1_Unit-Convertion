package UnitFactory;

/**
 * The collection of <b>Pressure</b> unit. <br>
 * Default unit is Pascal(kPa) <br>
 * <p>
 * Created by kamontat on 27/4/59.
 */
public enum PressureUnit implements Unit {
	PASCAL("Pascal (Pa)", 1),

	// Metric
	BAR("Bar", Math.pow(10, 5)),
	KILOPASCAL("Kilopascal (kPa)", 1000),
	KGPERSQM("Kilogram/Meter² (kgf/m²)", 9.807),
	NPERSQM("Newton/Meter² (N/m²)", 1),
	TPERSQM("Tonne/Meter²", 9807),

	// Atmosphere
	ATMOSPHERE("Atmosphere (atm)", 101300);

	// name or description of unit pressure
	private final String name;
	// compare 1 unit to ??? Pascal
	private final double value;

	// constructor
	PressureUnit(String name, double value) {
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
