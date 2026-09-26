

public class ShoppingCart {

    private double[] prices;
    private final int cartId;
    private int itemCount;

    public ShoppingCart(int cartId) {
        this.cartId = cartId;
        this.prices = new double[10];
        this.itemCount = 0;
    }

    public void addItem(double price) {
        if (itemCount < prices.length && price >= 0) {
            prices[itemCount] = price;
            itemCount++;
        }
    }

    public double getTotal() {
        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total += prices[i];
        }

        return total;
    }

    public int getItemCount() {
        return itemCount;
    }

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart(101);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("Total: Rs " + cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());
    }
}

