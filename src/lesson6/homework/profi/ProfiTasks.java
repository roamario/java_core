package lesson6.homework.profi;

import lesson6.homework.profi.task1.*;
import lesson6.homework.profi.task2.Employee;
import lesson6.homework.profi.task2.Stock;

import java.util.Random;

public class ProfiTasks {
    public static void main(String[] args) {
        //Продвинутый уровень
        //Задача №1
        //1. Создать следующую структуру из классов и интерфейсов:
        // дерево -> ель (имеет шишки, умеет пахнуть)
        // дерево -> сосна (имеет шишки, умеет пахнуть)
        // растение -> роза (умеет цвести, умеет пахнуть)
        // растение -> папоротник (умеет цвести)
        // Создать у каждого класса по объекту, распределить по массивам интерфейсов
        // И у каждого массива вызвать характерный метод
        //Ожидание:
        // сосна : умеет пахнуть
        // ель : умееть пахнуть
        // роза: умееть пахнуть
        // роза: умеет цвести
        // папоротник: умеет цвести

        Rose rose = new Rose("роза");
        Fern fern = new Fern("папоротник");
        Fir fir = new Fir("ель", true);
        Pine pine = new Pine("сосна", true);

        Bloomable[] bloomables = {rose, fern};
        Smellable[] smellables = {fir, pine, rose};

        for (Smellable smell: smellables) {
            System.out.println(smell.canSmell());
        }

        for (Bloomable bloom: bloomables) {
            System.out.println(bloom.canBloom());
        }

        // Задание №2:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.

        Employee employee1 = new Employee("работник1");
        Employee employee2 = new Employee("работник2");
        Employee employee3 = new Employee("работник3");

        Employee[] arrEmployee = {employee1, employee2, employee3};

        int id1 = 1;
        Random random = new Random();

        Stock stock1 = new Stock(id1, 30);
        while(stock1.getQuantityGoods() > 0) {
            int i = random.nextInt(3) ;
            arrEmployee[i].takeGoods(stock1, random.nextInt(10) + 1);
            System.out.println(stock1.getQuantityGoods());
        }
        for (Employee emp: arrEmployee) {
            System.out.println(emp.name +" испортил " + emp.getAmountDamagedGoods() + " шт. водки");
        }
    }
}
