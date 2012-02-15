package citations;

import java.util.List;
import java.util.Set;

import org.eclipse.xtext.util.Files;

import com.google.common.base.Joiner;


public class Main {

	public static void main(String[] args) {
		String content = Files.readFileIntoString("text.txt");
		String citations = Files.readFileIntoString("citations.txt");
		Set<Reference> references = new ReferenceParser().parse(content); 
		
//		for (Reference reference : references) {
//			System.out.println(reference);
//		}
		
		List<Citation> parsedCitations = new CitationParser().parse(citations);
		new ReferenceChecker().check(references, parsedCitations);
	}
	
}
