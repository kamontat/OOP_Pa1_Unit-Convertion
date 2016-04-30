package com.kamontat.code.controller;

import com.kamontat.code.constant.UnitType;
import com.kamontat.code.unithouse.Unit;

/**
 * this is singleton of Unit factory
 * <p>
 * Created by kamontat on 29/4/59.
 */
public class UnitFactory {
	private static UnitFactory unitFactory;
	
	public static UnitFactory getInstance() {
		if (unitFactory == null) unitFactory = new UnitFactory();
		return unitFactory;
	}
	
	private UnitType[] getUnitTypes() {
		return UnitType.values();
	}
	
	private Unit[] getUnits(UnitType type) {
		return type.getUnits();
	}
}
