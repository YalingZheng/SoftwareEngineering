package singletonDPpackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSingleton {
	
	@Test
	public void testEagerImpSingleton() {
		// SingletonGlobalSetting
		// Only getInstance() method is public and available to use
		EagerSingletonGlobalSettings gsEagerSingleton = EagerSingletonGlobalSettings.getInstance();
		System.out.println(gsEagerSingleton);
		for (int i=0; i<=9; i++) {
			EagerSingletonGlobalSettings gsnewEagerSingleton = EagerSingletonGlobalSettings.getInstance();			
			System.out.println(gsnewEagerSingleton);
			assertEquals(gsEagerSingleton, gsnewEagerSingleton);
//			if (gsEagerSingleton == gsnewEagerSingleton)
//				System.out.println("Same Eager Singleton Global Setting object");
//			else 
//				System.out.println("Different Eager Singleton Global Setting object");
		}
	}
	
	@Test
	public void testLazyImpSingleton() {
		
		// LazySingletonGlobalSetting
		// Only getInstance() method is public and available to use
		LazySingletonGlobalSettings gsLazySingleton = LazySingletonGlobalSettings.getInstance();
		System.out.println(gsLazySingleton);
		for (int i=0; i<=9; i++) {
			LazySingletonGlobalSettings gsnewLazySingleton = LazySingletonGlobalSettings.getInstance();			
			System.out.println(gsnewLazySingleton);
			assertEquals(gsLazySingleton, gsnewLazySingleton);
//			if (gsLazySingleton == gsnewLazySingleton)
//				System.out.println("Same Lazy Singleton Global Setting object");
//			else 
//				System.out.println("Different Lazy Singleton Global Setting object");	
		}
		
	}
	
	@Test
	public void testEagerImpSingletonClone() {
						
		//System.out.println();
		EagerSingletonGlobalSettings gs1Singleton = EagerSingletonGlobalSettings.getInstance();
		EagerSingletonGlobalSettings clonedSingleton = gs1Singleton.clone();
		assertEquals(clonedSingleton, null);
		//System.out.println("The cloned SingletonGlobalSettings is " + clonedSingleton);
	}
	
	@Test
	public void testLazyImpSingletonClone() {
		//System.out.println();
		LazySingletonGlobalSettings gs1LazySingleton = LazySingletonGlobalSettings.getInstance();
		LazySingletonGlobalSettings clonedLazySingleton = gs1LazySingleton.clone();
		//System.out.println("The cloned LazySingletonGlobalSettings is " + clonedLazySingleton);
		assertEquals(clonedLazySingleton, null);
		
	}
}
