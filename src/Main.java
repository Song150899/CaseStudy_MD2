import Manage.QuanLyPhim;
import Manage.QuanLyPhongChieuPhim;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dangNhap = new Scanner(System.in);
        QuanLyPhim quanLyPhim = new QuanLyPhim();
        QuanLyPhongChieuPhim quanLyPhongChieuPhim = new QuanLyPhongChieuPhim();
        int choice = -1;
        while (choice != 0) {
//            System.out.println(" Yêu cầu đăng nhập ");
//            choice = dangNhap.nextInt();

            System.out.println(" Tên đăng nhập");
            String taiKhoan = dangNhap.nextLine();

            System.out.println(" Mật Khẩu");
            String matKhau = dangNhap.nextLine();

            if (taiKhoan.equals(taiKhoan) && matKhau.equals(matKhau)) {

                if (taiKhoan.equals("Song") && (matKhau.equals("52Hz"))) {
                    System.out.println(" Đăng nhập thành công ");

                } else {
                    System.out.println(" Nhập lại Tài Khoản hoặc Mật Khẩu ");
                }

            }
        }
    }
}

