package Code;

/**
 * Created by kamontat on 27/4/59.
 */
public enum PressureUnit implements Unit {
	PASCAL("Pascal (Pa)", 1),

	// Metric
	BAR("Bar", Math.pow(10, 5)),
	KILOPASCAL("Kilopascal (kPa)", 1000),
	// FIXME: 27/4/59 change unit to pressure
	GRAM("Gram (g)", 0.001),
	CARAT("Carat (ct)", 0.0002),

	// Avoirdupois
	STONE("Stone", 6.35),
	POUND("Pound (lb)", 0.4536),
	OUNCE("Ounce (oz)", 0.02835),
	GRAIN("Grain (gr)", 6.48 * Math.pow(10, -5)),

	// Thai unit
	HAP("หาบ (Hap)", 60.98),
	CHANG("ชั่ง (Chang)", 1.22),
	TAMLUENG("ตำลึง (Tamlueng)", 6.098 * Math.pow(10, -2)),
	BAHT("บาท (baht)", 1.5 * Math.pow(10, -2)),
	SALUENG("สลึง (Salueng)", 3.811 * Math.pow(10, -3)),
	ATH("อัฐ (Ath)", 2.382 * Math.pow(10, -4));

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
