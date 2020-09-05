package level10;

public class Solution {
    public static void main(String[] args) {
        String str="Я не хочу изучать Java, я хочу большую зарплату";
        char[] strToChar=str.toCharArray();
        int count=0;
        int i=0;
        while (count<40) {
            for (i = 0 + count; i < strToChar.length; i++) {
                System.out.print(strToChar[i]);
            }
            System.out.println();
            count++;
        }
    }
}
