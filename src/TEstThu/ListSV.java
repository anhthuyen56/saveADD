package TEstThu;

//import com.sun.java.util.jar.pack;

import java.util.Scanner;

public class ListSV {
    public static void main(String[] args) {
        int Luachon,n;
        Student ST[]=null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("============MEnu=============");
        System.out.println( "1 Enter student information:");
        System.out.println("2 Student information ");
        System.out.println("3 Find studen by Points");
        System.out.println("4 Finish");

        //Luachon=Integer.parseInt(scanner.nextLine());
        //do while
        do{
            System.out.println( "Please choose");
            Luachon=scanner.nextInt();
            switch (Luachon) {
                case 1: {
                    System.out.println("=======INformation======");
                    System.out.println("Student salary:");
                    n=scanner.nextInt();
                    ST=new Student[n];
                    for (int i=0; i<n; i++){
                        System.out.println("Student Information "+(i+1));
                        ST[i]=new Student();
                        ST[i].NhapTT();
                    }
                    break;
                }
                case  2 :{
                    System.out.println("Student information");
                   System.out.printf("%-20s %-20s %-20s %-20s %-20s",  "SBD","Hoten","Diachi","MonHoc1","Monhoc2","d1","d2");
                    for (int i= 0; i<ST.length;i++){
                        ST[i].HienTHiTT();
                        System.out.println();
                    }
                    break;
                }
                case 3:{
                    double a; int b=0;
                    System.out.println("Enter the point you want to find:");
                    a= scanner.nextDouble();

                    System.out.printf("%-20s %-20s %-20s %-20s %-20s","SBD","Hoten","Diachi","MonHoc1","Monhoc2","d1","d2");
                    for(int i =0; i< ST.length; i++){
                        if(ST[i].getD1()==a){
                            ST[i].HienTHiTT();
                            b ++;
                        }
                    }
                    if(b==0){
                        System.out.println("Cannot find student");
                    }
                    break;
                }
            }
        }while (Luachon!=4);

    }


}
