package HW5;

import java.util.*;

public class homework {
    public static void main(String[] args) {
        /**
         * Реализовать консольное приложение - телефонный справочник.
         * У одной фамилии может быть несколько номеров.
         * Пользователь может вводить команды:
         * 1. ADD Ivanov 88005553535 - добавить в справочник новое значение. Первый аргумент - фамилия, второй - номер телефона
         * 2. GET Ivanov - получить список всех номеров по фамилии
         * 3. REMOVE Ivanov - удалить все номера по фамилии
         * 4. LIST - Посмотреть все записи
         * 5. EXIT - Завершить программу
         * Если при GET или REMOVE нужной фамилии нет, вывести информацию об этом
         */

        HashMap<String,List<String>> telDir = new HashMap<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите команду: ");
            String command = scanner.nextLine();

            if(command.equalsIgnoreCase("exit")){
                break;
            }
            if(command.equalsIgnoreCase("list")){
                System.out.println(telDir);
                continue;
            }
            List<String> commandSplit = List.of(command.split(" "));
            if ( commandSplit.get(0).equals("add")) {
                if(commandSplit.size()<3){
                    System.out.println("введитите нормально");
                    continue;
                } else if (!telDir.containsKey(commandSplit.get(1))) {
                    telDir.put(commandSplit.get(1),new ArrayList<>(Arrays.asList(commandSplit.get(2))));
                    continue;
                } else {
                    List<String> newNumber = telDir.get(commandSplit.get(1));
                    newNumber.add(commandSplit.get(2));
                    telDir.put(commandSplit.get(1),newNumber);
                    continue;
                }

            } else if (commandSplit.get(0).equals("get")) {
                System.out.println(telDir.get(commandSplit.get(1)));
                continue;
            }
            else if (commandSplit.get(0).equals("list")) {
                System.out.println(telDir);
                continue;

            }
            else if (commandSplit.get(0).equals("remove")) {
                if (!telDir.containsKey(commandSplit.get(1))){
                    System.out.println("нет такого имени");
                    continue;
                }
                telDir.remove(commandSplit.get(1));

            }

        }
    }
}
