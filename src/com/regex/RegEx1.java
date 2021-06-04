package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {


        String s
                = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                "email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456889;"
                + "Petrova Maria, Ucraine, Dnipro, Lomonosov street, 33, Flat 18," +
                "email: masha@yandex.ru, Postcode: UKR54, Phone Number: +988654321;"
                + "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                "email: chuck@gmail.ru, Postcode: USA23, Phone Number: +65432194152;";


  //      Pattern pattern = Pattern.compile("\\w+");
 //       Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
   //     Pattern pattern = Pattern.compile("\\+\\d{9}"); // display phone numbers which contains + symbol and nine numerals

        Pattern pattern = Pattern.compile("\\w+@\\w+\\W\\w+");

        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group());
        }


    }
}
