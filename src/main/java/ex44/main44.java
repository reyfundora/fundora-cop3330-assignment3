/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex44;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.*;

public class main44 {
    public static void main (String[] args) throws IOException {
        File input = new File("exercise44_input.json");
        JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
        JsonObject fileObject = fileElement.getAsJsonObject();

        // Pull the basic fields
        String name = fileObject.get("name").getAsString();
        Double price = fileObject.get("price").getAsDouble();
        System.out.println("Name: " + name);
        System.out.println("Cost: " + price);

    }
}
