package de.bmw.carit.jnario.spec.doc;

import java.util.Collections;
import java.util.List;

public class FilteringResult {
	
	public static final FilteringResult EMPTY_RESULT = new FilteringResult("", Collections.<Filter>emptyList());
	
	private final String result;
	private final List<Filter> filters;

	public FilteringResult(String result, List<Filter> filters) {
		this.result = result;
		this.filters = filters;
	}
	
	public String getString() {
		return result;
	}
	
	public List<Filter> getFilters() {
		return filters;
	}

}
