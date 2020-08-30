package level6;

public class Solution1 {
    public static void main(String[] args) {
        Solution1.printIdea(new Idea());
    }

    public static class Idea{
        public String getDescription(){
            return "Hello";
        }
    }
    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }
}
/* ошибка
class Test3{
    public static void main(String[] args){
        Solution1.printIdea();
    }
}

 */
