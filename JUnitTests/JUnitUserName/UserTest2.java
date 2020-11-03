package JUnitUserName;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Rule;
 
public class UserTest2 {
	//In JUnit 4.7 or above, you can test exception by using the @Rule annotation with an ExpectedException class
	
	
	@Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Test
    public void testUsernameIsNull() {
    	exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Username cannot be blank");
     
        User user = new User();
        user.setName(null);
    }
    
    @Test
    public void testUsernameTooShort() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Username is too short");
         
        User user = new User();
        user.setName("Jo");
    }
    
    @Test
    public void testUsernameTooLong() {    	
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Username is too long");
         
        User user = new User();
        user.setName("Pablo Diego Jose Franciso Picasso");

    }
    
    
}
