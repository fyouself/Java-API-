public class Homework {
    public static void main(String[] args) {

//        System.out.println( stringBilder(10, 'q' , 'w' ));
//        System.out.println(exstraktMail("fyou@mail.ru"));
        System.out.println(compress("aaaa"));
    }

    /**
     * Напишите метод, который сжимает строку. Пример:
     * aaaabbbcdd -> a4b3cd2
     * abcde -> abcde
     * aaaaaa -> a6
     */
    static String compress (String source){
        String result = "";
        int count = 1;
        for (int i = 1; i < source.length(); i++) {
            if (source.charAt(i - 1) == source.charAt(i)) {
                count++;
            } else {
                result += source.charAt(i - 1);
                if (count > 1) {
                    result += count;
                }
                count = 1;
            }
        }
        result += source.charAt(source.length() - 1);
        if (count > 1) {
            result += count;
        }
        return result;

    }

    /**
     * Дано: электронная почта. Нужно найти доменное имя сотрудника.
     * [manager@gb.com] -> manager
     * [chief@google.com] -> chief
     */
    static String exstraktMail(String mail){
        int indexAt = mail.indexOf('@');
        return mail.substring(0,indexAt);
    }


    /**
     * Дано четное число n b символы c1 c2. Нужно создать строку c1c2c1c2...c1c2 длины n
     */
    static String stringBilder (int i, char c1, char c2){
        String append = String.valueOf(c1) + c2;
        return append.repeat(i/2);

    }
}

