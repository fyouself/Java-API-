import java.util.LinkedList;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        /**
         * Реализовать консольное приложение, которое:
         * 1. Принимает от пользователя и “запоминает” строки.
         * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
         * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
         * 4. Если введено exit, то программа завершается
         *
         *
         *
         * > - ввод в консоль (stdin), < - вывод на консоль (stdout)
         * > java
         * > python
         * > c#
         * > print
         * < [c#, python, java]
         * > revert
         * > print
         * < [python, java]
         * > revert
         * > revert
         * > print
         * < []
         * > revert -> throw new NoSuchElementException
         */

        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        root: while (true) {
            System.out.print("Введите команду: ");
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                break;
            }

            if(command.equals("print")){
                if (list.size() == 0) {
                System.err.println("В списке нет строк, введите строки.");
                } else {
                    System.out.println(list);
                }
                continue;
            }
            if(command.equals("revert")){
                if (list.size() == 0) {
                    System.err.println("В списке нет строк, введите строки.");
                } else {
                    System.out.println(list.removeFirst());
                }
                continue;
            }
            for (String word: list) {
                if(word.equals(command)){
                    continue root;
                }
            }
            list.addFirst(command);





        }






    }
}
