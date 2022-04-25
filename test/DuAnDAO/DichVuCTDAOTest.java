/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAnDAO;

import Entity.DichVuCT;
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
public class DichVuCTDAOTest {
    
    public DichVuCTDAOTest() {
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
     * Test of insert method, of class DichVuCTDAO.
     */
    @Test
    public void themThieuDuLieu() {
        DichVuCT entity = new DichVuCT();
        DichVuCTDAO instance = new DichVuCTDAO();
        instance.insert(entity);
    } 
    @Test
    public void themSaiMaBN() {
        DichVuCT entity = new DichVuCT(1,16000, new Date(2000,1,1), "none");
        DichVuCTDAO instance = new DichVuCTDAO();
        instance.insert(entity);
    }
    @Test
    public void themSaiMaDV() {
        DichVuCT entity = new DichVuCT(1123,16, new Date(2000,1,1), "none");
        DichVuCTDAO instance = new DichVuCTDAO();
        instance.insert(entity);
    }

    @Test
    public void themThanhCong() {
        DichVuCT entity = new DichVuCT(16,16, new Date(2000,1,1), "none");
        DichVuCTDAO instance = new DichVuCTDAO();
        instance.insert(entity);
    }

    /**
     * Test of delete method, of class DichVuCTDAO.
     */

    @Test
    public void xoaThanhCong() {
        DichVuCTDAO instance = new DichVuCTDAO();
        List<DichVuCT> listDV = instance.selectAll();
        DichVuCT dv = listDV.get(0);
        Integer key = dv.getMaDVCT();
        instance.delete(key);
    }
//
//    /**
//     * Test of update method, of class DichVuCTDAO.
//     */

    @Test
    public void capNhatThieuDuLieu() {
        DichVuCT entity = new DichVuCT();
        DichVuCTDAO instance = new DichVuCTDAO();
        instance.update(entity);
    }
    @Test
    public void capNhatSaiMaBN() {
        DichVuCT entity = new DichVuCT(1,160, new Date(2000,1,1), "none");
        DichVuCTDAO instance = new DichVuCTDAO();
        instance.update(entity);
    }
    @Test
    public void capNhatSaiMaHD() {
        DichVuCT entity = new DichVuCT(123,16, new Date(2000,1,1), "none");
        DichVuCTDAO instance = new DichVuCTDAO();
        instance.update(entity);
    }

    /**
     * Test of selectAll method, of class DichVuCTDAO.
     */
//    @Test
//    public void testSelectAll() {
//        System.out.println("selectAll");
//        DichVuCTDAO instance = new DichVuCTDAO();
//        List<DichVuCT> expResult = null;
//        List<DichVuCT> result = instance.selectAll();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByID method, of class DichVuCTDAO.
//     */
//    @Test
//    public void testSelectByID() {
//        System.out.println("selectByID");
//        Integer key = null;
//        DichVuCTDAO instance = new DichVuCTDAO();
//        DichVuCT expResult = null;
//        DichVuCT result = instance.selectByID(key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByHD method, of class DichVuCTDAO.
//     */
//    @Test
//    public void testSelectByHD() {
//        System.out.println("selectByHD");
//        Integer key = null;
//        Date ngayBD = null;
//        Date ngayKT = null;
//        DichVuCTDAO instance = new DichVuCTDAO();
//        DichVuCT expResult = null;
//        DichVuCT result = instance.selectByHD(key, ngayBD, ngayKT);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findlistByBN method, of class DichVuCTDAO.
//     */
//    @Test
//    public void testFindlistByBN() {
//        System.out.println("findlistByBN");
//        int id = 0;
//        DichVuCTDAO instance = new DichVuCTDAO();
//        List<DichVuCT> expResult = null;
//        List<DichVuCT> result = instance.findlistByBN(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectBySql method, of class DichVuCTDAO.
//     */
//    @Test
//    public void testSelectBySql() {
//        System.out.println("selectBySql");
//        String sql = "";
//        Object[] args = null;
//        DichVuCTDAO instance = new DichVuCTDAO();
//        List<DichVuCT> expResult = null;
//        List<DichVuCT> result = instance.selectBySql(sql, args);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByMaBN method, of class DichVuCTDAO.
//     */
//    @Test
//    public void testSelectByMaBN() {
//        System.out.println("selectByMaBN");
//        Integer key = null;
//        DichVuCTDAO instance = new DichVuCTDAO();
//        List<DichVuCT> expResult = null;
//        List<DichVuCT> result = instance.selectByMaBN(key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByMaBNAndNgayDK method, of class DichVuCTDAO.
//     */
//    @Test
//    public void testSelectByMaBNAndNgayDK() {
//        System.out.println("selectByMaBNAndNgayDK");
//        Integer key = null;
//        Date ngayBD = null;
//        Date ngayKT = null;
//        DichVuCTDAO instance = new DichVuCTDAO();
//        List<DichVuCT> expResult = null;
//        List<DichVuCT> result = instance.selectByMaBNAndNgayDK(key, ngayBD, ngayKT);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByMaDV method, of class DichVuCTDAO.
//     */
//    @Test
//    public void testSelectByMaDV() {
//        System.out.println("selectByMaDV");
//        Integer maDV = null;
//        DichVuCTDAO instance = new DichVuCTDAO();
//        List<DichVuCT> expResult = null;
//        List<DichVuCT> result = instance.selectByMaDV(maDV);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of selectByMaBNAndDV method, of class DichVuCTDAO.
//     */
//    @Test
//    public void testSelectByMaBNAndDV() {
//        System.out.println("selectByMaBNAndDV");
//        int maBN = 0;
//        int maDV = 0;
//        DichVuCTDAO instance = new DichVuCTDAO();
//        List<DichVuCT> expResult = null;
//        List<DichVuCT> result = instance.selectByMaBNAndDV(maBN, maDV);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
