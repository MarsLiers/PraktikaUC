package com;

import java.util.Scanner;

public class Authentif {

    private static final String LOGIN = "admin";
    private static final String PASSWORD = "1111";

    public static void authentif() {
        Scanner s = new Scanner(System.in);

        boolean isLoginSuccess = false;

        while (!isLoginSuccess) {
            System.out.print("Login: ");
            var login = s.nextLine();

            System.out.print("Password: ");
            var password = s.nextLine();

            if (login.equals(LOGIN) & password.equals(PASSWORD)) {
                System.out.println("Authentification successfull");
                break;
            } else {
                System.out.println("Incorrect login/password");
            }
        }
    }
}




