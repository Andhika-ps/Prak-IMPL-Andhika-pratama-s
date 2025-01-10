public class FashionItem extends Item {
    private String color;

    public FashionItem(String name, String color, int price) {
        super(name, price);
        this.color = color;
    }

    @Override
    public void display() {
        System.out.println("Item: " + name);
        System.out.println("Warna Baju: " + color);
        System.out.println("Harga: " + price);
    }
}