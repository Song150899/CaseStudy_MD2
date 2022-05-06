import Manage.QuanLyPhim;
import Manage.QuanLyPhongChieuPhim;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyPhim quanLyPhim = new QuanLyPhim();
        QuanLyPhongChieuPhim quanLyPhongChieuPhim = new QuanLyPhongChieuPhim();
        int choice = -1;
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. Đăng Nhập");
            System.out.println("2. Đăng Ký");
            System.out.println("Nhập vào lựa chọn");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Đăng Nhập");
                    break;
                case 2:
                    System.out.println("Đăng Ký");
                    System.out.println("Nhập Thông Tin");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Tên Đăng Nhập");
                    String tenDangNhap = scanner.nextLine();

                    System.out.println("Mật Khẩu");
                    String matKhau = scanner.nextLine();

                    break;
                case 0:
                    System.out.println("Tạm Biệt");
                    break;
            }
            System.out.println("===========================================================================================================================================");

        }
    }
}
