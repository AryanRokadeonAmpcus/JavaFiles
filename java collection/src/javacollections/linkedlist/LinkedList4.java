package javacollections.linkedlist;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String[] args) {

        HashMap<String, Integer> Oppo = new HashMap<>();

        Oppo.put("Aryan",103);
        Oppo.put("Aryan",104);
        Oppo.put("Aryan",105);
        Oppo.put("Aryan",106);
        Oppo.put("Aryan",107);
// Import the LinkedHashMap class

                LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();

                capitalCities.put("England", "London");
                capitalCities.put("India", "New Dehli");
                capitalCities.put("Austria", "Wien");
                capitalCities.put("Norway", "Oslo");
                capitalCities.put("Norway", "Oslo"); // Duplicate
                capitalCities.put("USA", "Washington DC");

        System.out.println(Oppo);

                System.out.println(capitalCities);
            }
        }




//        LinkedList<Integer>Oppo2 = new LinkedList<>();
//
//        Oppo2.add(73);
//        Oppo2.add(38763);
//        Oppo2.add(9783);
//        Oppo2.add(813);
//        Oppo2.add(13);
//        Oppo2.add(34113);
//
//        Oppo2.addAll(Oppo);
//        System.out.println(Oppo2);


