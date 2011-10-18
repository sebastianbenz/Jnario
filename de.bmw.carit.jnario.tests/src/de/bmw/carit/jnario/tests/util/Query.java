package de.bmw.carit.jnario.tests.util;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class Query {

	private final Iterable<EObject> content;

	public Query(Iterable<EObject> content) {
		this.content = content;
	}

	public static Query query(Iterable<EObject> content) {
		return new Query(content);
	}

	public <T extends EObject> T find(String name, Class<T> type) {
		return Iterables.find(all(type), Predicates2.nameIs(name));
	}

	public <T> T first(Class<T> type) {
		return type.cast(all(type).iterator().next());
	}

	public EObject find(Predicate<EObject> predicate) {
		return Iterables.find(content, predicate);
	}

	public <T> Iterable<T> all(Class<T> type) {
		return Iterables.filter(content, type);
	}
}
