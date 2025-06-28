import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    private User user;

    @Before
    public void setUp() {
        user = new User("john_doe", "secret123");
        System.out.println("User created");
    }

    @After
    public void tearDown() {
        user = null;
        System.out.println("User destroyed");
    }

    @Test
    public void testSuccessfulLogin() {
        String inputPassword = "secret123";
        boolean result = user.login(inputPassword);
        assertTrue(result);
        assertTrue(user.isLoggedIn());
    }

    @Test
    public void testFailedLogin() {
        String inputPassword = "wrongpass";
        boolean result = user.login(inputPassword);
        assertFalse(result);
        assertFalse(user.isLoggedIn());
    }

    @Test
    public void testLogout() {
        user.login("secret123");
        user.logout();
        assertFalse(user.isLoggedIn());
    }
}
