package citations;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.Joiner;
import com.google.common.base.Predicate;

public class CitationParser {
	
	private static final Pattern YEAR = Pattern.compile("\\((\\d\\d\\d\\d)\\)");
	
	private List<Citation> result = newArrayList();

	public List<Citation> parse(String citations) {
		Iterable<String> lines = asList(citations.split("\r?\n"));
		lines = filterNonCitations(lines);
		for (String line : lines) {
			List<String> authors = parseAuthors(line);
			if(!authors.isEmpty()){
				result.add(new Citation(authors, parseYear(line), line.substring(line.indexOf(')')+1)));
			}
		}
		return result;
	}

	private List<String> parseAuthors(String line) {
		int yearIndex = line.indexOf('(');
		line = line.substring(0, yearIndex);
		line = line.replaceAll("and", ",").replaceAll("&", ",").replaceAll("[A-Z]\\.", "");
		String[] authors = line.split(",");
		boolean lastName = true;
		List<String> names = newArrayList();
		for (String author : authors) {
			if(lastName){
				String authorName = author.trim();
				if(authorName.length() > 0){
					names.add(authorName);
				}
			}
			lastName = !lastName;
		}
		return names;
	}

	protected String parseYear(String line) {
		Matcher matcher = YEAR.matcher(line);
		matcher.find();
		String year = matcher.group(1);
		return year;
	}

	private Iterable<String> filterNonCitations(Iterable<String> lines) {
		return filter(lines, new Predicate<String>() {

			public boolean apply(String input) {
				if(input.trim().length() == 0){
					return false;
				}
				if(!YEAR.matcher(input).find()){
					return false;
				}
				return true;
			}
		});
	}

}
