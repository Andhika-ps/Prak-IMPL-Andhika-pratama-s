public class ElectronicItem extends Item {
    public ElectronicItem(String name, int price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("Item: " + name);
        System.out.println("Harga: " + price);
    }
}