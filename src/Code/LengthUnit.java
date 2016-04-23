package Code;

/**
 * The collection of <b>Length</b> unit. <br>
 * Default unit is M(Meter) <br>
 * <p>
 * This has 3 different kind of Length <br>
 * 1) Metric <br>
 * 2) American System of Measures <br>
 * 3) Thai unit <br>
 * <p>
 * Created by kamontat on 21/4/59.
 */
public enum LengthUnit implements Unit {
	METER("Meter (m)", 1),

	// Metric
	KILOMETER("Kilometer (km)", 1000),
	CENTIMETER("Centimeter (cm)", 0.01),
	MILLIMETER("Millimeter (mm)", 0.001),
	MICRON("Micrometre (micron)", Math.pow(10, -6)),
	ANGSTROM("Angstrom", Math.pow(10, -10)),

	// American System of Measures
	LEAGUE("League", 4828),
	MILE("Mile (mi)", 1609.344),
	YARD("Yard (yd)", 0.9144),
	FOOT("Foot (ft)", 0.3048),
	INCH("Inch (in)", 0.0254),

	// Thai unit
	YOT("โยชน์ (Yot)", 16000),
	SEN("เส้น (Sen)", 40),
	WA("วา (Wa)", 2),
	SOK("ศอก (Sok)", 0.5),
	KHUEP("คีบ (Khuep)", 0.25),
	NIO("นิ้ว (Nio)", 0.02083);

	// name or description of unit length
	private final String name;
	// compare 1 unit to ??? meter
	private final double value;

	// constructor
	private LengthUnit(String n, double v) {
		this.name = n;
		this.value = v;
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
