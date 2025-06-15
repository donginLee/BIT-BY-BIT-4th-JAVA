package 중급2.제네릭2.문제2.문제2_박수영;

import 중급2.제네릭2.문제1.문제1_박수영.BioUnit;

public class Shuttle<T extends BioUnit> {
    private T unit;
    public void in(T t) {
        unit = t;
    }
    public T out() {
        return unit;
    }
    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
