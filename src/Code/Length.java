package Code;

/**
 * Created by kamontat on 21/4/59.
 */
public enum Length {
	METER("Meter", 1),
	WA("Wa", 2);

	private final String name;
	private final double value;

	private Length(String n, double v) {
		this.name = n;
		this.value = v;
	}

	public String getName() {
		return this.name;
	}

	public double getValue() {
		return this.value;
	}

	public String toString() {
		return "name=" + name + ", value=" + value;
	}
}
