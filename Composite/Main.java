
public class Main {

    public static void main(String[] args) {

        // Cria um item simples
        SimpleStoreItem tshirt = new SimpleStoreItem("Camiseta", 29.99);

        // Cria um grupo de itens (por exemplo, uma coleção de sapatos)
        CompositeStoreItem shoes = new CompositeStoreItem();

        // Adiciona alguns sapatos no grupo
        shoes.add(new SimpleStoreItem("Sapato A", 14.99));
        shoes.add(new SimpleStoreItem("Sapato B", 19.99));
        shoes.add(new SimpleStoreItem("Sapato C", 24.99));

        // Adiciona o grupo de sapatos em outro grupo de itens (por exemplo, um kit de presente)
        CompositeStoreItem giftKit = new CompositeStoreItem();
        giftKit.add(tshirt);
        giftKit.add(shoes);

        // Calcula o preço total do kit de presente
        double totalPrice = giftKit.getPrice();
        System.out.println("Preço total do kit de presente: " + totalPrice);

        // Remove a camiseta do kit de presente
        giftKit.remove(tshirt);

        // Calcula o preço total do kit de presente novamente
        totalPrice = giftKit.getPrice();
        System.out.println("Preço total do kit de presente sem a camiseta: " + totalPrice);
    }
}