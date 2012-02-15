package citations;

import java.util.List;

import com.google.common.base.Joiner;

public class Citation {

	private final List<String> authors;
	private final String year;
	private final String desc;

	public Citation(List<String> authors, String year, String desc) {
		this.authors = authors;
		this.year = year;
		this.desc = desc;
	}

	public String firstAuthor(){
		return authors.get(0);
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	
	public String getYear() {
		return year;
	}
	
	public String getDesc() {
		return desc;
	}
	
	@Override
	public String toString() {
		return Joiner.on(", ").join(authors) + " " + "(" + year + ") " + desc;
	}

	public String secondAuthor() {
		return authors.get(1);
	}
}
