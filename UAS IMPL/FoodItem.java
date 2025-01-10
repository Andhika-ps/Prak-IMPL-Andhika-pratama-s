public class FoodItem extends Item {
    private String variant;

    public FoodItem(String name, String variant, int price) {
        super(name, price);
        this.variant = variant;
    }

    @Override
    public void display() {
        System.out.println("Item: " + name);
        System.out.println("Varian: " + variant);
        System.out.println("Harga: " + price);
    }
}