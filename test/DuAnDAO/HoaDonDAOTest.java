/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAnDAO;

import Entity.HoaDon;
import java.util.Date;
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
public class HoaDonDAOTest {
    
    public HoaDonDAOTest() {
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
     * Test of insert method, of class HoaDonDAO.
     */
    @Test
    public void themThieuSoThangTT() {
        HoaDon entity = new HoaDon();
        HoaDonDAO instance = new HoaDonDAO();
        instance.insert(entity);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void themThieuSo() {
        HoaDon entity = new HoaDon();
        HoaDonDAO instance = new HoaDonDAO();
        instance.insert(entity);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void themThanhCong() {
        HoaDon entity = new HoaDon(16,"NghiaPL",1,new Date(2012, 1, 1),new Date(2012, 1, 1),new Date(2012, 1, 1),12000);
        HoaDonDAO instance = new HoaDonDAO();
        instance.insert(entity);
    }
    /**
     * Test of selectAll method, of class HoaDonDAO.
     */
//    @Test
//    public void testSelectAll() {
//        System.out.println("selectAll");
//        HoaDonDAO instance = new HoaDonDAO();
//        List<HoaDon> expResult = null;
//        List<HoaDon> result = instance.selectAll();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of selectByID method, of class HoaDonDAO.
     */
//    @Test
//    public void testSelectByID() {
//        System.out.println("selectByID");
//        Integer key = null;
//        HoaDonDAO instance = new HoaDonDAO();
//        HoaDon expResult = null;
//        HoaDon result = instance.selectByID(key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of selectBySql method, of class HoaDonDAO.
     */
//    @Test
//    public void testSelectBySql() {
//        System.out.println("selectBySql");
//        String sql = "";
//        Object[] args = null;
//        HoaDonDAO instance = new HoaDonDAO();
//        List<HoaDon> expResult = null;
//        List<HoaDon> result = instance.selectBySql(sql, args);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of selectByMaBN method, of class HoaDonDAO.
     */
//    @Test
//    public void testSelectByMaBN() {
//        System.out.println("selectByMaBN");
//        Integer key = null;
//        HoaDonDAO instance = new HoaDonDAO();
//        List<HoaDon> expResult = null;
//        List<HoaDon> result = instance.selectByMaBN(key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
