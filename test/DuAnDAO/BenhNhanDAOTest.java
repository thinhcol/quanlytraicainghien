/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAnDAO;

import Entity.BenhNhan;
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
public class BenhNhanDAOTest {
    
    public BenhNhanDAOTest() {
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
     * Test of insert method, of class BenhNhanDAO.
     */
    @Test
    public void testInsertRong() {
        BenhNhan entity = null;
        BenhNhanDAO instance = new BenhNhanDAO();
        instance.insert(entity);
    }
    
    @Test
    public void testInsertThieu() {
        BenhNhan entity = new BenhNhan();
        BenhNhanDAO instance = new BenhNhanDAO();
        instance.insert(entity);
    }
    
    @Test
    public void testInsertOK() {
        BenhNhan entity = new BenhNhan("R101", 1, "Lê Minh Mẫn", true, null, 5, "Hai B Trung","372008705", "manlm.png");
        BenhNhanDAO instance = new BenhNhanDAO();
        instance.insert(entity);
    }
    

    /**
     * Test of delete method, of class BenhNhanDAO.
     */
    
    @Test
    public void testDeleteThieu() {
        int key = 0;
        if(key==0){
            fail();
        }
        else{
            BenhNhanDAO instance = new BenhNhanDAO();
            instance.delete(key);
        }
    }
    
    @Test
    public void testDeleteOK() {
        int key = 1;
        BenhNhanDAO instance = new BenhNhanDAO();
        instance.delete(key);
    }
//
//    /**
//     * Test of update method, of class BenhNhanDAO.
//     */
    @Test
    public void testUpdateRong() {
        BenhNhan entity = null;
        BenhNhanDAO instance = new BenhNhanDAO();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpdateThieu() {
        BenhNhan entity = new BenhNhan();
        BenhNhanDAO instance = new BenhNhanDAO();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
        @Test
    public void testUpdateOK() {
        BenhNhan entity = new BenhNhan("R101", 1, "Lê Minh Mẫn", true, null, 5, "Hai B Trung","372008705", "manlm.png");
        BenhNhanDAO instance = new BenhNhanDAO();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectAll method, of class BenhNhanDAO.
     */
    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        BenhNhanDAO instance = new BenhNhanDAO();
        List<BenhNhan> expResult = null;
        List<BenhNhan> result = instance.selectAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectByID method, of class BenhNhanDAO.
     */
    @Test
    public void testSelectByID() {
        System.out.println("selectByID");
        int key = 0;
        BenhNhanDAO instance = new BenhNhanDAO();
        BenhNhan expResult = null;
        BenhNhan result = instance.selectByID(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findlistById method, of class BenhNhanDAO.
     */
    @Test
    public void testFindlistById() {
        System.out.println("findlistById");
        int id = 0;
        BenhNhanDAO instance = new BenhNhanDAO();
        List<BenhNhan> expResult = null;
        List<BenhNhan> result = instance.findlistById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectByKeyword method, of class BenhNhanDAO.
     */
    @Test
    public void testSelectByKeyword() {
        System.out.println("selectByKeyword");
        String keyword = "";
        String keyword1 = "";
        String keyword2 = "";
        BenhNhanDAO instance = new BenhNhanDAO();
        List<BenhNhan> expResult = null;
        List<BenhNhan> result = instance.selectByKeyword(keyword, keyword1, keyword2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectBySql method, of class BenhNhanDAO.
     */
    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "";
        Object[] args = null;
        BenhNhanDAO instance = new BenhNhanDAO();
        List<BenhNhan> expResult = null;
        List<BenhNhan> result = instance.selectBySql(sql, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findlistByCMNDdau method, of class BenhNhanDAO.
     */
    @Test
    public void testFindlistByCMNDdau() {
        System.out.println("findlistByCMNDdau");
        String cmnd = "";
        BenhNhanDAO instance = new BenhNhanDAO();
        BenhNhan expResult = null;
        BenhNhan result = instance.findlistByCMNDdau(cmnd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findlistByCMNDcuoi method, of class BenhNhanDAO.
     */
    @Test
    public void testFindlistByCMNDcuoi() {
        System.out.println("findlistByCMNDcuoi");
        String cmnd = "";
        BenhNhanDAO instance = new BenhNhanDAO();
        BenhNhan expResult = null;
        BenhNhan result = instance.findlistByCMNDcuoi(cmnd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
