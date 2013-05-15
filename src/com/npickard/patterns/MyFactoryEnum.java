/**
 * 
 */
package com.npickard.patterns;

/**
 * @author nigel
 *
 */
public enum MyFactoryEnum {
	INSTANCE;
	
	public MyClass createMyClass(){
		return new MyClass();
	}
}
