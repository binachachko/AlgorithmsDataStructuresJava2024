import java.util.ArrayList;
import java.util.Collections;

public class ColorsArray {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Task 1");
        System.out.println(colors);


        System.out.println("Task 2");
        for (String color : colors) {
            System.out.println(color + " color");
        }

        System.out.println("Task 3");
        colors.add(0, "Orange");
        System.out.println(colors);

        System.out.println("Task 4");
        System.out.println(colors.get(4));

        System.out.println("Task 5");
        colors.set(4, "Green");
        System.out.println(colors);

        System.out.println("Task 6");
        colors.remove(2);
        System.out.println(colors);

        System.out.println("Task 7");
        System.out.println(colors.contains("Brown"));

        System.out.println("Task 8");
        Collections.sort(colors);
        System.out.println(colors);

        System.out.println("Task 9");
        ArrayList<String> colors2;
        colors2 = colors;
        System.out.println(colors2);

        System.out.println("Task 10");
        System.out.println(colors2.reversed());

        System.out.println("Task 11");
        if (colors.equals(colors2)) {
            System.out.println("The two lists are equal.");
        } else {
            System.out.println("The two lists are not equal.");
        }

        System.out.println("Task 14");
        colors2.ensureCapacity(10);
        System.out.println(colors2);

        System.out.println("Task 15");
        colors2.trimToSize();
        System.out.println("ArrayList size after trimming: " + colors2.size());

        System.out.println("Task 12-13");
        colors2.clear();
        System.out.println(colors2.isEmpty());

    }
}

