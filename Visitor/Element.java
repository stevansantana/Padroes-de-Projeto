interface Element {
    
    void accept(Visitor visitor);
    String getName();
}