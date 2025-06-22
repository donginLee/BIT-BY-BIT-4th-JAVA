public class LottoGenerator {

    private static Random random = new Random();

    private static Set<Integer> resultSet = new HashSet<>();

    public static void main(String[] args) {
        while (resultSet.size() != 6) {
            int randomInt = random.nextInt(45) + 1;
            if (resultSet.contains(randomInt)) {
                continue;
            } else {
                resultSet.add(randomInt);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("로또 번호: ");
        for (int rs : resultSet) {
            sb.append(rs).append(" ");
        }
        String answer = sb.toString().trim();

        System.out.println(answer);
    }
}