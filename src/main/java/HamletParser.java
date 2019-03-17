import jdk.nashorn.internal.runtime.regexp.RegExpMatcher;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser() {
        this.hamletData = loadFile();
    }

    private String loadFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData() {
        return this.hamletData;
    }


    public void replaceHamlet(String hamlet) { //}, String leon) {

        String stringPattern = "(H|h)(A|a)(M|m)(L|l)(E|e)(T|t)";
        hamletData = Pattern.compile(stringPattern).matcher(hamlet).replaceAll("Leon");


    }

    public void replaceHaratio(String hamlet) {

        String stringPattern = "(H|h)(O|o)(R|r)(A|a)(T|t)(I|i)(O|o)";
        hamletData = Pattern.compile(stringPattern).matcher(hamlet).replaceAll("Tariq");
    }
}
