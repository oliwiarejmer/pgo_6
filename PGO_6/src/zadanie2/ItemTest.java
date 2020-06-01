package zadanie2;

import java.util.*;

public class ItemTest {
    public static void main(String [] args){

        Map<Integer, String> itemMap = new HashMap<>();

        Item [] item = {
                new Item(1,"jablko"),       //1
                new Item(2,"sliwka"),       //2
                new Item(3,"pomarancza"),   //3
                new Item(4,"truskawka"),    //4
                new Item(5,"wisnia"),       //5
                new Item(6,"gruszka")       //6

        };

        List<Item> items = new ArrayList<>(Arrays.asList(item));

        System.out.println("Wyświetlenie nazw obiektów z klasy Item korzystając z metody get() i  metody show  " + '\n');

        for(int i=0; i<items.size();i++){
            items.get(i).show();
        }

        for (Item value : items) {
             itemMap.put(value.getIdent(), value.getName());
         }

        System.out.println('\n' + "Wyświetlenie mapy " + '\n');

        for(Map.Entry<Integer, String > map : itemMap.entrySet()){
            System.out.println("Klucz: " + map.getKey() +
                               " --> wartość: " + map.getValue());
        }

    }
}
