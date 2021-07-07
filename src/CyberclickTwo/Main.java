package CyberclickTwo;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        PasswordHandler policy;

        policy = new PolicyCompanyOne();

        policy.countValidPasswords();

        policy = new PolicyCompanyTwo();

        policy.countValidPasswords();

    }

}
