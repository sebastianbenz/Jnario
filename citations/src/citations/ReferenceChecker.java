package citations;

import static com.google.common.collect.Lists.newArrayList;
import static org.eclipse.xtext.util.Files.writeStringIntoFile;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.xtext.util.Files;

public class ReferenceChecker {

	public void check(Set<Reference> references,
			List<Citation> citations) {
		List<Reference> found = newArrayList();
		List<Citation> referenced = newArrayList();
		for (Reference reference : references) {
			for (Citation citation : citations) {
				if(reference.cites(citation)){
					found.add(reference);
					referenced.add(citation);
					break;
				}
			}
		}
		
		references.removeAll(found);
		writeStringIntoFile("UnresolvedReferences.txt", print(references));

		citations.removeAll(referenced);
		writeStringIntoFile("UnusedCitations.txt", print(citations));
	}

	private String print(Iterable<?> references) {
		StringBuilder result = new StringBuilder();
		for (Object object : references) {
			result.append(object + "\r\n");
		}
		return result.toString();
	}

}
