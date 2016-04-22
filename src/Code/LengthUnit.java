package Code;

/**
 * the collection of length unit. <br>
 * this has 3 different kind of length <br>
 * 1) Metric <br>
 * 2) American System of Measures <br>
 * 3) Thai unit <br>
 * <p>
 * Created by kamontat on 21/4/59.
 */
public enum LengthUnit {
	METER("Meter", 1),

	// metric
	KILOMETER("Kilometer", 1000),
	CENTIMETER("Centimeter", 0.01),
	MILLIMETER("Millimeter", 0.001),
	MICRON("Micron", Math.pow(10, -6)),
	ANGSTROM("Angstrom", Math.pow(10, -10)),

	// American System of Measures
	LEAGUE("League", 4828),
	MILE("Mile", 1609.344),
	YARD("Yard", 0.9144),
	FOOT("Foot", 0.3048),
	INCH("Inch", 0.0254),

	// thai unit
	YOT("Yot", 16000),
	SEN("Sen", 40),
	WA("Wa", 2),
	SOK("Sok", 0.5),
	KHUEP("Khuep", 0.25),
	NIO("Nio", 0.02083);

	// name of unit length
	private final String name;
	// compare 1 unit to ??? meter
	private final double value;

	// constructor
	private LengthUnit(String n, double v) {
		this.name = n;
		this.value = v;
	}

	public String getName() {
		return this.name;
	}

	public double getValue() {
		return this.value;
	}
}
