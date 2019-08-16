package TEstThu;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Student {

    private  String Hoten;
    private String SBD;
    private  String Diachi, MonHoc1 , Monhoc2;
    private double d1 , d2;

    public Student() {
    }

    public Student(String hoten, String SBD, String diachi, String monHoc1,String monhoc2, double d1, double d2) {
        Hoten = hoten;
        this.SBD = SBD;
        Diachi = diachi;
        MonHoc1 = monHoc1;
        Monhoc2 = Monhoc2;

        this.d1 = d1;
        this.d2 = d2;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getSBD() {
        return SBD;
    }

    public void setSBD(String SBD) {
        this.SBD = SBD;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public String getMonHoc1() {
        return MonHoc1;
    }

    public void setMonHoc1(String monHoc1) {
        MonHoc1 = MonHoc1;
    }
    public String getMonHoc2() {
        return Monhoc2;
    }
    public void setMonHoc2(String monHoc2) {
        Monhoc2 = Monhoc2;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }
    void NhapTT(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap TT SBD");
        SBD=scanner.nextLine();
        System.out.println("moi ban nhap ten Sv");
        Hoten=scanner.nextLine();
        System.out.println("moi ban nhap dia chi:");
        Diachi=scanner.nextLine();
        System.out.println("moi ban nhap mon hoc1:");
        MonHoc1=scanner.nextLine();
        System.out.println("moi banh nhap diem mon 1:");
        d1=Double.parseDouble(scanner.nextLine());
        System.out.println("moi ban nhap mon hoc 2:");
        Monhoc2= scanner.nextLine();
        System.out.println("moi ban nhap diem mon 2:");
        d2=Double.parseDouble(scanner.nextLine());
    }
    void  HienTHiTT(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s "+
                SBD,Hoten,Diachi,MonHoc1,Monhoc2, d1,d2);


    }
}
