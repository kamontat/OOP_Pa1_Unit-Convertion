package Code;

/**
 * The collection of <b>Weight</b> unit. <br>
 * Default unit is KG(Kilogram) <br>
 * <p>
 * This has 3 different kind of Weight <br>
 * 1) Metric <br>
 * 2) Avoirdupois <br>
 * 3) Thai unit <br>
 * <p>
 * Created by kamontat on 23/4/59.
 */
public enum WeightUnit implements Unit {
	KILOGRAM("Kilogram (kg)", 1),

	// Metric
	TONNE("Tonne", 1000),
	NEWTON("Newton (N)", 0.102),
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

	// name or description of unit weight
	private final String name;
	// compare 1 unit to ??? kilogram
	private final double value;

	// constructor
	WeightUnit(String name, double value) {
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
