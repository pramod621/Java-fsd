package assistedPracticeProject1;

import java.util.*;
public class Collections {
    public static void main(String[] args) {
        testArrayList();
        testHashSet();
    }
    public static void testArrayList() {
        System.out.println("ArrayList:");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("cricket");
        arrayList.add("football");
        System.out.println("Elements in ArrayList:");
        for (String item : arrayList) {
            System.out.println(item);
        }
        boolean containsFootball = arrayList.contains("football");
        System.out.println("ArrayList contains 'football': " + containsFootball);
        arrayList.remove("football");
        System.out.println("Removed 'football' from ArrayList");
        System.out.println("Elements in ArrayList after removal:");
        for (String item : arrayList) {
            System.out.println(item);
        }
        System.out.println();
    }
    public static void testHashSet() {
        System.out.println("HashSet:");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        System.out.println("Elements in HashSet:");
        for (String item : hashSet) {
            System.out.println(item);
        }
        boolean containsGreen = hashSet.contains("Green");
        System.out.println("HashSet contains 'Green': " + containsGreen);
        hashSet.remove("Green");
        System.out.println("Removed 'Green' from HashSet");
        System.out.println("Elements in HashSet after removal:");
        for (String item : hashSet) {
            System.out.println(item);
        }
        System.out.println();
    }
}
