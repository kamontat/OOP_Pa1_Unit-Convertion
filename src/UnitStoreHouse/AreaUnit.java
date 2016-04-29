package UnitStoreHouse;

/**
 * The collection of <b>Area</b> unit. <br>
 * Default unit is Meter²(m²) <br>
 * <p>
 * This has 3 different kind of Length <br>
 * 1) Metric <br>
 * 2) British (Imperial) And U.S. System <br>
 * 3) Thai unit <br>
 * <p>
 * Created by kamontat on 28/4/59.
 */
public enum AreaUnit implements Unit {
	SQMETER("Meter² (m²)", 1),

	// Metric
	SQKILOMETER("Kilometer² (m²)", Math.pow(10, 6)),
	DECARE("Decare", 1000),
	SQCENTIMETER("Centimeter² (cm²)", Math.pow(10, -4)),
	BARN("Barn (b)", Math.pow(10, -28)),

	// British (Imperial) And U.S. System
	TOWNSHIP("Township", 9.324 * Math.pow(10, 7)),
	ACRE("Acre", 4047),
	ROOD("Rood", 1012),
	SQINCH("Inch² (in²)", 6.452 * Math.pow(10, -4)),

	// Thai unit
	RAI("ไร่ (Rai)", 1600),
	NGAN("งาน (ngan)", 400),
	SQWA("ตารางวา (Wa²)", 4);

	// name or description of unit area
	private final String name;
	// compare 1 unit to ??? kilometer
	private final double value;

	// constructor
	AreaUnit(String name, double value) {
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
