package JdkProxyDemo;

public class inheritance {
    public static void main(String[] args) {
        String []names =new String[]{"A ","B","C"};
        String [] extened =new String[6];
        extened[3]="D";
        extened[4]="E";
        extened[5]="F";
        System.arraycopy(names,0,extened,0,names.length);
        for(String srt :extened){
            System.out.println(srt);
        }

    }
}
