package citations;

public class TwoAuthors extends Reference {

	private final String first;
	private final String second;

	public TwoAuthors(String year, String first, String second) {
		super(year);
		this.first = first;
		this.second = second;
	}
	
	@Override
	public String toString() {
		return first + " & " + second + ", " + year;
	}
	
	@Override
	protected String firstAuthor() {
		return first;
	}
	
	@Override
	public boolean cites(Citation citation) {
		if(!super.cites(citation)){
			return false;
		}
		boolean result = citation.getAuthors().size() == 2 
				&& citation.firstAuthor().equals(first) 
				&& citation.secondAuthor().equals(second);
		return result;
	}

}
