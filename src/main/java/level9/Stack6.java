package level9;

public class Stack6 {
    public static void main(String[] args) {
        stack();
    }
    public static void stack(){
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getClassName()+" : "+stackTraceElements[2].getMethodName());
    }
}
