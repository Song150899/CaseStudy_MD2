package Object;

public class PhongChieuPhim {
    int soPhong;
    int soLuongGheXem;
    String trangThai;
    String tenPhim;

    public PhongChieuPhim() {
    }

    public PhongChieuPhim(int soPhong, int soLuongGheXem, String trangThai, String tenPhim) {
        this.soPhong = soPhong;
        this.soLuongGheXem = soLuongGheXem;
        this.trangThai = trangThai;
        this.tenPhim = tenPhim;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    public int getSoLuongGheXem() {
        return soLuongGheXem;
    }

    public void setSoLuongGheXem(int soLuongGheXem) {
        this.soLuongGheXem = soLuongGheXem;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    @Override
    public String toString() {
        return "PhongChieuPhim{" +
                "soPhong=" + soPhong +
                ", soLuongGheXem=" + soLuongGheXem +
                ", traiThai='" + trangThai + '\'' +
                ", tenPhim='" + tenPhim + '\'' +
                '}';
    }
}
