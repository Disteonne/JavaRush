package level9;

public class Stack5 {
    public static void main(String[] args) {
    int d=getStackTraceDepth();
    System.out.println(d);
    }
    public static int getStackTraceDepth(){
        StackTraceElement[] stack=Thread.currentThread().getStackTrace();
        int depth=stack.length;
        return depth;
    }
}
