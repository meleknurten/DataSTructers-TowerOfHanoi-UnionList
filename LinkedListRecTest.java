/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Melek Nurten YAVUZ <121044059>
 */
public class LinkedListRecTest {
    
    public LinkedListRecTest() {
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
     * Test of size method, of class LinkedListRec.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LinkedListRec instance = new LinkedListRec();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of toString method, of class LinkedListRec.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinkedListRec instance = new LinkedListRec();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of replace method, of class LinkedListRec.
     */
    @Test
    public void testReplace() {
        System.out.println("replace");
        Object oldObj = null;
        Object newObj = null;
        LinkedListRec instance = new LinkedListRec();
        instance.replace(oldObj, newObj);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of add method, of class LinkedListRec.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object data = null;
        LinkedListRec instance = new LinkedListRec();
        instance.add(data);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of remove method, of class LinkedListRec.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object outData = null;
        LinkedListRec instance = new LinkedListRec();
        boolean expResult = false;
         LinkedListRec lst = new LinkedListRec(); // listeyi dolduruyorum
         lst.add(1);
         lst.add(2);
         lst.add(2);
         lst.add(1);
         lst.add(3);
         lst.add(1);
        System.out.println("PART2 Test (lİSTENİN İLK HALİ:)");
         System.out.println(lst); // listenin eski hali.
         lst.remove(1); // listedeki 1 leri kaldırıyorum.
         System.out.println("PART2 Test (lİSTENİN SON HALİ:)");
         System.out.println(lst); // listenin yeni hali
        boolean result = instance.remove(1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
