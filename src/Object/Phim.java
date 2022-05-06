package Object;

import java.util.Date;

public class Phim {
    int maPhim;
    String tenPhim;
    String hangSanXuat;
    Double giaVe;
    Date gioChieu;

    public Phim() {
    }

    public Phim(int maPhim, String tenPhim, String hangSanXuat, Double giaVe, Date gioChieu) {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.gioChieu = gioChieu;
    }

    public int getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(int maPhim) {
        this.maPhim = maPhim;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(Double giaVe) {
        this.giaVe = giaVe;
    }

    public Date getGioChieu() {
        return gioChieu;
    }

    public void setGioChieu(Date gioChieu) {
        this.gioChieu = gioChieu;
    }

    @Override
    public String toString() {
        return "Phim{" +
                "maPhim=" + maPhim +
                ", tenPhim='" + tenPhim + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", giaVe=" + giaVe +
                ", gioChieu=" + gioChieu +
                '}';
    }
}
