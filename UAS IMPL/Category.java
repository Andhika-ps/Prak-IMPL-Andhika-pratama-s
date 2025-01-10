import java.util.ArrayList;
import java.util.List;

public abstract class Category {
    protected String categoryName;
    protected List<Item> items;

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void display() {
        System.out.println(categoryName);
        int index = 1;
        for (Item item : items) {
            System.out.println("Item " + index + ":");
            item.display();
            index++;
        }
    }
}