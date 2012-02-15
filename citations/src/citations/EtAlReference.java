package citations;

import static com.google.common.collect.Lists.newArrayList;

public class EtAlReference extends Reference {

	private String name;

	public EtAlReference(String year, String name) {
		super(year);
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + " et al., " + year;
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
		boolean result = citation.getAuthors().size() > 2 && citation.firstAuthor().equals(name);
		return result;
	}
}
