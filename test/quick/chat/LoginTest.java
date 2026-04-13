/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package quick.chat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckusername() {
        System.out.println("checkusername");
        String Username = "Kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkusername(Username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkPassword method, of class Login.
     */
    @Test
    public void testCheckpassword() {
        System.out.println("checkpassword");
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkpassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellPhone method, of class Login.
     */
    @Test
    public void testCheckcellphone() {
        System.out.println("checkcellphone");
        String cellphone = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkcellphone(cellphone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LogInUser method, of class Login.
     */
    @Test
    public void testLogInUser() {
        System.out.println("LogInUser");
        String username = "";
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.LogInUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String username = "";
        String password = "";
        String firstname = "";
        String lastname = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(username, password, firstname, lastname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
