package pl.vattenfall.generics;

public class Box<T extends Pizza> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public static void copyContent(Box<? extends Pizza> source, Box<? extends  Pizza> target){
        target.content.setIngredients(source.content.getIngredients());
    }


    @Override
    public String toString() {
        return "Box{" +
                "content=" + content +
                '}';
    }
}
