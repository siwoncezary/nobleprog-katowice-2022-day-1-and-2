package pl.vattenfall.collection;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ewa");
        names.add("Karol");
        names.add("Adam");
        System.out.println(names);
        List<String> users = new ArrayList<>(names);
        users.add("Robert");
        System.out.println(users);
        System.out.println(names.contains("Robert"));   //czas O(n)
        Set<String> setUsers = new HashSet<>(users);
        System.out.println(setUsers.contains("Robert"));//czas O(1)
        users.add(0, "Helena");
        System.out.println(users);
        System.out.println(setUsers);
        final int indexOf = users.indexOf("Ewa");
        System.out.println(indexOf);
        try {
            for (int i = 0; i < users.size(); i++) {
                final String name = users.get(i);
                if (name.startsWith("E")) {
                    users.remove(name);
                }
            }
            for (String name : names) {
                if (name.startsWith("E")) {
                    names.remove(name);
                }
            }
        } catch (ConcurrentModificationException e){
            System.out.println("Can't modify collection!!!");
        }
        final Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            if(name.startsWith("E")) {
                iterator.remove();
            }
        }
        System.out.println(users);
        for(Iterator<String> i = names.iterator(); i.hasNext(); ){
            String name = i.next();
            if(name.startsWith("A")) {
                i.remove();
            }
        }
        System.out.println(names);

    }
}
