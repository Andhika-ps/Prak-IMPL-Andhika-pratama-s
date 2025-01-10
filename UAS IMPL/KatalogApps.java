public class KatalogApps {
    public static void main(String[] args) {
        // Membuat Katalog
        Catalog catalog = new Catalog();

        // Menambahkan kategori Elektronik
        ElectronicsCategory electronics = new ElectronicsCategory();
        electronics.addItem(new ElectronicItem("Komputer i7", 1000));
        electronics.addItem(new ElectronicItem("TV Samsung 32 inch", 1500));
        catalog.addCategory(electronics);

        // Menambahkan kategori Fashion
        FashionCategory fashion = new FashionCategory();
        fashion.addItem(new FashionItem("Kemeja", "Merah", 100));
        fashion.addItem(new FashionItem("Jeans", "Biru", 200));
        catalog.addCategory(fashion);

        // Menambahkan kategori Makanan
        FoodCategory food = new FoodCategory();
        food.addItem(new FoodItem("Pizza Italia", "Pan Pizza", 500));
        food.addItem(new FoodItem("Steak Wagyu A6", "Well Done", 300));
        catalog.addCategory(food);

        // Menambahkan kategori Household
        HouseholdCategory household = new HouseholdCategory();
        household.addItem(new HouseholdItem("Lemari Kayu", "Kayu Jati", 3500));
        catalog.addCategory(household);

        // Menampilkan katalog
        catalog.showCatalog();
    }
}