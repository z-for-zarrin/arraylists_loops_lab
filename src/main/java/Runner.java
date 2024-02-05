import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list

        System.out.println("--------SCOTTISH ISLANDS--------");

        scottishIslands.add("Coll");
//        System.out.println(scottishIslands);


//        2. Add "Tiree" to the start of the list

        scottishIslands.add(0, "Tiree");


//        3. Add "Islay" after "Jura" and before "Mull"

        scottishIslands.add(2, "Islay");


//        4. Print out the index position of "Skye"

        int skyeIndex = scottishIslands.indexOf("Skye");
        System.out.println("Index of 'Skye': "+skyeIndex);


//        5. Remove "Tresco" from the list by name

        scottishIslands.remove("Tresco");


//        6. Remove "Arran" from the list by index

        scottishIslands.remove(5);


//        7. Print the number of islands in your arraylist

        System.out.println("Size of ArrayList: "+scottishIslands.size());


//        8. Sort the list alphabetically

        Collections.sort(scottishIslands);


//        9. Print out all the islands using a for loop

        System.out.println("Islands in alphabetical order:");
        for(String island : scottishIslands) {
            System.out.println(island);
        }

        System.out.println(scottishIslands);



//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("--------NUMBERS--------");
        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers

        System.out.println("Even numbers in list:");
        for (int number : numbers){
            if(number % 2 == 0){
                System.out.println(number);
            }
        }


//        2. Print the difference between the largest and smallest value

//        Approach using for loop

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int number : numbers) {
            if(number > largest) {
                largest = number;
            }
            if(number < smallest) {
                smallest = number;
            }
        }

        int range = largest - smallest;
        System.out.println("list range (for loop): "+range);

//        Alternative approach using Collections methods

        largest = Collections.max(numbers);
        smallest = Collections.min(numbers);

        range = largest - smallest;

        System.out.println("list range (Collections methods): "+range);


//        3. Print True if the list contains a 1 next to a 1 somewhere.

        boolean consecutiveOnes = false;

        List<Integer> subList = new ArrayList<>();
        Collections.addAll(subList, 1, 1);

        if (Collections.indexOfSubList(numbers, subList) >= 0){
            consecutiveOnes = true;
        }

        System.out.println("The list contains a 1 next to another 1: "+consecutiveOnes);


//        4. Print the sum of the numbers,

        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        System.out.println("full sum of numbers: "+sum);


//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

        int luckySum = 0;
        int previousNumber = 0;

        for(int number : numbers) {
            if(number == 13 || previousNumber == 13) {
                previousNumber = number;
                continue;
            }
            previousNumber = number;
            luckySum += number;
        }

        System.out.println("sum excluding unlucky numbers: "+luckySum);

    }

}
