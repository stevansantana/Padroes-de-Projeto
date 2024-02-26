public class Main {
    
    public static void main(String[] args) {
        
        Visitor visitor = new ConcreteVisitor();
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ConcreteElement("Elemento 1"));
        objectStructure.add(new ConcreteElement("Elemento 2"));
        objectStructure.accept(visitor);
    }
}