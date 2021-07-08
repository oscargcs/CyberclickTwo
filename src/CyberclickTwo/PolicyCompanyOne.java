package CyberclickTwo;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PolicyCompanyOne extends PasswordHandler {

    @Override
    public boolean isValidPassword(String line) {

        Character letter = line.charAt(line.indexOf(":") - 1);
        String password = line.substring(line.lastIndexOf(":") + 1);
        int letterCount = countMatches(password, letter);

        int min = Integer.parseInt(line.substring(0, line.indexOf("-")));

        line = line.substring(line.indexOf("-") + 1);
        int max = Integer.parseInt(line.substring(0, line.indexOf(" ")));

        if (letterCount >= min && letterCount <= max) {
            return true;
        } else {
            return false;
        }
    }

    private int countMatches(String password, char letter) {

        char[] passwordChar = password.toCharArray();
        int count = 0;
        for (int i = 0; i < passwordChar.length; i++) {
            if (passwordChar[i] == letter) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int countValidPasswords() throws FileNotFoundException {
        ArrayList<String> input = readInput("input.txt.txt");
        int count = 0;
        for (int i = 0; i < input.size(); i++) {

            if (isValidPassword(input.get(i))) {
                count++;
            }

        }
        System.out.println("The number of valid passwords according to policy 1 is: " + count);
        return count;
    }

}
