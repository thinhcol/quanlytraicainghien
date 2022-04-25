/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAnDAO;

import Entity.HoatDongCT;
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
public class HoatDongCTDAOTest {
    
    public HoatDongCTDAOTest() {
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
     * Test of insert method, of class HoatDongCTCTDAO.
     */
    @Test
    public void themThieuDuLieu() {
        HoatDongCT entity = new HoatDongCT();
        HoatDongCTDAO instance = new HoatDongCTDAO();
        instance.insert(entity);
    }
    @Test
    public void themSaiMaBN() {
        HoatDongCT entity = new HoatDongCT(1,1600, new Date(2000,1,1), "none");
        HoatDongCTDAO instance = new HoatDongCTDAO();
        instance.insert(entity);
    }
    @Test
    public void themSaiMaHD() {
        HoatDongCT entity = new HoatDongCT(1123,16, new Date(2000,1,1), "none");
        HoatDongCTDAO instance = new HoatDongCTDAO();
        instance.insert(entity);
    }

    @Test
    public void themThanhCong() {
        HoatDongCT entity = new HoatDongCT(16,16, new Date(2000,1,1), "none");
        HoatDongCTDAO instance = new HoatDongCTDAO();
        instance.insert(entity);
    }

    /**
     * Test of delete method, of class HoatDongCTDAO.
     */

    @Test
    public void xoaThanhCong() {
        HoatDongCTDAO instance = new HoatDongCTDAO();
        List<HoatDongCT> listDV = instance.selectAll();
        HoatDongCT dv = listDV.get(0);
        Integer key = dv.getMaHDCT();
        instance.delete(key);
    }
//
//    /**
//     * Test of update method, of class HoatDongCTDAO.
//     */

    @Test
    public void capNhatThieuDuLieu() {
        HoatDongCT entity = new HoatDongCT();
        HoatDongCTDAO instance = new HoatDongCTDAO();
        instance.update(entity);
    }
    @Test
    public void capNhatSaiMaBN() {
        HoatDongCT entity = new HoatDongCT(1,1,1600, new Date(2000,1,1), "none");
        HoatDongCTDAO instance = new HoatDongCTDAO();
        instance.update(entity);
    }
    @Test
    public void capNhatSaiMaHD() {
        HoatDongCT entity = new HoatDongCT(1,1123,16, new Date(2000,1,1), "none");
        HoatDongCTDAO instance = new HoatDongCTDAO();
        instance.update(entity);
    }
    @Test
    public void capNhatThanhCong() {
        HoatDongCT entity = new HoatDongCT(1,1,16, new Date(2000,1,1), "none");
        HoatDongCTDAO instance = new HoatDongCTDAO();
        instance.update(entity);
    }

    /**
     * Test of selectAll method, of class HoatDongCTCTDAO.
     */
//    @Test
//    public void testSelectAll() {
//        System.out.println("selectAll");
//        HoatDongCTCTDAO instance = new HoatDongCTCTDAO();
//        List<HoatDongCTCT> expResult = null;
//        List<HoatDongCTCT> result = instance.selectAll();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByID method, of class HoatDongCTCTDAO.
//     */
//    @Test
//    public void testSelectByID() {
//        System.out.println("selectByID");
//        Integer key = null;
//        HoatDongCTCTDAO instance = new HoatDongCTCTDAO();
//        HoatDongCTCT expResult = null;
//        HoatDongCTCT result = instance.selectByID(key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectBySql method, of class HoatDongCTCTDAO.
//     */
//    @Test
//    public void testSelectBySql() {
//        System.out.println("selectBySql");
//        String sql = "";
//        Object[] args = null;
//        HoatDongCTCTDAO instance = new HoatDongCTCTDAO();
//        List<HoatDongCTCT> expResult = null;
//        List<HoatDongCTCT> result = instance.selectBySql(sql, args);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByMaHD method, of class HoatDongCTCTDAO.
//     */
//    @Test
//    public void testSelectByMaHD() {
//        System.out.println("selectByMaHD");
//        Integer maHD = null;
//        HoatDongCTCTDAO instance = new HoatDongCTCTDAO();
//        List<HoatDongCTCT> expResult = null;
//        List<HoatDongCTCT> result = instance.selectByMaHD(maHD);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByMaBN1 method, of class HoatDongCTCTDAO.
//     */
//    @Test
//    public void testSelectByMaBN1() {
//        System.out.println("selectByMaBN1");
//        Integer maBN = null;
//        HoatDongCTCTDAO instance = new HoatDongCTCTDAO();
//        List<HoatDongCTCT> expResult = null;
//        List<HoatDongCTCT> result = instance.selectByMaBN1(maBN);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByMaBNAndHD method, of class HoatDongCTCTDAO.
//     */
//    @Test
//    public void testSelectByMaBNAndHD() {
//        System.out.println("selectByMaBNAndHD");
//        int maBN = 0;
//        int maHD = 0;
//        HoatDongCTCTDAO instance = new HoatDongCTCTDAO();
//        List<HoatDongCTCT> expResult = null;
//        List<HoatDongCTCT> result = instance.selectByMaBNAndHD(maBN, maHD);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByMaBN method, of class HoatDongCTCTDAO.
//     */
//    @Test
//    public void testSelectByMaBN() {
//        System.out.println("selectByMaBN");
//        Integer key = null;
//        HoatDongCTCTDAO instance = new HoatDongCTCTDAO();
//        List<HoatDongCTCT> expResult = null;
//        List<HoatDongCTCT> result = instance.selectByMaBN(key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
