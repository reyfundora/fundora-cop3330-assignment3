/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main43 {
    static String[] user = new String[4];

    static void user_input() {
    // Create scanner
    Scanner input = new Scanner(System.in);

    // Ask for user input
    System.out.print("Site name: ");
    user[0] = input.nextLine();
    System.out.print("Author: ");
    user[1] = input.nextLine();
    System.out.print("(Y/N) Do you want a folder for Javascript? ");
    user[2] = input.nextLine();
    user[2] = user[2].toLowerCase();
    System.out.print("(Y/N) Do you want a folder for CSS? ");
    user[3] = input.nextLine();
    user[3] = user[3].toLowerCase();
}

    public static void main(String[] args) throws IOException {
        user_input();
        Generator.directory();
    }
}
