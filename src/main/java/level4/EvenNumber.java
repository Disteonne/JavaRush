package level4;

public class EvenNumber {
    static void evNumb() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(+i);
            } else
                continue;
        }
    }
}
class Test12{
    public static void main(String[] args) {
        EvenNumber.evNumb();
    }
}