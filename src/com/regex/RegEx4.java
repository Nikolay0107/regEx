package com.regex;

import java.util.regex.Pattern;

public class RegEx4 {

    void checkIP(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";


        // 25[0-5]  |  2[0-4]\d   |   [01]?\d?\d   (\.)
        // 250-255  |  200-249   |     0-199


        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        // 0-255.0-255.0-255.0-255.

        String ip1 = "255.240.192.99";
        String ip2 = "182.262.91.05";

        RegEx4 re4 = new RegEx4();

        re4.checkIP(ip1);
        re4.checkIP(ip2);


    }


}
