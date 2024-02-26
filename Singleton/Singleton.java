public class Singleton {

    //evita instanciação externa
    private static Singleton instance;
    
    private Singleton() {}

    //obtem instância única
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void showMessage() {

        System.out.println("Hello, world!");
    }
}
