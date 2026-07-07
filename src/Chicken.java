public class Chicken  {

    private int id;
    private int quantity;
    private String status; // ACTIVE, SOLD

    public Chicken(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
        this.status = "ACTIVE";
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }

    public void sell() {
        this.status = "SOLD";
    }
}

