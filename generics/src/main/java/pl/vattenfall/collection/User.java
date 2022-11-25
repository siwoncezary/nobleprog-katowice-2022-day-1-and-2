package pl.vattenfall.collection;

import java.util.Objects;

public class User {
    public String name;
    public int points;

    @Override
    public boolean equals(Object o) {
        System.out.println("CALL EQUALS");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return points == user.points && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        System.out.println("CALL HASHCODE");
        return Objects.hash(name, points);
    }
}
