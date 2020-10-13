/**
 * This program creates a procedure-type method called factors that takes an integer as a parameter and prints out every number that will divide the parameter evenly.
 * @author 
 */
public class Main {

  // determine the factors of an integer
  public static void factors(int numberToDevide){

    // use a for loop to determine all the possible factors of the number
    for(int i = 1; i <= numberToDevide; i++){

      // determine the quotient when diving the original number by the count number of the loop 
      int quotient = numberToDevide % i;

      // if a quotient of 2 numbers is 0, the number we devide by is a factor
      if(quotient == 0){

        // print the loop count whivh is the factor
        System.out.println(i);
      }
    }
  }


  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // detemine the factors of 20 using the method at the top. could as well work with users input or with any other input.
    factors(20);
  }
}
