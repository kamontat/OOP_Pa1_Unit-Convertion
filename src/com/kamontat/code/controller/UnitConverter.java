package com.kamontat.code.controller;

import com.kamontat.code.constant.UnitType;
import com.kamontat.code.unithouse.Unit;

/**
 * Object to convert some unit to other unit.
 * <p>
 * Created by kamontat on 21/4/59.
 */
public class UnitConverter {
	UnitFactory factory = UnitFactory.getInstance();

	// constructor
	public UnitConverter() {
	}

	/**
	 * change <code>amount</code> <code>from</code> Unit to <code>to</code> Unit.
	 *
	 * @param amount
	 * 		the number to convertion
	 * @param from
	 * 		Unit that user want to <b>convert</b>
	 * @param to
	 * 		Unit that user want to <b>convert to</b>
	 * @return the amount number in <code>to</code> Unit
	 */
	public double convert(double amount, Unit from, Unit to) {
		return (amount / to.getValue()) * from.getValue();
	}

	/**
	 * get all unitType
	 *
	 * @return Unit type in array
	 */
	public UnitType[] getUnitTypes() {
		return factory.getUnitTypes();
	}

	/**
	 * get all unit in unitType
	 *
	 * @param type
	 * 		wanted type
	 * @return all unit in the type
	 */
	public Unit[] getUnits(UnitType type) {
		return factory.getUnits(type);
	}
}
