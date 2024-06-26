package data_structures;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
//        setDemo();
//            listDemo();
//        queueDemo();
        mapDemo();
    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.putIfAbsent("lemon", 17);

        fruitCalories.remove("lemon");

//        for(Map.Entry calorieInfo: fruitCalories.entrySet()) {
//            System.out.println(calorieInfo.getKey() + ": " + calorieInfo.getValue());
//        }


        fruitCalories.forEach((k, v) -> System.out.println(k + " : " + v));

//
//        System.out.println(fruitCalories);
//        System.out.println("banana calories: " + fruitCalories.get("banana"));
//
//        System.out.println("contains orange? " + fruitCalories.containsKey("orange"));
    }

    public static void queueDemo() {
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        var removed = fruits.remove();

        System.out.println("removed: " + removed);

        System.out.println("head of queue: " + fruits.peek() );

        System.out.println(fruits);

        Map immutableFruitCalories = Map.of(
                "apple", 95,
                "lemon", 20
        );
    }

    public static void  listDemo() {
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.set(2, "grape");
        fruits.add("lemon");
//        fruits.remove("lemon"); // removes first found
//        fruits.remove(3);

//        for (String fruit: fruits) {
//            System.out.println(fruit);
//        }


        fruits.forEach( f -> System.out.println(f));

//        System.out.println(fruits);
//
//        System.out.println("index 2: " + fruits.get(2));
//        System.out.println("index of grape: " + fruits.indexOf("grape"));
//
//        System.out.println("last index of lemons: " + fruits.lastIndexOf("lemon"));
//
//        List moreFruit = List.of("cherry", "plum"); // immutable

    }

    public static void setDemo() {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        var i = fruits.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println(fruits);

        fruits.remove("lemon");
        System.out.println("contains lemon? " + fruits.contains("lemon"));

        System.out.println("size? " + fruits.size());

        Set moreFruit = Set.of("pear", "raising", "cherry");
//        moreFruit.add("cranberry");
//        System.out.println(moreFruit);



    }
}
