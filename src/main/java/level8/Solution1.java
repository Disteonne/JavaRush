package level8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution1 {
    public static void main(String[] args) {
    Set<Cat> cats=createCat();
    Set<Dog> dogs=createDog();
    Set<Object> objects=join(cats,dogs);
    //objects.clear();
    objects=removeCats(objects,cats );
    printPets(objects);
    }
    public static class Cat{

    }
    public static class Dog{

    }
    public static Set<Cat> createCat(){
        Cat cat=new Cat();
        Cat cat1=new Cat();
        Cat cat2=new Cat();
        Cat cat3=new Cat();
        Set<Cat> set=new HashSet<Cat>();
        set.add(cat);
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        return set;
    }
    public static Set<Dog> createDog(){
        Dog dog=new Dog();
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Set<Dog> set=new HashSet<Dog>();
        set.add(dog);
        set.add(dog1);
        set.add(dog2);
        return set;
    }
    public static Set<Object> join(Set<Cat> c,Set<Dog> d){
        Set<Object> set=new HashSet<Object>();
        set.addAll(c);
        set.addAll(d);
        //set.add(d);
        return set;
    }
    public static Set<Object> removeCats(Set<Object> s,Set<Cat> c) {
        /*
        Iterator<Object> iterator = s.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().getClass()==Cat.class)
            s.remove(iterator.next());
        }
         */
        s.removeAll(c);
        return s;
    }
    public static void printPets(Set<Object> s){
        for (Object obj:s
             ) {
            System.out.println(obj);
        }
        /*
        Iterator<Object> iterator=s.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

         */
    }
}
