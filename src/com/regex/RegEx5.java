package com.regex;


public class RegEx5 {
    public static void main(String[] args) {
        String s1 = "Privet,       moy drug!  Kak idet izuchenie                Java?";

        System.out.println(s1);
   //     s1 = s1.replace("Java", "SQL");

  //      s1 = s1.replaceAll(" {2,}", " "); // space delete

        s1 = s1.replaceFirst("\\bi\\w+", "4444");





        System.out.println(s1);

    }


}
