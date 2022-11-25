package pl.vattenfall.generics;

public class IntLocation extends Location<Integer, Integer>{
    @Override
    public int distance(Location<?, ?> target) {
        String s = getX().toString();
        final double v = Double.parseDouble(s);
        return (int) (getX() - v);
    }
}
