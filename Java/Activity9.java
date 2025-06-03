package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of Strings
        ArrayList<String> myList = new ArrayList<>();

        // Step 2: Add 5 names to the ArrayList
        myList.add("Thanusha");
        myList.add("Ansar");
        myList.add("sruthi");
        myList.add("Trisha");
        myList.add("Jainabee");

        // Step 3: Print all the names using a for loop
        System.out.println("All names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // Step 4: Retrieve the 3rd name (index 2)
        String thirdName = myList.get(2);
        System.out.println("\n3rd name in the list: " + thirdName);

        // Step 5: Check if a name exists in the list
        String nameToCheck = "Trisha";
        if (myList.contains(nameToCheck)) {
            System.out.println(nameToCheck + " exists in the list.");
        } else {
            System.out.println(nameToCheck + " does not exist in the list.");
        }

        // Step 6: Print the size of the list
        System.out.println("Size of the list: " + myList.size());

        // Step 7: Remove a name from the list
        myList.remove("jainabee");
        System.out.println("Removed 'jainabee' from the list.");

        // Step 8: Print the new size of the list
        System.out.println("New size of the list: " + myList.size());
    }
}
