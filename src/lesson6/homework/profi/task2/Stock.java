package lesson6.homework.profi.task2;

public class Stock {

    int idStock;
    int quantityGoods;

    public Stock(int idStock, int quantityGoods) {
        this.idStock = idStock;
        this.quantityGoods = quantityGoods;
    }

    public int getQuantityGoods() {
        return quantityGoods;
    }

    public void setQuantityGoods(int quantityGoods) {
        this.quantityGoods = quantityGoods;
    }

}
