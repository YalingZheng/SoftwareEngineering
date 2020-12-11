package singletonDPpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testStaticGlobalSetting {

	@Test
	void testVisibility() {
		
		//System.out.println();		
		// StaticGlobalSettings have a private constructor
		// cannot instantiate an object
		 StaticGlobalSettings gs1StaticSingleton = new StaticGlobalSettings(); // The constructor StaticGlobalSettings() is not visible
		// No Clone method provided.
	}
}
