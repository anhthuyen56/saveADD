package JdkProxyDemo;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DataDemo {
    public static void main(String[] args) {
        Date dte =new Date();
        SimpleDateFormat ft=new SimpleDateFormat("E: dd.MM.yyyy 'at:'hh:mm:ss zzz");
        System.out.println("giờ hiện tại: "+ft.format(dte));
    }
}
