package citations;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReferenceParser {

	private static final Pattern REFERENCES = Pattern.compile("\\((.*?)\\)",Pattern.DOTALL);
	Set<Reference> result = new TreeSet<Reference>();
	
	public Set<Reference> parse(String content) {
		Matcher matcher = REFERENCES.matcher(content);
		while(matcher.find()){
			String text = matcher.group(1);
			String[] fragments = text.split(";");
			for (String fragment : fragments) {
				if(fragment.contains(",")){
					parseReference(fragment.trim());
				}
			}
		}
		return result;
	}

	private void parseReference(String fragment) {
		fragment = fragment.replaceAll("modified after", "").trim();
		String[] elements = fragment.split(",");
		String names = elements[0];
		String year = elements[1].trim();
		if(!Character.isDigit(year.charAt(0))){
			return;
		}
		if(names.contains("&")){
			String[] n = names.split("&");
			String firstName = n[0].trim();
			String secondName = n[1].trim();
			add(new TwoAuthors(year, firstName, secondName));
			return;
		}
		if(names.contains("et al")){
			names = names.replaceAll("et al\\.?", "").trim();
			add(new EtAlReference(year, names));
			return;
		}
		add(new SingleAuthor(year, names));
	}

	private void add(Reference reference) {
//		System.out.println(reference);
		result.add(reference);
	}

}
