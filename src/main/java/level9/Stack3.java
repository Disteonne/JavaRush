package level9;

public class Stack3 {
    public static void main(String[] args) {
    method1();
    }
    public static int method1(){
        method2();
        String str1=Thread.currentThread().getStackTrace()[1].getMethodName(); //название данного метода. Индекс 1.
        // индекс 0- main
        String str2=Thread.currentThread().getStackTrace()[2].getMethodName();// название метода.который вызывает этот метод
        int n=Thread.currentThread().getStackTrace()[2].getLineNumber();// длина названия метода.который вызывает данный метод
        return n;
    }
    public static int method2(){
        method3();
        String str1=Thread.currentThread().getStackTrace()[1].getMethodName(); //название данного метода. Индекс 1.
        // индекс 0- main
        String str2=Thread.currentThread().getStackTrace()[2].getMethodName();// название метода.который вызывает этот метод
        int n=Thread.currentThread().getStackTrace()[2].getLineNumber();// длина названия метода.который вызывает данный метод
        return n;
    }
    public static int method3(){
        method4();
        String str1=Thread.currentThread().getStackTrace()[1].getMethodName(); //название данного метода. Индекс 1.
        // индекс 0- main
        String str2=Thread.currentThread().getStackTrace()[2].getMethodName();// название метода.который вызывает этот метод
        int n=Thread.currentThread().getStackTrace()[2].getLineNumber();// длина названия метода.который вызывает данный метод
        return n;
    }
    public static int method4(){
        method5();
        String str1=Thread.currentThread().getStackTrace()[1].getMethodName(); //название данного метода. Индекс 1.
        // индекс 0- main
        String str2=Thread.currentThread().getStackTrace()[2].getMethodName();// название метода.который вызывает этот метод
        int n=Thread.currentThread().getStackTrace()[2].getLineNumber();// длина названия метода.который вызывает данный метод
        return n;
    }
    public static int method5(){
        String str1=Thread.currentThread().getStackTrace()[1].getMethodName(); //название данного метода. Индекс 1.
        // индекс 0- main
        String str2=Thread.currentThread().getStackTrace()[2].getMethodName();// название метода.который вызывает этот метод
        int n=Thread.currentThread().getStackTrace()[1].getLineNumber();// длина названия метода
        return n;
    }
}
