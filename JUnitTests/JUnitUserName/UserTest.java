package JUnitUserName;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
 
public class UserTest {
    
    @Test
    public void testUsernameIsNull() {
     
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    User user = new User();
                    user.setName(null);
                }
        );
     
        assertEquals("Username cannot be blank", exception.getMessage());
    }
    
    @Test
    public void testUsernameTooShort() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    User user = new User();
                    user.setName("Jo");
                }
        );
     
        assertEquals("Username is too short", exception.getMessage());     
    }
    
    @Test
    public void testUsernameTooLong() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    User user = new User();
                    user.setName("Pablo Diego Jose Franciso Picasso");
                }
        );
     
        assertEquals("Username is too long", exception.getMessage());      
    }
    
    
}
