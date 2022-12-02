package lesson6.homework.profi.task2;

public class Employee {

    public String name;
    int quantityGoods;

    int amountDamagedGoods;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getQuantityGoods() {
        return quantityGoods;
    }

    public int getAmountDamagedGoods() {
        return amountDamagedGoods;
    }

    public void setAmountDamagedGoods(int amountDamagedGoods) {
        this.amountDamagedGoods = amountDamagedGoods;
    }

    public void setQuantityGoods(int quantityGoods) {
        this.quantityGoods = quantityGoods;
    }


    public void takeGoods(Stock stock, int quantity) {
        if (quantity > stock.getQuantityGoods()) {
            System.out.println("Не хватает товара на складе");
        } else {
            this.quantityGoods = quantity;
            stock.setQuantityGoods(stock.quantityGoods - quantity);
            System.out.println("Ура я испортил водку!");
            this.amountDamagedGoods += quantity;
        }
    }


}
