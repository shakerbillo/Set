package com.shaker;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }
        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements. ");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }
        Set<String> words = new HashSet<>();
        String sentence = " the beautiful ones are not yet born";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words) {
            System.out.println(s);
        }
        Set<String> biblical = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] biblicalWords = {"to", "fear", "the", "Lord", "is", "the", "beginning", "of", "wisdom",};
        biblical.addAll(Arrays.asList(biblicalWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "is", "divine", "forgive" };
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("biblical - divine:");
        Set<String> diff1 = new HashSet<>(biblical);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - biblical:");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(biblical);
        printSet(diff2);

        Set<String> unionTest = new HashSet<>(biblical);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(biblical);
        intersectionTest.retainAll(divine);

        System.out.println("Symmetric difference");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        if(biblical.containsAll(divine)){
            System.out.println("divine is a subset of biblical");
        }
        if(biblical.containsAll(intersectionTest)){
            System.out.println("intersection is a subset of biblical");

    }
        if(divine.containsAll(intersectionTest)){
            System.out.println("intersection is a subset of divine");

        }
    }

    private static void printSet(Set<String> set) {
        System.out.println("\t");
        for (String s : set) {
            System.out.println(s + " ");
        }
        System.out.println();
    }


}

// Symmetric and Asymmetric

