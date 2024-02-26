class ConcreteElement implements Element {
    
    private String name;

    public ConcreteElement(String name) {
        this.name = name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    public String getName() {
        return name;
    }
}