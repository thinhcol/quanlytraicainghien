/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;
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
public class BenhNhanTest {
    
    public BenhNhanTest() {
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
     * Test of toString method, of class BenhNhan.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BenhNhan instance = new BenhNhan();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaBN method, of class BenhNhan.
     */
    @Test
    public void testGetMaBN() {
        System.out.println("getMaBN");
        BenhNhan instance = new BenhNhan();
        int expResult = 0;
        int result = instance.getMaBN();
        System.out.print(instance.getMaBN());
        assertEquals(expResult, result);
        fail("Mã bệnh nhân không có dữ liệu bằng 0");
    }

    /**
     * Test of setMaBN method, of class BenhNhan.
     */
    @Test
    public void testSetMaBN() {
        int MaBN = 10;
        BenhNhan instance = new BenhNhan();
        instance.setMaBN(MaBN);
        assertEquals(instance, this);
       
    }

    /**
     * Test of getMaPhong method, of class BenhNhan.
     */
    @Test
    public void testGetMaPhong() {
        System.out.println("getMaPhong");
        BenhNhan instance = new BenhNhan();
        String expResult = null;
        String result = instance.getMaPhong();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setMaPhong method, of class BenhNhan.
     */
    @Test
    public void testSetMaPhong() {
        System.out.println("setMaPhong");
        BenhNhan instance = new BenhNhan();
        String ma = "kk";
        instance.setMaPhong(ma);
        String MaPhong = null;
        String kq = instance.getMaPhong();
        assertEquals(MaPhong, kq);
    }

    /**
     * Test of getMaNghe method, of class BenhNhan.
     */
    @Test
    public void testGetMaNghe() {
        System.out.println("getMaNghe");
        BenhNhan instance = new BenhNhan();
        int expResult = 0;
        int result = instance.getMaNghe();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setMaNghe method, of class BenhNhan.
     */
    @Test
    public void testSetMaNghe() {
        System.out.println("setMaNghe");
        int MaNghe = 60;
        BenhNhan instance = new BenhNhan();
        instance.setMaNghe(MaNghe);
        int Ma = 60;
        int kq = instance.getMaNghe();
    }

    /**
     * Test of getHoTen method, of class BenhNhan.
     */
    @Test
    public void testGetHoTen() {
        System.out.println("getHoTen");
        BenhNhan instance = new BenhNhan();
        String expResult = "Dang Phu Thinh";
        String result = instance.getHoTen();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHoTen method, of class BenhNhan.
     */
    @Test
    public void testSetHoTen() {
        System.out.println("setHoTen");
        String HoTen = "Dang Phu Thinh";
        BenhNhan instance = new BenhNhan();
        instance.setHoTen(HoTen);
        String name = "Dang Phu Thinh";
        assertEquals(instance.getHoTen(), name);
    }

    /**
     * Test of isGioiTinh method, of class BenhNhan.
     */
    @Test
    public void testIsGioiTinh() {
        System.out.println("isGioiTinh");
        BenhNhan instance = new BenhNhan();
        boolean result = instance.isGioiTinh();
        assertTrue(result);
        
    }

    /**
     * Test of setGioiTinh method, of class BenhNhan.
     */
    @Test
    public void testSetGioiTinh() {
        System.out.println("setGioiTinh");
        boolean GioiTinh = false;
        BenhNhan instance = new BenhNhan();
        instance.setGioiTinh(GioiTinh);
        assertFalse(instance.isGioiTinh());
     
    }

    /**
     * Test of getNgayVT method, of class BenhNhan.
     */
    @Test
    public void testGetNgayVT() {
        System.out.println("getNgayVT");
        BenhNhan instance = new BenhNhan();
        Date expResult = null;
        Date result = instance.getNgayVT();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setNgayVT method, of class BenhNhan.
     */
    @Test
    public void testSetNgayVT() {
        System.out.println("setNgayVT");
        Date NgayVT = null;
        BenhNhan instance = new BenhNhan();
        instance.setNgayVT(NgayVT);
    
    }

    /**
     * Test of getThoiGianO method, of class BenhNhan.
     */
    @Test
    public void testGetThoiGianO() {
        System.out.println("getThoiGianO");
        BenhNhan instance = new BenhNhan();
        int expResult = 0;
        int result = instance.getThoiGianO();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setThoiGianO method, of class BenhNhan.
     */
    @Test
    public void testSetThoiGianO() {
        System.out.println("setThoiGianO");
        int ThoiGianO = 0;
        BenhNhan instance = new BenhNhan();
        instance.setThoiGianO(ThoiGianO);
        
    }

    /**
     * Test of getDiaChi method, of class BenhNhan.
     */
    @Test
    public void testGetDiaChi() {
        System.out.println("getDiaChi");
        BenhNhan instance = new BenhNhan();
        String expResult = "";
        String result = instance.getDiaChi();
        assertEquals(expResult, result);
      
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetDiaChi() {
        System.out.println("setDiaChi");
        String DiaChi = "";
        BenhNhan instance = new BenhNhan();
        instance.setDiaChi(DiaChi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCMND method, of class BenhNhan.
     */
    @Test
    public void testGetCMND() {
        System.out.println("getCMND");
        BenhNhan instance = new BenhNhan();
        String expResult = "";
        String result = instance.getCMND();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCMND method, of class BenhNhan.
     */
    @Test
    public void testSetCMND() {
        System.out.println("setCMND");
        String CMND = "";
        BenhNhan instance = new BenhNhan();
        instance.setCMND(CMND);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHinh method, of class BenhNhan.
     */
    @Test
    public void testGetHinh() {
        System.out.println("getHinh");
        BenhNhan instance = new BenhNhan();
        String expResult = "";
        String result = instance.getHinh();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHinh method, of class BenhNhan.
     */
    @Test
    public void testSetHinh() {
        System.out.println("setHinh");
        String Hinh = "";
        BenhNhan instance = new BenhNhan();
        instance.setHinh(Hinh);
       
    }
    
}
