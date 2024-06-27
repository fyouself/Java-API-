package HW5;

import java.util.Arrays;
import java.util.List;

public class Strim {
    public static void main(String[] args) {
        String text = "Являясь всего лишь частью общей картины, " +
                "акционеры крупнейших компаний освещают чрезвычайно интересные особенности " +
                "картины в целом, однако конкретные выводы, разумеется, " +
                "указаны как претенденты на роль ключевых факторов. " +
                "Идейные соображения высшего порядка, " +
                "а также разбавленное изрядной долей эмпатии, рациональное " +
                "мышление создаёт предпосылки для экспериментов, поражающих " +
                "по своей масштабности и грандиозности.";

        String[] wordsArray = text.split("[.,]{0,1}\\s++");
        List<String> words = Arrays.asList(wordsArray);


        words.stream()
                .filter(it -> it.length()<4)
                .forEach(it -> System.out.print( it + " "));
        System.out.println();

        words.stream()
                .filter("как"::equalsIgnoreCase)
                .findAny()
                .ifPresentOrElse(it -> System.out.println("Слово " + it + " найдено!"), () -> System.out.println("Слово не найдено"));

//        words.stream()
//                .filter(word -> word.length() <= 5)  // промежуточная операция
//                .forEach(word -> System.out.print(word + " ")); // терминальная операция
//        System.out.println();

//        words.stream()
//                .filter("освещают"::equals)
//                .findAny()
//                .ifPresentOrElse(word -> System.out.println("Слово " + word + " найдено!"), () -> System.out.println("Слово не найдено"));






    }
}
