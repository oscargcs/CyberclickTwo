package CyberclickTwo;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PolicyCompanyTwo extends PasswordHandler {

    @Override
    public boolean isValidPassword(String line) {
        Character letter = line.charAt(line.indexOf(":") - 1);
        String password = line.substring(line.lastIndexOf(":") + 1);

        int loc1 = Integer.parseInt(line.substring(0, line.indexOf("-")));

        line = line.substring(line.indexOf("-") + 1);
        int loc2 = Integer.parseInt(line.substring(0, line.indexOf(" ")));

        return (password.charAt(loc1) == letter && !(password.charAt(loc2) == letter)) || (!(password.charAt(loc1) == letter) && password.charAt(loc2) == letter);
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
        System.out.println("The number of valid passwords according to policy 2 is: " + count);
        return count;
    }

}
