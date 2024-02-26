import java.util.ArrayList;
import java.util.List;

public class CompositeStoreItem implements StoreItem {

    private List<StoreItem> children = new ArrayList<>();

    @Override
    public double getPrice() {

        double totalPrice = 0;

        for (StoreItem item : children) {

            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void add(StoreItem item) {

        children.add(item);
    }

    @Override
    public void remove(StoreItem item) {

        children.remove(item);
    }
}