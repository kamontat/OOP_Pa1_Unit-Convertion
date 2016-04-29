package Code;

import Constant.UnitType;
import UnitStoreHouse.Unit;

/**
 * this is singleton of Unit factory
 * <p>
 * Created by kamontat on 29/4/59.
 */
public class UnitFactory {
	private static UnitFactory unitFactory = new UnitFactory();
	
	public static UnitFactory getInstance() {
		return unitFactory;
	}
	
	private UnitType[] getUnitTypes() {
		return UnitType.values();
	}
	
	private Unit[] getUnits(UnitType type) {
		return type.getUnits();
	}
}
