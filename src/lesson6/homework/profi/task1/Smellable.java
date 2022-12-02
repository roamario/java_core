package lesson6.homework.profi.task1;

public interface Smellable {

    default String canSmell() {
        return "умеет пахнуть";
    }

}
