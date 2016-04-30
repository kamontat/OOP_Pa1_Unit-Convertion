package com.kamontat.code.constant;

import com.kamontat.code.unithouse.*;

/**
 * all unit category in the program
 * <p>
 * Created by kamontat on 29/4/59.
 */
public enum UnitType {
	// all unit that this program have
	AREA("Area", AreaUnit.values()),
	LENGTH("Length", LengthUnit.values()),
	PRESSURE("Pressure", PressureUnit.values()),
	WEIGHT("Weight", WeightUnit.values());

	// name of this unit category
	private String name;
	// the units in this category
	private Unit[] units;

	// constructor
	UnitType(String name, Unit[] units) {
		this.name = name;
		this.units = units;
	}

	public String getName() {
		return name;
	}

	public Unit[] getUnits() {
		return units.clone();
	}

	/**
	 * return name of category and all unit on it.
	 *
	 * @return String
	 */
	public String toString() {
		String output = name + " with ";
		for (Unit u : units) {
			output += u.toString() + ", ";
		}
		// remove last ',' sign
		output.substring(0, output.length() - 2);
		return output;
	}
}
