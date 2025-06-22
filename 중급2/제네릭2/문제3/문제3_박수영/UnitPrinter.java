package 중급2.제네릭2.문제3.문제3_박수영;

import 중급2.제네릭2.문제1.문제1_박수영.BioUnit;
import 중급2.제네릭2.문제2.문제2_박수영.Shuttle;

public class UnitPrinter {
    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
    public static void printV2(Shuttle<? extends BioUnit> t1) {
        BioUnit unit = t1.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
