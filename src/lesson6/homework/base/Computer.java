package lesson6.homework.base;

public class Computer extends Electronic {

    public Computer(boolean switchParam) {
        super(switchParam);
    }

    public void loadSystem() {
        System.out.println("загрузка компьютера");
    }

    @Override
    public void work() {
        System.out.println("выполняет вычисления");
    }
}
