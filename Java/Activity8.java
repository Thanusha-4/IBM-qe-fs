package Activities;

public class Activity8 {
    public static void main(String[] a){
        try {
            // Method call with correct input
            Activity8.exceptionTest("Will print to console");
            // Method call with incorrect input
            Activity8.exceptionTest(null); // Exception is thrown here
            Activity8.exceptionTest("Won't execute");
        } catch(CustomException8 mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException8 {
        if(str == null) {
            throw new CustomException8("String value is null");
        } else {
            System.out.println(str);
        }
    }
}