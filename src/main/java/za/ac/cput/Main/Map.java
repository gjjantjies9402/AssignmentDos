package za.ac.cput.Main;

/**
 * Gaynor Jantjies
 * Student Number: 213069555
 *
 * Collection -- Map Interface
 */

import java.util.*;

public class Map {

    public static void main(String[] args) {

        Map<String, Integer> myMovies = new HashMap();
        /**
         *	add() for Map Interface
         */
        myMovies.put("The Avengers", 2);
        myMovies.put("Spiderman Homecoming", 6);
        myMovies.put("Ant Man", 1);
        myMovies.put("Captain Marvel", 3);
        myMovies.put("WandaVision", 5);
        myMovies.put("Civil War", 4);

        System.out.println(myMovies);
    }

    /**
     * remove()
     *
     */

    myMovies.remove(5);
    System.out.println("After a Movie has been remove" + myMovies);
}