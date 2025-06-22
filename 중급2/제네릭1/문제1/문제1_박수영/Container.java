package 중급2.제네릭1.문제1.문제1_박수영;

public class Container<T> {
    private T item;
    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    public boolean isEmpty() {
        return item == null;
    }
}
