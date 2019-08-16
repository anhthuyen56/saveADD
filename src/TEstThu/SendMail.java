package TEstThu;


import java.util.Properties;

public class SendMail {
    public static  void main(String[] args) {
        String to ="anhthuyen477@gmail.com";
        //mail nguwoif nhận
        String from="thuyenp@ttc-solutions.com";
        //mail của người gửi
        String host="LocalHost";
        Properties properties =System.getProperties();
        //lay các system properties
        properties.setProperty("mail.smtp.host",host);
        //thiết lập mail server
    }
}
