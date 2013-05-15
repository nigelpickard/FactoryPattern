package com.npickard.patterns;

import java.util.HashMap;
import java.util.Map;

import com.npickard.patterns.animals.Animal;
import com.npickard.patterns.animals.Cat;
import com.npickard.patterns.animals.Dog;
import com.npickard.patterns.animals.Rabbit;

public enum MyFactoryEnumA {
	CAT("Cat") {
		Animal get() {			
			return new Cat();
		}
	},
	DOG("Dog") {
		Animal get() {
			return new Dog();
		}
	},
	RABBIT("Rabbit") {
		Animal get() {
			return new Rabbit();
		}
	};

	private static final Map<String, MyFactoryEnumA> animalsMap = new HashMap<String, MyFactoryEnumA>();

	static {
		for (MyFactoryEnumA myFactoryEnumA : values()){
			animalsMap.put(myFactoryEnumA.toString(), myFactoryEnumA);
		}
	}
	
	private MyFactoryEnumA(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public static MyFactoryEnumA fromString(String name) {
		return animalsMap.get(name);
	}

	abstract Animal get();

	private String name;

}
