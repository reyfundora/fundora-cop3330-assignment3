/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Product {
    // Create lists to use for extracted values
    static List<String> name = new ArrayList<>();
    static List<Double> price = new ArrayList<>();
    static List<Integer> quantity = new ArrayList<>();

    static void File_Parser() throws IOException {
        // Create .json file and read it
        File input = new File("exercise44_input.json");
        JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
        JsonObject fileObject = fileElement.getAsJsonObject();

        // Pull the fields
        JsonArray products = fileObject.get("products").getAsJsonArray();
        for (JsonElement product_element : products) {
            JsonObject product_object = product_element.getAsJsonObject();

            // Extract data
            String name_in = product_object.get("name").getAsString();
            double price_in = product_object.get("price").getAsInt();
            int quantity_in = product_object.get("quantity").getAsInt();

            name.add(name_in);
            price.add(price_in);
            quantity.add(quantity_in);
        }
    }
}
