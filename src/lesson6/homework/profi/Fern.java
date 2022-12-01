package lesson6.homework.profi;

public class Fern extends Plant implements Bloomable{

    public Fern(String name) {
        super(name);
    }

    @Override
    public String canBloom() {
        return this.name + ": умеет цвести";
    }

}
