package Lesson4.Homework;


public class BaseTasks {

    public static void main(String[] args) {
        //Базовый
        //Задача №1
        //Дано (их менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже), убрать лишние пробелы,
        //затроить (Можно вызвать тольку одну команду System.out.print())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!

        String result = hi.trim() + world.toLowerCase() + "\n";
        System.out.println(result.repeat(3));

        // Задание №2 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "a ");
        }
        System.out.println();

        // Задание №3
        // Создать два класса, которые описывают виды животных (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Например: класс Кот, класс Собака
        Dogs dog = new Dogs("лабрадор", 3);
        Cats cat = new Cats("Айза", 'c');

        System.out.println(dog);
        System.out.println(cat);

    }
}
