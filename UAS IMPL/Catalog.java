import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Category> categories;

    public Catalog() {
        categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void showCatalog() {
        System.out.println("Katalog Toko");
        System.out.println("Kategori:");
        for (Category category : categories) {
            category.display();
            System.out.println();
        }
    }
}