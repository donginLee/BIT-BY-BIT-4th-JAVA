package 중급2.제네릭2.문제1.문제1_박수영;

public class UnitUtil {
    public static <T extends BioUnit> T maxHp(T t1, T t2) {
        if (t1.getHp() > t2.getHp()) {
            return t1;
        } else {
            return t2;
        }
    }
}
