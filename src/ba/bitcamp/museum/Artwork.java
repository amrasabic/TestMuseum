package ba.bitcamp.museum;

public class Artwork extends Exihibits implements Comparable<Exihibits>, Searchable {

	// declaration of enum constants
	public enum Period {
		RENAISSANCE, NEO, MODERN, CONTEMPORARY_ART
	};

	// declaration of parameters
	protected String autor;
	protected Period period;

	/**
	 * Constructor
	 * @param iD
	 * @param name
	 * @param descripiton
	 */
	public Artwork(Integer ID, String name, String descripiton, String autor, Period period) {
		super(ID, name, descripiton);
		this.autor = autor;
		this.period = period;
	}

	/**
	 * toString for printing
	 */
	@Override
	public String toString() {
		return "By: " + autor + "from period: " + period + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((period == null) ? 0 : period.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artwork other = (Artwork) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (period != other.period)
			return false;
		return true;
	}

	/**
	 * Compare
	 * <p>
	 * Compare using names
	 */
	@Override
	public int compareTo(Exihibits o) {
		return this.name.compareTo(o.name);
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

		try {
			int num = Integer.parseInt(s);
			if (num == this.ID) {
				return true;
			}
		} catch (NumberFormatException e) {
			// do nothing
		}

		if (this.name.equals(s) || this.autor.equals(s) || s.equals(period.toString())) {
			return true;
		} else if (this.descripiton.contains(s)) {
			return true;
		}

		return false;

	}

}
