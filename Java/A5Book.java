package Activities;

// Abstract class Book
abstract class Book {
    String title;

    // Abstract method to be implemented by subclass
    abstract void setTitle(String s);

    // Concrete method to get the title
    String getTitle() {
        return title;
    }
}

// MyBook class extending Book
class MyBook extends Book {

    // Implementing the abstract method
    void setTitle(String s) {
        title = s;
    }
}

// Main class to run the program
public class A5Book {
    public static void main(String[] args) {
        // Creating object of MyBook
        MyBook newNovel = new MyBook();

        // Setting the title
        newNovel.setTitle("To Kill a Mockingbird");

        // Getting and printing the title
        System.out.println("The title of the book is: " + newNovel.getTitle());
    }
}
/*
//Abstract class
abstract class Book {
  String title;
  //Abstract method
  abstract void setTitle(String s);
  
  //Concrete method
  String getTitle() {
      return title;
  }
}

class MyBook extends Book {
  //Define abstract method
  public void setTitle(String s) {
      title = s;
  }
}

public class Activity5 {
  
  public static void main(String []args) {
      //Initialize title of the book
      String title = "Hover Car Racer";
      //Create object for MyBook
      Book newNovel = new MyBook();
      //Set title
      newNovel.setTitle(title);
      
      //Print result
      System.out.println("The title is: " + newNovel.getTitle());
  }
}*/