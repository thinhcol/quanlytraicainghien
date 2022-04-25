package Entity;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class HoatDongCT {
    private int maHDCT;
    private int maBN;
    private int maHD;
    private Date ngayThucHien;
    private String ghiChu;

    public HoatDongCT() {
    }

    public HoatDongCT(int maHDCT, int maBN, int maHD, Date ngayThucHien, String ghiChu) {
        this.maHDCT = maHDCT;
        this.maBN = maBN;
        this.maHD = maHD;
        this.ngayThucHien = ngayThucHien;
        this.ghiChu = ghiChu;
    }

    public HoatDongCT(int maBN, int maHD, Date ngayThucHien, String ghiChu) {
        this.maBN = maBN;
        this.maHD = maHD;
        this.ngayThucHien = ngayThucHien;
        this.ghiChu = ghiChu;
    }

    public int getMaHDCT() {
        return maHDCT;
    }

    public void setMaHDCT(int maHDCT) {
        this.maHDCT = maHDCT;
    }

    public int getMaBN() {
        return maBN;
    }

    public void setMaBN(int maBN) {
        this.maBN = maBN;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public Date getNgayThucHien() {
        return ngayThucHien;
    }

    public void setNgayThucHien(Date ngayThucHien) {
        this.ngayThucHien = ngayThucHien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}