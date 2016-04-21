package Code;

/**
 * Created by kamontat on 21/4/59.
 */
public class UnitConverter {

	public UnitConverter() {
	}

	public double convert(double amount, Length from, Length to) {
		return (amount / from.getValue()) * to.getValue();
	}

	public void getUnit() {
		for (int i = 0; i < Length.values().length; i++) {
			System.out.print(Length.values()[i].getName() + " ");
		}
		System.out.println();
	}
}
