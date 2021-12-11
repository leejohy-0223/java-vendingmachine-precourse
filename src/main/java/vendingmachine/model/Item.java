package vendingmachine.model;

public class Item {
    private String itemName;
    private int price;
    private int quantity;

    public Item(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public boolean checkOrderPossible(int money) {
        return quantity != 0 && money >= price;
    }
}
