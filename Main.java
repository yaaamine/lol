//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.example.sonarlint;

import java.util.logging.Logger;

public class SonarLintExample {
    private static final Logger logger = Logger.getLogger(SonarLintExample.class.getName());

    public static void main(String[] args) {

        int numerator = 10;
        int denominator = 2;
        if (denominator != 0) {
            int x = numerator / denominator;
            logger.info("Result of division: " + x);
        } else {
            logger.warning("Division by zero attempted.");
        }


        String str1 = "Hello";
        String str2 = new String("Hello");
        if (str1.equals(str2)) {
            logger.info("Les chaînes sont identiques.");
        } else {
            logger.info("Les chaînes ne sont pas identiques.");
        }
    }
}
