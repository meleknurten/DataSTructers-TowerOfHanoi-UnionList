/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
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
public class NurtenPart3Test {

    public NurtenPart3Test() {
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
     * Test of intersectionOfLists method, of class NurtenPart3.
     */
    @Test
    public void testIntersectionOfLists() {
        System.out.println("intersectionOfLists");
        NurtenPart3 instance = new NurtenPart3();
        List expResult = null;
        NurtenPart3 objec = new NurtenPart3(); // part3 test icin obje olusturdum
        int count = 0;
        objec.list1.add(1); // PART3 test için ilk listeyi doldurdum.
        objec.list1.add(5);
        objec.list1.add(2);
        objec.list1.add(3);

        objec.list2.add(1); // Part3 test için ikinci listeyi doldurdum. Ama recursıve metodda list2 size 0 oluyor.
        objec.list2.add(3); //Bu yüzden part3 teki her method için list2 yi tekrar dolduruyorum.
        objec.list2.add(7);
        objec.list2.add(5);

        System.out.println(objec.intersectionOfLists());
        List result = instance.intersectionOfLists();
       
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of unionOfLists method, of class NurtenPart3.
     */
    @Test
    public void testUnionOfLists() {
        System.out.println("unionOfLists");
        NurtenPart3 instance = new NurtenPart3();
        List expResult = null;
        NurtenPart3 objec = new NurtenPart3(); // part3 test icin obje olusturdum
        int count = 0;
        objec.list1.add(1); // PART3 test için ilk listeyi doldurdum.
        objec.list1.add(5);
        objec.list1.add(2);
        objec.list1.add(3);

        objec.list2.add(1); // Part3 test için ikinci listeyi doldurdum. Ama recursıve metodda list2 size 0 oluyor.
        objec.list2.add(3); //Bu yüzden part3 teki her method için list2 yi tekrar dolduruyorum.
        objec.list2.add(7);
        objec.list2.add(5);

        System.out.println(objec.unionOfLists());
        List result = instance.unionOfLists();
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isSubset method, of class NurtenPart3.
     */
    @Test
    public void testIsSubset() {
        System.out.println("isSubset");
        NurtenPart3 instance = new NurtenPart3();
        boolean expResult = false;
        NurtenPart3 objec = new NurtenPart3(); // part3 test icin obje olusturdum
        int count = 0;
        objec.list1.add(1); // PART3 test için ilk listeyi doldurdum.
        objec.list1.add(5);
        objec.list1.add(2);
        objec.list1.add(3);

        objec.list2.add(1); // Part3 test için ikinci listeyi doldurdum. Ama recursıve metodda list2 size 0 oluyor.
        objec.list2.add(3); //Bu yüzden part3 teki her method için list2 yi tekrar dolduruyorum.
        objec.list2.add(7);
        objec.list2.add(5);

        System.out.println(objec.isSubset());
        boolean result = instance.isSubset();
        
        // TODO review the generated test code and remove the default call to fail.
       
    }

}
