/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAnDAO;

import Entity.Phong;
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
public class PhongDAOTest {
    
    public PhongDAOTest() {
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
     * Test of insert method, of class PhongDAO.
     */
//    @Test
//    public void testInsertRong() {
//        Phong model = null;
//        PhongDAO instance = new PhongDAO();
//        instance.insert(model);
//    }
//
//    @Test
//    public void testInsertThieu() {
//        Phong model = new Phong();
//        PhongDAO instance = new PhongDAO();
//        instance.insert(model);
//        // TODO review the generated test code and remove the default call to fail.
//    }
//    
//    @Test
//    public void testInsertOK() {
//        Phong model = new Phong(500000, "R601", "thienvd", "mandb.png");
//        PhongDAO instance = new PhongDAO();
//        instance.insert(model);
//        // TODO review the generated test code and remove the default call to fail.
//    }
    /**
     * Test of update method, of class PhongDAO.
     */
//    @Test
//    public void testUpdateRong() {
//        Phong model = null;
//        PhongDAO instance = new PhongDAO();
//        instance.update(model);
//    }
//    
//    @Test
//    public void testUpdateOK() {
//        Phong model = new Phong(600000, "R101", "thienvd", "thienvd.png");
//        PhongDAO instance = new PhongDAO();
//        instance.update(model);
//    }
//
//    /**
//     * Test of delete method, of class PhongDAO.
//     */
    @Test
    public void testDeleteKhongTonTai() {
        String id = "";
        if(id==""){
            fail();
        }
        else{
            PhongDAO instance = new PhongDAO();
            instance.delete(id);
        }
    }
    
    @Test
    public void testDeleteRong() {
//        String id = "";
//        PhongDAO instance = new PhongDAO();
//        instance.delete(id);
       String p = null;
       PhongDAO instance = new PhongDAO();
        instance.delete(p);
    }
    
    @Test
    public void testDeleteOK() {
//        String id = "";
//        PhongDAO instance = new PhongDAO();
//        instance.delete(id);
       String p = "R102";
       PhongDAO instance = new PhongDAO();
        instance.delete(p);
    }
//
//    /**
//     * Test of select method, of class PhongDAO.
//     */
//    @Test
//    public void testSelect() {
//        System.out.println("select");
//        PhongDAO instance = new PhongDAO();
//        List<Phong> expResult = null;
//        List<Phong> result = instance.select();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findById method, of class PhongDAO.
//     */
//    @Test
//    public void testFindById() {
//        System.out.println("findById");
//        String id = "";
//        PhongDAO instance = new PhongDAO();
//        Phong expResult = null;
//        Phong result = instance.findById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByID method, of class PhongDAO.
//     */
//    @Test
//    public void testSelectByID() {
//        System.out.println("selectByID");
//        String id = "";
//        PhongDAO instance = new PhongDAO();
//        Phong expResult = null;
//        Phong result = instance.selectByID(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByKeyword method, of class PhongDAO.
//     */
//    @Test
//    public void testSelectByKeyword() {
//        System.out.println("selectByKeyword");
//        String keyword = "";
//        String keyword1 = "";
//        String keyword2 = "";
//        PhongDAO instance = new PhongDAO();
//        List<Phong> expResult = null;
//        List<Phong> result = instance.selectByKeyword(keyword, keyword1, keyword2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of SelectBySQL method, of class PhongDAO.
//     */
//    @Test
//    public void testSelectBySQL() {
//        System.out.println("SelectBySQL");
//        String sql = "";
//        Object[] args = null;
//        PhongDAO instance = new PhongDAO();
//        List<Phong> expResult = null;
//        List<Phong> result = instance.SelectBySQL(sql, args);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
