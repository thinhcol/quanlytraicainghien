/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAnDAO;

import Entity.NhanVien;
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
public class NhanVienDAOTest {
    
    public NhanVienDAOTest() {
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
     * Test of insert method, of class NhanVienDAO.
     */
    @Test
    public void ThemNull() {
        System.out.println("insert");
        NhanVien model = null;
        NhanVienDAO instance = new NhanVienDAO();
        instance.insert(model);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void ThemThieu() {
        System.out.println("insert");
        NhanVien model = new NhanVien();
        NhanVienDAO instance = new NhanVienDAO();
        instance.insert(model);
        // TODO review the generated test code and remove the default call to fail.1
    }
    @Test
    public void ThemThanhCong() {
        System.out.println("insert");
        NhanVien model = new NhanVien("Manlm","Lương Minh Mẫn","123456",true,"manlmps18526@fpt.edu.vn","0123456789","man.png",true);
        NhanVienDAO instance = new NhanVienDAO();
        instance.insert(model);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of update method, of class NhanVienDAO.
     */
    @Test
    public void SuaNull() {
        System.out.println("update");
        NhanVien entity = null;
        NhanVienDAO instance = new NhanVienDAO();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void SuaThieu() {
        System.out.println("update");
        NhanVien entity = new NhanVien();
        NhanVienDAO instance = new NhanVienDAO();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void SuaThanhCong() {
        System.out.println("update");
        NhanVien entity = new NhanVien("Manlm","Lương Minh Mẫn","123456",true,"manlmps18526@fpt.edu.vn","0123456789","man.png",false);
        NhanVienDAO instance = new NhanVienDAO();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of delete method, of class NhanVienDAO.
     */
    @Test
    public void Xoa() {
        System.out.println("delete");
        String MaNV = "Manlm";
        NhanVienDAO instance = new NhanVienDAO();
        instance.delete(MaNV);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of selectEmailByID method, of class NhanVienDAO.
     */
    @Test
    public void testSelectEmailByID() {
        System.out.println("selectEmailByID");
        String id = "";
        NhanVienDAO instance = new NhanVienDAO();
        NhanVien expResult = null;
        NhanVien result = instance.selectEmailByID(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectSDTByID method, of class NhanVienDAO.
     */
    @Test
    public void testSelectSDTByID() {
        System.out.println("selectSDTByID");
        String id = "";
        NhanVienDAO instance = new NhanVienDAO();
        NhanVien expResult = null;
        NhanVien result = instance.selectSDTByID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of selectAll method, of class NhanVienDAO.
     */
    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        NhanVienDAO instance = new NhanVienDAO();
        List<NhanVien> expResult = null;
        List<NhanVien> result = instance.selectAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of selectByID method, of class NhanVienDAO.
     */
    @Test
    public void testSelectByID() {
        System.out.println("selectByID");
        String id = "";
        NhanVienDAO instance = new NhanVienDAO();
        NhanVien expResult = null;
        NhanVien result = instance.selectByID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of selectByKeyword method, of class NhanVienDAO.
     */
    @Test
    public void testSelectByKeyword() {
        System.out.println("selectByKeyword");
        String keyword = "";
        String keyword1 = "";
        String keyword2 = "";
        NhanVienDAO instance = new NhanVienDAO();
        List<NhanVien> expResult = null;
        List<NhanVien> result = instance.selectByKeyword(keyword, keyword1, keyword2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of selectBySql method, of class NhanVienDAO.
     */
    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "";
        Object[] args = null;
        NhanVienDAO instance = new NhanVienDAO();
        List<NhanVien> expResult = null;
        List<NhanVien> result = instance.selectBySql(sql, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
