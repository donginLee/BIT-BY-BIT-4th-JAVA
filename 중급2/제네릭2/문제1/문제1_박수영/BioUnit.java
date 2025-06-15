package 중급2.제네릭2.문제1.문제1_박수영;

public class BioUnit {
    private String name;
    private int hp;
    public BioUnit(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    @Override
    public String toString() {
        return "BioUnit{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
