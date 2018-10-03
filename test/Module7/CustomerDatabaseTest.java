/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module7;

import Module07.Customer;
import Module07.CustomerDatabase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolai Gram
 */
public class CustomerDatabaseTest {
    
    public CustomerDatabaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addCustomer method, of class CustomerDatabase.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        Customer c = null;
        CustomerDatabase instance = new CustomerDatabase();
        instance.addCustomer(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCustomer method, of class CustomerDatabase.
     */
    @Test
    public void testRemoveCustomer() {
        System.out.println("removeCustomer");
        int pos = 0;
        CustomerDatabase instance = new CustomerDatabase();
        instance.removeCustomer(pos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomers method, of class CustomerDatabase.
     */
    @Test
    public void testGetCustomers() {
        System.out.println("getCustomers");
        CustomerDatabase instance = new CustomerDatabase();
        Customer[] expResult = null;
        Customer[] result = instance.getCustomers();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printCustomers method, of class CustomerDatabase.
     */
    @Test
    public void testPrintCustomers() {
        System.out.println("printCustomers");
        CustomerDatabase instance = new CustomerDatabase();
        instance.printCustomers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
