package singletonDPpackage;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestGlobalSettings {
	@Test
	public void testMultipleObjects() {		
		// GlobalSettings
		GlobalSettings gs = new GlobalSettings();
		//System.out.println(gs);
		for (int i=0; i<=9; i++) {
			GlobalSettings gsnew = new GlobalSettings();			
			// System.out.println(gsnew);
			assertNotEquals(gs, gsnew);
//			if (gs == gsnew)
//				System.out.println("Same Global Setting object");
//			else 
//				System.out.println("Different Global Setting object");	
			
			/* In real projects, all subsystems share the same global settings,
			 * there is only one global setting object is needed. 
			 * 
			 * Similar examples is database connection pool. 
			 * We want only one database connection pool so that the connection pool can be managed.
			 * */
		}
	}
}
