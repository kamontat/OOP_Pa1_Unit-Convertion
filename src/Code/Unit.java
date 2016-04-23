package Code;

/**
 * Interface of all Unit convert in this program
 * Created by kamontat on 23/4/59.
 */
public interface Unit {
	/**
	 * get <i>name</i> of the Unit and return back
	 *
	 * @return name of Unit
	 */
	public String getName();

	/**
	 * get <i>value</i> of the Unit compare with <i>default Unit</i> and return back
	 *
	 * @return value of Unit
	 */
	public double getValue();
}
