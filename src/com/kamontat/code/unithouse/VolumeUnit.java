package com.kamontat.code.unithouse;

/**
 * The collection of <b>Volume</b> unit. <br>
 * Default unit is Meter³ (m³) <br>
 * <p>
 * This has 3 different kind of Speed <br>
 * 1) Metric <br>
 * 2) US liquid and dry Measure <br>
 * 3) Thai units <br>
 * <p>
 * Created by kamontat on 30/4/59.
 */
public enum VolumeUnit implements Unit {
	CUBICMETER("Meter³ (m³)", 1),

	// Metric
	CUBICKILOMETER("Kilometer³ (m³)", Math.pow(10, 9)),
	SQCENTIMETER("Centimeter³ (cm³)", Math.pow(10, -6)),
	HECTOLITER("Hectoliter (hl)", 0.1),
	LITER("Liter (l)", 0.001),

	// US liquid and dry Measure
	BARREL("Barrel (petroleum)", 0.159),
	GALLON("Gallon (gal)", 0.003785),
	QUART("Quart (qt)", 9.464 * Math.pow(10, -4)),
	MINIM("Minim", 6.161 * Math.pow(10, -8)),

	BUSHEL("Bushel (bu)", 0.03524),
	PECK("Peck (pk)", 0.00881),

	// Thai unit
	KWIAN("เกวียน (cartload)", 2),
	THANG("ถัง (tank)", 0.02),
	THANAN("ทะนาน (coconut shell)", 0.001),
	KAMMUE("กำมือ (hand of grain)", 3.125 * Math.pow(10, -5)),
	YIPMUE("หยิบมือ (pinch)", 7.813 * Math.pow(10, -6));

	// name or description of unit area
	private final String name;
	// compare 1 unit to ??? kilometer
	private final double value;

	// constructor
	VolumeUnit(String name, double value) {
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
