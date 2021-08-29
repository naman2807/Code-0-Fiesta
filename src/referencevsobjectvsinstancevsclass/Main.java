package referencevsobjectvsinstancevsclass;

import java.util.Arrays;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: referencevsobjectvsinstancevsclass
 * Project Name: Code-0-Fiesta
 * Date: 29-08-2021
 */

public class Main {
    public static void main(String[] args) {
        Human ram = new Human(2,2,"Black");
        System.out.println(ram.hands());

        String[] list = new String[5];
        list[0] = "apple";
        list[1] = "banana";
        list[2] = "papaya";
        list[3] = "mango";
        list[4] = "orange";

        // Functional Programming and Lambda Expression
        Arrays.stream(list).forEach(System.out::println);

    }
}

//0x44rt
// ram -> instance
// ram -> 0x44rt

// 0x234