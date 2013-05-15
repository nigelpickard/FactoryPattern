/**
 * 
 */
package com.npickard.patterns;

/**
 * @author nigel
 *
 */
public class StartApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		MyClass myClass = MyFactoryEnum.INSTANCE.createMyClass();
//		//System.out.println(myClass);
//		Object obj = MyFactoryEnumWithReflection.INSTANCE.initObject(ClassEnum.INSTANCE, new Class [] {int.class, String.class}, 0, "example");
//		System.out.println(obj.toString());
		System.out.println(MyFactoryEnumA.CAT.get().makeNoise());
	
	}

}
