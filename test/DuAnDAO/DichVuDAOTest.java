/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAnDAO;

import Entity.DichVu;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class DichVuDAOTest {

    public DichVuDAOTest() {
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
     * Test of insert method, of class DichVuDAO.
     */
    @Test
    public void themThieuDuLieu() {
        DichVu entity = new DichVu();
        DichVuDAO instance = new DichVuDAO();
        instance.insert(entity);
    }

    @Test
    public void themGiaAm() {
        DichVu entity = new DichVu("DichVu1", "Mota1", -100);
        DichVuDAO instance = new DichVuDAO();
        instance.insert(entity);
    }

    @Test
    public void themThanhCong() {
        DichVu entity = new DichVu("DichVu1", "Mota1", 100);
        DichVuDAO instance = new DichVuDAO();
        instance.insert(entity);
    }

    /**
     * Test of delete method, of class DichVuDAO.
     */
    @Test
    public void xoaThanhCong() {
        DichVuDAO instance = new DichVuDAO();
        List<DichVu> listDV = instance.selectAll();
        DichVu dv = listDV.get(0);
        Integer key = dv.getMaDV();
        instance.delete(key);
    }
//
//    /**
//     * Test of update method, of class DichVuDAO.
//     */

    @Test
    public void capNhatThieuDuLieu() {
        DichVu entity = null;
        DichVuDAO instance = new DichVuDAO();
        instance.update(entity);
    }

    @Test
    public void capNhatGiaAm() {
        DichVu entity = new DichVu("DichVu1", "Mota1", -100);
        DichVuDAO instance = new DichVuDAO();
        instance.update(entity);
    }

    @Test
    public void capNhatThanhCong() {
        DichVu entity = new DichVu("DichVu1", "Mota1", 100);
        DichVuDAO instance = new DichVuDAO();
        instance.update(entity);
    }

    /**
     * Test of selectAll method, of class DichVuDAO.
     */
//    @Test
//    public void testSelectAll() {
//        System.out.println("selectAll");
//        DichVuDAO instance = new DichVuDAO();
//        List<DichVu> expResult = null;
//        List<DichVu> result = instance.selectAll();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByID method, of class DichVuDAO.
//     */
//    @Test
//    public void testSelectByID() {
//        System.out.println("selectByID");
//        Integer key = null;
//        DichVuDAO instance = new DichVuDAO();
//        DichVu expResult = null;
//        DichVu result = instance.selectByID(key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectBySql method, of class DichVuDAO.
//     */
//    @Test
//    public void testSelectBySql() {
//        System.out.println("selectBySql");
//        String sql = "";
//        Object[] args = null;
//        DichVuDAO instance = new DichVuDAO();
//        List<DichVu> expResult = null;
//        List<DichVu> result = instance.selectBySql(sql, args);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByKeyword method, of class DichVuDAO.
//     */
//    @Test
//    public void testSelectByKeyword() {
//        System.out.println("selectByKeyword");
//        String keyword = "";
//        DichVuDAO instance = new DichVuDAO();
//        List<DichVu> expResult = null;
//        List<DichVu> result = instance.selectByKeyword(keyword);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
