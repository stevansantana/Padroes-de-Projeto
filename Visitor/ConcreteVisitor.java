class ConcreteVisitor implements Visitor {
    
    public void visit(Element element) {
        System.out.println("Visitando o elemento " + element.getName());
    }
}