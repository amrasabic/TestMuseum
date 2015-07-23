package ba.bitcamp.museum;

public class HistoricalArtifacts extends Exihibits implements Comparable<Exihibits>, Searchable{
	
	// declaration of enum constants
	public enum Period {
		CLASSICS, MIDDLE_AGES, MODERN_TIME
	};
	// declaration of parameters
	protected String origin;
	protected Period period;
	
	/**
	 * Constructor
	 * @param iD
	 * @param name
	 * @param descripiton
	 */
	public HistoricalArtifacts(Integer ID, String name, String descripiton, String origin, Period period) {
		super(ID, name, descripiton);
		this.origin = origin;
		this.period = period;
	}
	
	/**
	 * toString for printing
	 */
	@Override
	public String toString() {
		return origin + ". From period: " + period + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
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
		HistoricalArtifacts other = (HistoricalArtifacts) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
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
		
		String[] str = this.descripiton.split(" ");
		for (int i = 0; i < str.length; i++) {
			if(s.equals(str[i])){
				return true;
			}
		}
		
		if(this.name.equals(s) || this.origin.equals(s) || s.equals(period.toString())){
			return true;
		} else  {
		return false;
		}
	}
	
}
