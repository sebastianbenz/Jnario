package citations;

import static com.google.common.collect.Lists.newArrayList;

import java.util.Arrays;
import java.util.List;

import com.google.common.base.Joiner;

public abstract class Reference implements Comparable<Reference>{

	protected String year;

	public Reference(String year) {
		this.year = year;
	}
	

	public int compareTo(Reference o) {
		return firstAuthor().compareTo(o.firstAuthor());
	}
	
	protected abstract String firstAuthor();


	public boolean cites(Citation citation){
		return citation.getYear().equals(year);
	}
	
	
}
