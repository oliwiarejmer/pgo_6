package zadanie3;
import zadanie2.Item;
import java.util.*;

public class ItemSet {
    public static void main( String [] args) {
        Item [] item = {
                new Item(1, "monitor"),     //1
                new Item(2, "klawiatura"),  //2
                new Item(3, "komputer"),    //3
                new Item(4, "zegarek"),     //4
                new Item(5, "szklanka"),    //5
                new Item(6, "filiżanka"),   //6
                new Item(7, "telefon"),     //7
                new Item(8, "podkadka"),    //8
                new Item(9, "myszka"),      //9
                new Item(10, "lampka"),     //10
        };

        List<Item> itemList = new ArrayList<>(Arrays.asList(item));
        List<Item> temp = itemList.subList(0,5);
        Set<Item> itemSet = new HashSet<>(temp);

        itemSet.forEach(System.out::println);

    }
}
