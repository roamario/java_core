package lesson6.homework.profi;

public class Pine extends Tree implements Smellable {

    public Pine(String name, boolean bumps) {
        super(name, bumps);
    }

    @Override
    public String canSmell() {
        return this.name + ": умеет пахнуть";
    }
}
