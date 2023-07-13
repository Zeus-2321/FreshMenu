import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // Creating a List and adding elements
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("List:");
        for (String item : list) {
            System.out.println("- " + item);
        }
        System.out.println();

        // Creating a Set and adding elements
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("Set:");
        for (Integer item : set) {
            System.out.println("- " + item);
        }
        System.out.println();

        // Creating a Queue and adding elements
        Queue<String> queue = new LinkedList<>();
        queue.add("John");
        queue.add("Alice");
        queue.add("Bob");
        System.out.println("Queue:");
        for (String item : queue) {
            System.out.println("- " + item);
        }
        System.out.println();

        // Creating a Map and adding key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);
        System.out.println("Map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();

        // Using utility methods from the Collections class
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        int[] array = { 5, 2, 8, 1, 9 };
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));

        // Iterating over elements using an Iterator
        Iterator<String> iterator = list.iterator();
        System.out.println("Elements:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("- " + element);
        }
    }
}
