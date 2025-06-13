public class 문제2_박수영 {
    public static void main(String[] args) {
        Grade[] values = Grade.values();
        for (Grade value : values) {
            System.out.println("grade=" + value.name() + ", level=" +
                    value.getLevel() + ", 설명=" + value.getDescription());
        }
    }
}