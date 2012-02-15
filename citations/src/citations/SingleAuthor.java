package citations;

public class SingleAuthor extends Reference {

	private final String name;

	public SingleAuthor(String year, String name) {
		super(year);
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + ", " + year;
	}

	@Override
	protected String firstAuthor() {
		return name;
	}
	
	@Override
	public boolean cites(Citation citation) {
		if(!super.cites(citation)){
			return false;
		}
		boolean result = citation.getAuthors().size() == 1 && citation.firstAuthor().equals(name);
		return result;
	}

}
