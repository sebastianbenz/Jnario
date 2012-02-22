/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.tests.util;

import static com.google.common.collect.Lists.newArrayList;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

import com.google.common.base.Function;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class ToStringWrapper<T> implements InvocationHandler {

	public static class ToStringWrapperBuilder<T> {

		private final T toWrap;

		public static <T> ToStringWrapperBuilder<T> toString(T toWrap) {
			return new ToStringWrapperBuilder<T>(toWrap);
		}

		protected ToStringWrapperBuilder(T toWrap) {
			this.toWrap = toWrap;
		}

		public T with(final String identifier) {
			return with(new ConstantToStringFunction<T>(identifier));
		}

		@SuppressWarnings("unchecked")
		public T with(ToStringFunction<T> toStringFunction) {
			Class<? extends Object> type = toWrap.getClass();
			List<Class<?>> interfaces = newArrayList();
			while (type != null) {
				for (Class<?> interf : type.getInterfaces()) {
					interfaces.add(interf);
				}
				type = type.getSuperclass();
			}
			Object proxy = Proxy.newProxyInstance(toWrap.getClass().getClassLoader(), interfaces.toArray(new Class[interfaces.size()]), new ToStringWrapper<T>(toWrap, toStringFunction));
			return (T) proxy;
		}
	}

	public interface ToStringFunction<T> {
		String describe(T toDescribe);
	}

	private final static class ConstantToStringFunction<T> implements ToStringFunction<T> {
		private final String identifier;

		private ConstantToStringFunction(String identifier) {
			this.identifier = identifier;
		}

		public String describe(T toDescribe) {
			return identifier;
		}
	}

	public static <T> ToStringWrapperBuilder<T> replaceToString(T toWrap) {
		return new ToStringWrapperBuilder<T>(toWrap);
	}

	public static <T> Function<T, T> replaceToString(final ToStringFunction<T> toStringFunction) {
		return new Function<T, T>() {

			public T apply(T from) {
				return replaceToString(from).with(toStringFunction);
			}
		};
	}

	private final T toWrap;
	private ToStringFunction<T> toStringFunction;

	private ToStringWrapper(T toWrap, ToStringFunction<T> toStringFunction) {
		this.toWrap = toWrap;
		this.toStringFunction = toStringFunction;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().equals("toString")) {
			return toStringFunction.describe(toWrap);
		} else {
			return method.invoke(toWrap, args);
		}
	}

}
