package ba.bitcamp.museum;

public class Employee implements Searchable {
	// declaration of enum constants
	public enum Employment {
		DIRECTOR, SECRETARY, GUARD, GUIDE
	};

	// declaration of parameters
	private String name;
	private Employment employment;

	/**
	 * @param name
	 * @param gender
	 * @param employment
	 */
	public Employee(String name, Employment employment) {
		super();
		this.name = name;
		this.employment = employment;
	}

	/**
	 * toString for printing
	 */
	@Override
	public String toString() {
		// TODO insert gender too
		return name + ", " + employment + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employment == null) ? 0 : employment.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employment != other.employment)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * Fits search
	 * <p>
	 * This method should return true id forwarded string to this method is
	 * contained in any parameter
	 * @return - boolean value true if any parameter contains string, else returns false
	 */
	@Override
	public boolean fitsSearch(String s) {

		if (this.name.equals(s) || s.equals(employment.toString())) {
			return true;
		} else {
			return false;
		}
	}

}
