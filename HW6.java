package edu.neu.mgen;
import java.util.ArrayList;

// Part 1
public class HW6 {
    public static void main(String[] args) {
        int[] x = {1, 3, 5, 7, 9};
        int[] y = {2, 4, 6, 8, 10};
        int[] z = new int[5];

        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.println(arrayToString(z));
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("{ ");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(" }");
        return sb.toString();
    }
}

// Part 2

class Part2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Emma");
        names.add("Bob");
        names.add("Oliver");
        names.add("Andy");
        names.add("Evelyn");
        
        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            String switchedName = switchFirstAndLast(name);
            switchedNames.add(switchedName);
        }

        System.out.println("Names = { " + String.join(", ", names) + " }");
        System.out.println("Names (switched) = { " + String.join(", ", switchedNames) + " }");
    }

    private static String switchFirstAndLast(String name) {
        if (name.length() <= 1) {
            return name;
        }

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);

        String middle = name.substring(1, name.length() - 1);

        // Ensure the first character is uppercase and the rest are lowercase
        return Character.toUpperCase(lastChar) + middle + Character.toLowerCase(firstChar);
    }
}
