package util;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileHelper {

    public static List<String> slurp(String filepath) {
        try {
            List<String> lines;
            Path path = Paths.get(filepath);
            lines = Files.readAllLines(path);
            return lines;
        } catch (IOException e) {
            System.out.println("Unable to read the file, check the path and run the command again");
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

    public static void spit(String filename, List<String> contents, boolean append) {
        // figure out the file name
        // make a list and append some stuff to it
        // pass those into the spit method
        // inside the method, lets create the file if it doesn't exist

        try {

            if (Files.notExists(Paths.get("FILEHELPER.md"))) {
                Files.createFile(Paths.get("FILEHELPER.md"));
            }

            Files.write(
                    Paths.get(filename),
                    contents,
                    StandardOpenOption.APPEND);

        } catch (IOException e) {
            System.out.println("Unable to read the file, check the path and run the command again");
            e.printStackTrace();
            System.exit(1);
        }

        System.out.println("Wrote lines to FILEHELPER.md");


    }

//    public static void makeExciting(String filename) {
//        List<String> excitedLines = new ArrayList<>();
//
//        for (String line : slurp(filename)) {
//            String excitedLine = line.toUppercase() + "!";
//            excitedLines.add(excitedLine);
//        }
//    }

    public static void main(String[] args) {

        ArrayList<String> readmeContents = new ArrayList<>();
        readmeContents.add("# Teddy Java!");
        readmeContents.add("");
        readmeContents.add("This is the repository for the teddy cohort's java exercises.");

        spit("FILEHELPER.md", readmeContents, true);
        slurp("FILEHELPER.md");

//        makeExciting("FILEHELPER.md");


    }
}
