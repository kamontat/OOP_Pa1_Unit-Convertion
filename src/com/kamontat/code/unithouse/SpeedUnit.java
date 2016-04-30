package com.kamontat.code.unithouse;

/**
 * The collection of <b>Speed</b> unit. <br>
 * Default unit is kilometer per hour(km/hr) <br>
 * <p>
 * This has 4 different kind of Speed <br>
 * 1) Metric <br>
 * 2) British (Imperial) And U.S. System <br>
 * 3) nautical <br>
 * 4) Speed constants <br>
 * <p>
 * Created by kamontat on 30/4/59.
 */
public enum SpeedUnit implements Unit {
	KMPERHOUR("Kilometer/Hour (km/hr)", 1),

	// Metric
	KMPERSECOND("Kilometer/Second (km/s)", 3600),
	MPERSECOND("Meter/Second (m/s)", 3.6),

	// British (Imperial) And U.S. System
	MILEPERHOUR("Mile/Hour (mph)", 1.609),

	// nautical
	KNOT("Knot", 1.852),
	SEAMILEPERHOUR("Sea Mile/Hour", 1.852),

	// Speed constants
	SOUND("Speed of Sound in Gas (mach)", 1224),
	LIGHT("Speed of Light in Vacuum", 1.079 * Math.pow(10, 9));

	// name or description of unit area
	private final String name;
	// compare 1 unit to ??? kilometer
	private final double value;

	// constructor
	SpeedUnit(String name, double value) {
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
