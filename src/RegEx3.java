import java.util.Arrays;

public class RegEx3 {
    public static void main(String[] args) {
        String s
                = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                "email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456889;"
                + "Petrova Maria, Ucraine, Dnipro, Lomonosov street, 33, Flat 18," +
                "email: masha@yandex.ru, Postcode: UKR54, Phone Number: +988654321;"
                + "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                "email: chuck@gmail.ru, Postcode: USA23, Phone Number: +65432194152;";


        String s2 = "chuck@gmail.ru";
        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");

        System.out.println(result);


        String [] array = s.split( ",");
        System.out.println(Arrays.toString(array));
    }
}
