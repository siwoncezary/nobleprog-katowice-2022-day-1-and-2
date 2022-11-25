package pl.vattenfall.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Person> addressBook = new HashMap<>();
        String address = "adam@op.pl";
        address = null;
        addressBook.put(address, Person.builder()
                .name("Adam")
                        .points(100)
                .build());
        final String key = "adam@op.pl";
        if (addressBook.containsKey(null)) {
            System.out.println(addressBook.get(null));
        }
        addressBook.remove(1);
        addressBook.put(null, null);
        System.out.println(addressBook.get(null));
        for(Map.Entry<String, Person> entry :addressBook.entrySet()){
            System.out.println(entry.getKey() +" " + entry.getValue());
        }
    }
}
