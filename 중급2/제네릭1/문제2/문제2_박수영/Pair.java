package 중급2.제네릭1.문제2.문제2_박수영;

public class Pair<T1, T2> {

    private T1 first;
    private T2 second;
    public void setFirst(T1 first) {
        this.first = first;
    }
    public void setSecond(T2 second) {
        this.second = second;
    }
    public T1 getFirst() {
        return first;
    }
    public T2 getSecond() {
        return second;
    }
    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
