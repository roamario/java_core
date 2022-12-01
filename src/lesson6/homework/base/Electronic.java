package lesson6.homework.base;

public abstract class Electronic {

    public boolean switchParam;

    public Electronic(boolean switchParam) {
        this.switchParam = switchParam;
    }

    public abstract void work();

    public void setOn() {
        this.switchParam = true;
    }
    public void setOff() {
        this.switchParam = false;
    }
}
