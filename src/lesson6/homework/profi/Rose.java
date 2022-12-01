package lesson6.homework.profi;

public class Rose extends Plant implements Smellable, Bloomable{

    public Rose(String name) {
        super(name);
    }

    @Override
    public String canSmell() {
        return this.name + ": умеет пахнуть";
    }

    @Override
    public String canBloom() {
        return this.name + ": умеет цвести";
    }

}
