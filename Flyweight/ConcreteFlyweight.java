class ConcreteFlyweight implements Flyweight {

    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }
    
    public void operation() {
        System.out.println("Operação executada com o estado intrínseco " + intrinsicState);
    }
}