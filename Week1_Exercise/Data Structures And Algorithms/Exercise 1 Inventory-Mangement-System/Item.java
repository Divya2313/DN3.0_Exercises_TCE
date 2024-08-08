public class Item {
    private int itemId;
    private String itemName;
    private int stock;
    private double cost;

    public Item(int itemId, String itemName, int stock, double cost) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.stock = stock;
        this.cost = cost;
    }

    // Getters and setters
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // Additional method to adjust stock
    public void adjustStock(int adjustment) {
        this.stock += adjustment;
    }
}
