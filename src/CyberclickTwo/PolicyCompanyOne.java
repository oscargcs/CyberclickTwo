package CyberclickTwo;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.apache.commons.lang.StringUtils;

public class PolicyCompanyOne extends PasswordHandler {

    @Override
    public boolean isValidPassword(String line) {
        Character l = line.charAt(line.indexOf(":") - 1);
        String letter = Character.toString(l);
        String password = line.substring(line.lastIndexOf(":") + 1);

        int letterCount = StringUtils.countMatches(password, letter);

        int min = Integer.parseInt(line.substring(0, line.indexOf("-")));

        line = line.substring(line.indexOf("-") + 1);
        int max = Integer.parseInt(line.substring(0, line.indexOf(" ")));

        if (letterCount >= min && letterCount <= max) {
            return true;
        } else {
            return false;

        }
    }

    @Override
    public int countValidPasswords() throws FileNotFoundException {
        ArrayList<String> input = readInput("input.txt.txt");
        int count = 0;
        for (int i = 0; i < 100; i++) {

            if (isValidPassword(input.get(i))) {
                count = count + 1;
            }

        }
        System.out.println("The number of valid passwords according to policy 1 is: " + count);
        return count;
    }

}
