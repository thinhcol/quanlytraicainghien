/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAnDAO;

import Entity.LichSu;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class LichSuDAOTest {
    
    public LichSuDAOTest() {
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
     * Test of insert method, of class LichSuDAO.
     */
    @Test
    public void testInsert() {
        LichSu entity = null;
        LichSuDAO instance = new LichSuDAO();
        instance.insert(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class LichSuDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int key = 0;
        LichSuDAO instance = new LichSuDAO();
        instance.delete(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selctById method, of class LichSuDAO.
     */
    @Test
    public void testSelctById() {
        System.out.println("selctById");
        int id = 0;
        LichSuDAO instance = new LichSuDAO();
        List<LichSu> expResult = null;
        List<LichSu> result = instance.selctById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class LichSuDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        LichSu entity = null;
        int maBN = 0;
        LichSuDAO instance = new LichSuDAO();
        instance.update(entity, maBN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectAll method, of class LichSuDAO.
     */
    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        LichSuDAO instance = new LichSuDAO();
        List<LichSu> expResult = null;
        List<LichSu> result = instance.selectAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectByID method, of class LichSuDAO.
     */
    @Test
    public void testSelectByID() {
        System.out.println("selectByID");
        int key = 0;
        LichSuDAO instance = new LichSuDAO();
        LichSu expResult = null;
        LichSu result = instance.selectByID(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectBySql method, of class LichSuDAO.
     */
    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "";
        Object[] args = null;
        LichSuDAO instance = new LichSuDAO();
        List<LichSu> expResult = null;
        List<LichSu> result = instance.selectBySql(sql, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
