package JdkProxyDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIPA {
    public static void main(String[] args) {
        InetAddress ip;
        String HostName;
        try{
            ip=InetAddress.getLocalHost();
            HostName =ip.getHostName();
            System.out.println("your current  IP address: "+ip);
            System.out.println("your current HostName +:" +HostName);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
