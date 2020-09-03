package level9;

public class Stack1 {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
       method2();
       String str=Thread.currentThread().getStackTrace()[2].getMethodName();
       return str;
    }

    public static String method2() {
        method3();
        String str=Thread.currentThread().getStackTrace()[2].getMethodName();
        return str;
    }

    public static String method3() {
        method4();
        String str=Thread.currentThread().getStackTrace()[2].getMethodName();
        return str;
    }

    public static String method4() {
        method5();
        String str=Thread.currentThread().getStackTrace()[2].getMethodName();
        return str;

    }

    public static String method5() {
        String str=Thread.currentThread().getStackTrace()[2].getMethodName();
        return str;
    }

}
