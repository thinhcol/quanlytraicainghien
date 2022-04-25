/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAnDAO;

import Entity.Nghe;
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
public class NgheDAOTest {
    
    public NgheDAOTest() {
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
     * Test of insert method, of class NgheDAO.
     */
    @Test
    public void ThemNull() {
        System.out.println("insert");
        Nghe model = null;
        NgheDAO instance = new NgheDAO();
        instance.insert(model);
        
    }
     @Test
    public void ThemThieu() {
        System.out.println("insert");
        Nghe model = new Nghe();
        NgheDAO instance = new NgheDAO();
        instance.insert(model);
    }
     @Test
    public void ThemThanhCong() {
        System.out.println("insert");
        Nghe model = new Nghe("Sửa xe", "Sửa xe phục vụ lao động", "Lao động");
        NgheDAO instance = new NgheDAO();
        instance.insert(model);
    }

    /**
     * Test of update method, of class NgheDAO.
     */
    @Test
    public void CapNhatNull() {
        System.out.println("update");
        Nghe model = null;
        NgheDAO instance = new NgheDAO();
        instance.update(model);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void CapNhatThieu() {
        System.out.println("update");
        Nghe model = new Nghe();
        NgheDAO instance = new NgheDAO();
        instance.update(model);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void CapNhatThanhCong() {
        System.out.println("update");
        Nghe model = new Nghe(1,"Sửa xe", "Sửa xe phục vụ lao động", "Lao động");
        NgheDAO instance = new NgheDAO();
        instance.update(model);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of delete method, of class NgheDAO.
     */
    @Test
    public void XoaThanhCong() {
        System.out.println("delete");
        int id = 1;
        NgheDAO instance = new NgheDAO();
        instance.delete(id);
       
      
    }

    /**
     * Test of select method, of class NgheDAO.
     */ 
    @Test
    public void testSelect() {
        System.out.println("select");
        NgheDAO instance = new NgheDAO();
        List<Nghe> expResult = null;
        List<Nghe> result = instance.select();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of findById method, of class NgheDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        NgheDAO instance = new NgheDAO();
        Nghe expResult = null;
        Nghe result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of selectByKeyword method, of class NgheDAO.
     */
    @Test
    public void testSelectByKeyword() {
        System.out.println("selectByKeyword");
        String keyword = "";
        String keyword1 = "";
        String keyword2 = "";
        NgheDAO instance = new NgheDAO();
        List<Nghe> expResult = null;
        List<Nghe> result = instance.selectByKeyword(keyword, keyword1, keyword2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of SelectBySQL method, of class NgheDAO.
     */
    @Test
    public void testSelectBySQL() {
        System.out.println("SelectBySQL");
        String sql = "";
        Object[] args = null;
        NgheDAO instance = new NgheDAO();
        List<Nghe> expResult = null;
        List<Nghe> result = instance.SelectBySQL(sql, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
