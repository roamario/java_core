package lesson2.homework.base;

public class task1 {
    public static void main(String[] args) {
        //Задача №1
        //Создать переменные с ростом (!в метрах), весом.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.00202130120
       double height = 1.82;
       double weight = 104.5;
       double bmi = weight / (height * height);
       System.out.println(bmi);

    }
}
