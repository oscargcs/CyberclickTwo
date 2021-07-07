
package CyberclickTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class PasswordHandler {
    
 public abstract boolean isValidPassword(String line);
 
 public abstract int countValidPasswords() throws FileNotFoundException; 
          
 public static ArrayList<String> readInput(String ubicacion) throws FileNotFoundException {

        File file = new File(ubicacion);
        Scanner scan = new Scanner(file);

        ArrayList<String> policyAndPassword = new ArrayList<String>();

        while (scan.hasNextLine()) {
            policyAndPassword.add(scan.nextLine());
        }
        return policyAndPassword;
    }
   
}
