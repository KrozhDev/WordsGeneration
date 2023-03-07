import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // сгенерируем длинный текст - 10 млн символов, где-то 100 тыс. слов
        StringBuilder sb = new StringBuilder();
        Random random = new Random(2022);
        for (int i = 0; i < 10_000_000; i++) {
            if (random.nextInt(100) == 0) {
                sb.append(' ');
            } else {
                if (random.nextBoolean()) { // англ
                    if (random.nextBoolean()) {
                        sb.append((char) ('a' + random.nextInt(20)));
                    } else {
                        sb.append((char) ('A' + random.nextInt(20)));
                    }
                } else { // рус
                    if (random.nextBoolean()) {
                        sb.append((char) ('а' + random.nextInt(30))); // рус
                    } else {
                        sb.append((char) ('А' + random.nextInt(30))); // рус
                    }
                }
            }
        }

        String s2 = sb.toString();
        String[] words = s2.split(" ");
        System.out.println("Всего слов: " + words.length); // где-то 100 тыс

        String word = words[1_000]; // возьмём даже слово в начале
        System.out.println("Возьмём слово: " + word);
        System.out.println("Первый раз оно встречается: " + List.of(words).indexOf(word));

    }
}

