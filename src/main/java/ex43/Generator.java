/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static ex43.main43.user;

public class Generator {

    static String directory() throws IOException {
        // Generate "website" directory
        File dir = new File("C:\\Users\\Rey\\Computer Science\\IntelliJ Projects\\" +
                                     "fundora-cop3330-assignment3\\website");
        if (dir.mkdir()) System.out.println("Created ./" + dir.getName() + "/" + user[0]);
        else System.out.println("Directory with that name already exists.");

        // Generates the index.html file in the working directory
        File index = new File (dir + "\\index.html");
        if (index.createNewFile()) System.out.println("Created ./" + dir.getName() + "/" + user[0] +
                                                      "/" + index.getName());
        else System.out.println("HTML file with that name already exists.");


        // Write to HTML file and create <title> and <meta> tags
        FileWriter tags = new FileWriter(index);
        tags.write("<head>\n" +
                "\t<title>" + user[0] + "</title>\n" +
                "\t<meta name = \"" + user[1] + "\">\n" +
                "</head>\n");
        tags.close();


        // Add javascript folder if prompted
        if (user[2].equals("y")){
            File js = new File (dir + "\\js");
            if (js.mkdir()) System.out.println("Created ./" + dir.getName() + "/" + user[0] + "/js/");
            else System.out.println("Directory for javascript already exists.");
        }

        // Add CSS folder if prompted
        if (user[3].equals("y")){
            File css = new File (dir + "\\css");
            if (css.mkdir()) System.out.println("Created ./" + dir.getName() + "/" + user[0] + "/css/");
            else System.out.println("Directory for css files already exists.");
        }

        return dir.getName() + " " + index.getName();
    }
}