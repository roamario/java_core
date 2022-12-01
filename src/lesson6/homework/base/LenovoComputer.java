package lesson6.homework.base;

public class LenovoComputer extends Computer {

    public LenovoComputer(boolean switchParam) {
        super(switchParam);
    }

    @Override
    public void loadSystem() {
        System.out.println("загрузка Lenovo");
    }
}
