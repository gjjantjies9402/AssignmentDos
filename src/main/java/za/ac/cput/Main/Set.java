package za.ac.cput.Main;

/**
 * Gaynor Jantjies
 * Student Number: 213069555
 *
 * Collection -- Set Interface
 */
import java.util.*;

public class Set {

    public static void main(String[] args) {
		/**
 		* Add Method for the HashSet "numbers"
 		*/

        Set numbers = new HashSet();
        numbers.add("1");
        numbers.add("2");
        numbers.add("4");
        numbers.add("3");
        numbers.add("5");
        numbers.add("6");
        numbers.add("7");
        System.out.println(numbers);

        /**
         * Remove Method
         */

        numbers.remove("4");
        System.out.println("After the changes");
        System.out.println(numbers);
    }
}
