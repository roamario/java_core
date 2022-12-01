package lesson6.homework.profi;

public interface Smellable {

    default String canSmell() {
        return "умеет пахнуть";
    }

}
