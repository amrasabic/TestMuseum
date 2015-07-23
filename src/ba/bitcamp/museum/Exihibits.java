package ba.bitcamp.museum;

public abstract class Exihibits {
	
	// spoiler alert id not unique .. 
	protected Integer ID;
	// declaration of parameters
	protected String name;
	protected String descripiton;

	/**
	 * Constructor
	 * @param iD
	 * @param name
	 * @param descripiton
	 */
	public Exihibits(Integer ID, String name, String descripiton) {
		super();
		this.ID = ID;
		this.name = name;
		this.descripiton = descripiton;
	}

	/**
	 * toString for printing
	 */
	@Override
	public String toString() {
		return "ID " + ID + " " + name + "( " + descripiton + ")\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((descripiton == null) ? 0 : descripiton.hashCode());
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
		Exihibits other = (Exihibits) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (descripiton == null) {
			if (other.descripiton != null)
				return false;
		} else if (!descripiton.equals(other.descripiton))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
