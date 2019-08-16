package JdkProxyDemo;

import java.lang.reflect.*;
import java.lang.reflect.InvocationTargetException;
import  java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;
public class JdkProxyDemo {
    interface  If{
        void originalMethod(String s);
        }
        static  class  Original implements If{
        public  void  originalMethod(String s){
            System.out.println(s);
        }
    }
    static  class Handler implements InvocationHandler{
        private  final If original;
        public Handler(If origital){
            this.original=origital;
        }

    public Object invoke(Object proxy, Method method, Object[]args)
        throws IllegalAccessException, IllegalArgumentException,  InvocationTargetException {
        System.out.println("BEFORE");
        method.invoke(original, args);
        // method.invoke(origital, args);
        System.out.println("AFter");
        return null;
    }
    }
    public static void main(String[] args) {
        Original original =new Original();
        Handler handler =new Handler(original);
        If f =(If) Proxy.newProxyInstance(If.class.getClassLoader(),
        new Class[]{If.class},handler);
        f.originalMethod("hallo");
    }
}
