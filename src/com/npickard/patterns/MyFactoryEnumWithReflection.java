package com.npickard.patterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public enum MyFactoryEnumWithReflection {
	INSTANCE;

	private static HashMap<ClassEnum, Class<?>> registeredClasses = new HashMap<ClassEnum, Class<?>>();

	public void registerClass(ClassEnum classEnum, Class<?> clazz) {
		registeredClasses.put(classEnum, clazz);
	}

	public Object initObject(ClassEnum classEnum, Class<?>[] clazzes,
			Object... objects) {

		try {
			Class<?> objectClass = registeredClasses.get(classEnum);
			Constructor<?> objectConstructor = objectClass.getDeclaredConstructor(clazzes);
			return objectConstructor.newInstance(objects);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}
