import java.util.*;
public class Main {
    public static void main(String[] args) {

        PKW bmwM8 = new PKW(10000, 650, 800);
        System.out.println(bmwM8.kilometerStand + " Kilometer");
        bmwM8.kilometerStandHinzufügen(500);
        System.out.println(bmwM8.kilometerStand + " Kilometer nach dem Hinzufügen");

        Wein rotwein = new Wein(12.5, 2018);
        rotwein.alkoholmenge(750);
        System.out.println(rotwein.alkoholmenge + " Milliliter Alkohol");

        Lauf neckarLauf = new Lauf (54321, 60);
        neckarLauf.geschwindigkeitInKmH();
        System.out.println(neckarLauf.geschwindigkeitInKmH + " km/h schnell gelaufen");

        LinkedList<PKW> bmws = new LinkedList<>();
        bmws.add(bmwM8);
        bmws.add(new PKW(100000, 450, 500));
        System.out.println(bmws.get(1).kilometerStand);

    }
}