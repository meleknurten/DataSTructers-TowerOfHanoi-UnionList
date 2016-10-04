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
public class NewMainTest {

    public NewMainTest() {
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
     * Test of main method, of class NewMain.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of TowerOfHanoi method, of class NewMain.
     */
    @org.junit.Test
    public void testTowerOfHanoi() {
        System.out.println("TowerOfHanoi");
        int diskSize = 0;
        char src = 'M';
        char dst = 'L';
        char aux = 'K';
        NewMain object = new NewMain();
        System.out.print("3 Disk icin sonuc:");
        object.TowerOfHanoi(3, src, dst, aux);
        // TODO review the generated test code and remove the default call to fail.
        
    }

}
