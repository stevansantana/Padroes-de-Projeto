public class Main {
    
    public static void main(String[] args) {

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        
        Flyweight flyweight1 = flyweightFactory.getFlyweight("chave1");
        Flyweight flyweight2 = flyweightFactory.getFlyweight("chave2");
        Flyweight flyweight3 = flyweightFactory.getFlyweight("chave1");

        flyweight1.operation();
        flyweight2.operation();
        flyweight3.operation();
    }
}