package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx6 {

    public static void main(String[] args) {

        String myString = "12345678912345670965032;" +
                          "44876543210986561236569;" +
                          "54564868789076651256986";

        Pattern pattern =
                Pattern.compile("\\W*(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);

   //     String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)\n");



        System.out.println(myString);
     //   System.out.println(myNewString);

    while (matcher.find()) {
        System.out.println(matcher.group(7));
    }


    }



}
