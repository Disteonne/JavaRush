package level9;

public class Stack4 {
    public static void main(String[] args) {
        int stack= method1().length- method9().length+1;
    }
    public static StackTraceElement[] method1(){
        return method2();
    }
    public static StackTraceElement[] method2(){
        return method3();
    }
    public static StackTraceElement[] method3(){
        return method4();
    }
    public static StackTraceElement[] method4(){
        return method5();
    }
    public static StackTraceElement[] method5(){
        return method6();
    }
    public static StackTraceElement[] method6(){
        return method7();
    }
    public static StackTraceElement[] method7(){
        return method8();
    }
    public static StackTraceElement[] method8(){
        return method9();
    }
    public static StackTraceElement[] method9(){
        return Thread.currentThread().getStackTrace();
    }

}
