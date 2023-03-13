package chapter14;

public class LoopingThroughCharacters {
    public static void main(String[] args) {
        String text = """
                1. We are paragons.
                2. We love violence all round 365
                3. We no send anybody papa.
                4. We come to school 7 days in a week.
                """;
        StringBuilder stringBuilder = new StringBuilder();
        for (int counter = 0; counter < text.length(); counter++) {

            char currentCharacter = text.charAt(counter);
            if (Character.isDigit(currentCharacter)){
                stringBuilder.append(currentCharacter);
            }
        }
        String digits = stringBuilder.toString();
        System.out.println(digits);
        System.out.println(stringBuilder.reverse());
    }
}
