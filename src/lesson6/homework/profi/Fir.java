package lesson6.homework.profi;

public class Fir extends Tree implements Smellable {

    public Fir(String name, boolean bumps) {
        super(name, bumps);
    }

    @Override
    public String canSmell() {
        return this.name + ": умеет пахнуть";
    }
}
