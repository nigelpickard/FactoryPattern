/**
 * 
 */
package com.npickard.patterns;

/**
 * @author nigel
 *
 */
public class MyFactory {
	private static MyFactory instance = null;
	
	private MyFactory(){
		
	}
	
	public static MyFactory getInstance(){
		synchronized(MyFactory.class){
			if (instance==null){
				instance = new MyFactory();
			}
			return instance;
		}	
	}
	
	public MyClass createMyClass(){
		return new MyClass();
	}
}
