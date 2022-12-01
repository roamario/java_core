package lesson6.homework.base;

import java.util.Arrays;

public class BaseTasks {
    public static void main(String[] args) {
        //Базовый уровень
        // Задание №1
        // Создать следующие классы
        // 1. Electronic (имеет метод on и off - включает/выключает электрический прибор,
        // подумать, какой нужен атрибут для этого метода, имеет метод без реализации - work)
        // 2. Computer (имеет метод loadSystem - выводит в консоль сообщение "загрузка компьютера")
        // 3. LenovoComputer (имеет метод loadSystem - выводит в консоль сообщение "загрузка Lenovo").
        // Метод work у компьютера выводит в консоль "выполняет вычисления".
        //Подумать какие классы и методы являются абстрактными, к каким методам нужна надпись @Override

        Computer computer = new Computer(true);
        computer.setOff();
        System.out.println(computer.switchParam);
        computer.setOn();
        System.out.println(computer.switchParam);
        computer.work();

        LenovoComputer lenovoComputer = new LenovoComputer(true);
        lenovoComputer.loadSystem();
        lenovoComputer.work();

        //Задание №2
        //Создать два класса машин, создать 4 экземпляра и положить их в один массив

        CarOne bmv = new CarOne("bmv", 200);
        CarOne kia = new CarOne("kia", 150);
        CarTwo mersedes = new CarTwo("mersedes", 8000);
        CarTwo ford = new CarTwo("ford", 5000);

        Car[] cars = {bmv, kia, mersedes, ford};
        System.out.println(Arrays.toString(cars));

    }
}
