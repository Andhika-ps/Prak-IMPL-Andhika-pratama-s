class HouseholdItem extends Item {
    private String material;

    public HouseholdItem(String name, String material, int price) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void display() {
        System.out.println("Item: " + name);
        System.out.println("Material: " + material);
        System.out.println("Harga: " + price);
    }
}