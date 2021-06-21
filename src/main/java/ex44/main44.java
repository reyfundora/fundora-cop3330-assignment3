/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex44;

import static ex44.Product.*;
import java.io.*;
import java.util.Scanner;

public class main44 {
    static boolean user_input() {
        Scanner input = new Scanner(System.in);
        int count = name.size();

        // Print that loops until product is found
        while(true) {
            System.out.print("What is the product name? ");
            String user = input.nextLine();
            for (int i = 0; i < count; i++) {
                if (user.equals(name.get(i))) {
                    System.out.printf("Name: %s \nPrice: %.2f \nQuantity: %d",
                                      name.get(i), price.get(i), quantity.get(i));
                return false;
                }
            }
            System.out.print("Sorry, that product was not found in our inventory.\n");
        }
    }

    public static void main (String[] args) throws IOException {
        Product.File_Parser();
        user_input();
    }
}
