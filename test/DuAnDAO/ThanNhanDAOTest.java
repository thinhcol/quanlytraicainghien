/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAnDAO;

import Entity.ThanNhan;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class ThanNhanDAOTest {
    
    public ThanNhanDAOTest() {
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
     * Test of insert method, of class ThanNhanDAO.
     */
    @Test
    public void ThemNull() {
        System.out.println("insert");
        ThanNhan entity = null;
        ThanNhanDAO instance = new ThanNhanDAO();
        instance.insert(entity);
        // TODO review the generated test code and remove the default call to fail.
      
    }
     @Test
    public void ThemThieu() {
        System.out.println("insert");
        ThanNhan entity = new ThanNhan();
        ThanNhanDAO instance = new ThanNhanDAO();
        instance.insert(entity);
        // TODO review the generated test code and remove the default call to fail.
      
    }
     @Test
    public void ThemThanhCong() {
        System.out.println("insert");
        ThanNhan entity = new ThanNhan("TN01","456","Lương Sơn Bạc","thinhdp2002@gmail.com",6);
        ThanNhanDAO instance = new ThanNhanDAO();
        instance.insert(entity);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of delete method, of class ThanNhanDAO.
     */
    @Test
    public void Xoa() {
        System.out.println("delete");
        String key = "TN01";
        ThanNhanDAO instance = new ThanNhanDAO();
        instance.delete(key);
    }

    /**
     * Test of update method, of class ThanNhanDAO.
     */
    @Test
    public void SuaNull() {
        System.out.println("update");
        ThanNhan entity = null;
        ThanNhanDAO instance = new ThanNhanDAO();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void SuaThieu() {
        System.out.println("update");
        ThanNhan entity = new ThanNhan();
        ThanNhanDAO instance = new ThanNhanDAO();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void SuaThanhCong() {
        System.out.println("update");
        ThanNhan entity = new ThanNhan("TN06","456","Lương Sơn Bạc","thinhdp2002@gmail.com",6);
        ThanNhanDAO instance = new ThanNhanDAO();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of selectAll method, of class ThanNhanDAO.
     */
    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        ThanNhanDAO instance = new ThanNhanDAO();
        List<ThanNhan> expResult = null;
        List<ThanNhan> result = instance.selectAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of selectByID method, of class ThanNhanDAO.
     */
    @Test
    public void testSelectByID() {
        System.out.println("selectByID");
        String key = "";
        ThanNhanDAO instance = new ThanNhanDAO();
        ThanNhan expResult = null;
        ThanNhan result = instance.selectByID(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of selectBySql method, of class ThanNhanDAO.
     */
    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "";
        Object[] args = null;
        ThanNhanDAO instance = new ThanNhanDAO();
        List<ThanNhan> expResult = null;
        List<ThanNhan> result = instance.selectBySql(sql, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of selectEmailByID method, of class ThanNhanDAO.
     */
    @Test
    public void testSelectEmailByID() {
        System.out.println("selectEmailByID");
        String id = "";
        ThanNhanDAO instance = new ThanNhanDAO();
        ThanNhan expResult = null;
        ThanNhan result = instance.selectEmailByID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
