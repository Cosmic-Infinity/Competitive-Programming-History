//Prepare>Java>Introduction>Java Currency Formatter
//Java 8

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        
    // US Locale
    NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
    String us = usFormat.format(payment);

    // Indian Locale
    Locale indiaLocale = new Locale("en", "IN");
    NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
    String india = indiaFormat.format(payment).replace("INR", "Rs.");

    // Chinese Locale
    NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
    String china = chinaFormat.format(payment);

    // French Locale
    NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    String france = franceFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
