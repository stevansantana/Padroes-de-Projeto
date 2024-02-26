
public class SimpleStoreItem implements StoreItem {

    private String name;
    private double price;

    public SimpleStoreItem(String name, double price) {
        
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {

        return price;
    }

    @Override
    public void add(StoreItem item) {

        throw new UnsupportedOperationException("Não é possível adicionar um item em um item simples.");
    }

    @Override
    public void remove(StoreItem item) {

        throw new UnsupportedOperationException("Não é possível remover um item de um item simples.");
    }
}