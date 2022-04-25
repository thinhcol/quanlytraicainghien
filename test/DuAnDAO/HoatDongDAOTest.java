/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAnDAO;

import Entity.HoatDong;
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
public class HoatDongDAOTest {
    
    public HoatDongDAOTest() {
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
     * Test of insert method, of class HoatDongDAO.
     */
    @Test
    public void themThieuDuLieu() {
        HoatDong entity = new HoatDong();
        HoatDongDAO instance = new HoatDongDAO();
        instance.insert(entity);
    }

    @Test
    public void themThanhCong() {
        HoatDong entity = new HoatDong("HoatDong1", "Mota1");
        HoatDongDAO instance = new HoatDongDAO();
        instance.insert(entity);
    }

    /**
     * Test of delete method, of class HoatDongDAO.
     */

    @Test
    public void xoaThanhCong() {
        HoatDongDAO instance = new HoatDongDAO();
        List<HoatDong> listDV = instance.select();
        HoatDong dv = listDV.get(0);
        Integer key = dv.getMaHoatDong();
        instance.delete(key);
    }
//
//    /**
//     * Test of update method, of class HoatDongDAO.
//     */

    @Test
    public void capNhatThieuDuLieu() {
        HoatDong entity = null;
        HoatDongDAO instance = new HoatDongDAO();
        instance.update(entity);
    }

    @Test
    public void capNhatThanhCong() {
        HoatDong entity = new HoatDong("HoatDong1", "Mota1");
        HoatDongDAO instance = new HoatDongDAO();
        instance.update(entity);
    }

    /**
     * Test of select method, of class HoatDongDAO.
     */
//    @Test
//    public void testSelect() {
//        System.out.println("select");
//        HoatDongDAO instance = new HoatDongDAO();
//        List<HoatDong> expResult = null;
//        List<HoatDong> result = instance.select();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findById method, of class HoatDongDAO.
//     */
//    @Test
//    public void testFindById() {
//        System.out.println("findById");
//        int id = 0;
//        HoatDongDAO instance = new HoatDongDAO();
//        HoatDong expResult = null;
//        HoatDong result = instance.findById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByKeyword method, of class HoatDongDAO.
//     */
//    @Test
//    public void testSelectByKeyword() {
//        System.out.println("selectByKeyword");
//        String keyword = "";
//        HoatDongDAO instance = new HoatDongDAO();
//        List<HoatDong> expResult = null;
//        List<HoatDong> result = instance.selectByKeyword(keyword);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of SelectBySQL method, of class HoatDongDAO.
//     */
//    @Test
//    public void testSelectBySQL() {
//        System.out.println("SelectBySQL");
//        String sql = "";
//        Object[] args = null;
//        HoatDongDAO instance = new HoatDongDAO();
//        List<HoatDong> expResult = null;
//        List<HoatDong> result = instance.SelectBySQL(sql, args);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
