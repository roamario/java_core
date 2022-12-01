package lesson6.homework.profi;

public interface Bloomable {

    default String canBloom() {
        return "умеет цвести";
    }

}
