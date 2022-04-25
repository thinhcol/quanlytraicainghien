/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAnDAO;

import Entity.BenhAn;
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
public class BenhAnDAOTest {
    
    public BenhAnDAOTest() {
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
     * Test of insert method, of class BenhAnDAO.
     */
    @Test
    public void testInsertRong() {
        BenhAn model = null;
        BenhAnDAO instance = new BenhAnDAO();
        instance.insert(model);
    }
    
    @Test
    public void testInsertThieu() {
        BenhAn model = new BenhAn();
        BenhAnDAO instance = new BenhAnDAO();
        instance.insert(model);
    }
    
    @Test
    public void testInsertOK() {
        BenhAn model = new BenhAn(80, "sốt", "thuốc", "tiền");
        BenhAnDAO instance = new BenhAnDAO();
        instance.insert(model);
    }

    /**
     * Test of update method, of class BenhAnDAO.
     */
    @Test
    public void testUpdateRong() {
        BenhAn model = null;
        BenhAnDAO instance = new BenhAnDAO();
        instance.update(model);

    }
    
    @Test
    public void testUpdateThieu() {
        BenhAn model = new BenhAn();
        BenhAnDAO instance = new BenhAnDAO();
        instance.update(model);

    }
    
    @Test
    public void testUpdateOK() {

        BenhAn model = new BenhAn(7, "nghiện", "tiền", null);
        BenhAnDAO instance = new BenhAnDAO();
        instance.update(model);
  
    }
    

    /**
     * Test of delete method, of class BenhAnDAO.
     */
    
    @Test
    public void testDeleteThieu() {
        int id = 0;
        if(id==0){
            fail();
        }
        else{
            BenhAnDAO instance = new BenhAnDAO();
            instance.delete(id);
        }
    }
    
    @Test
    public void testDeleteOK() {
        int id = 1;
        BenhAnDAO instance = new BenhAnDAO();
        instance.delete(id);
    }

    /**
     * Test of select method, of class BenhAnDAO.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        BenhAnDAO instance = new BenhAnDAO();
        List<BenhAn> expResult = null;
        List<BenhAn> result = instance.select();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class BenhAnDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        BenhAnDAO instance = new BenhAnDAO();
        BenhAn expResult = null;
        BenhAn result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findlistById method, of class BenhAnDAO.
     */
    @Test
    public void testFindlistById() {
        System.out.println("findlistById");
        int id = 0;
        BenhAnDAO instance = new BenhAnDAO();
        List<BenhAn> expResult = null;
        List<BenhAn> result = instance.findlistById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectByKeyword method, of class BenhAnDAO.
     */
    @Test
    public void testSelectByKeyword() {
        System.out.println("selectByKeyword");
        String keyword = "";
        String keyword1 = "";
        String keyword2 = "";
        BenhAnDAO instance = new BenhAnDAO();
        List<BenhAn> expResult = null;
        List<BenhAn> result = instance.selectByKeyword(keyword, keyword1, keyword2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SelectBySQL method, of class BenhAnDAO.
     */
    @Test
    public void testSelectBySQL() {
        System.out.println("SelectBySQL");
        String sql = "";
        Object[] args = null;
        BenhAnDAO instance = new BenhAnDAO();
        List<BenhAn> expResult = null;
        List<BenhAn> result = instance.SelectBySQL(sql, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
