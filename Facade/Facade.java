public class Facade {
    
    private ClasseA classeA;
    private ClasseB classeB;
    private ClasseC classeC;

    public Facade() {
        classeA = new ClasseA();
        classeB = new ClasseB();
        classeC = new ClasseC();
    }

    public void metodoSimples() {
        System.out.println("Método simples do Facade");
        classeA.metodoA();
        classeB.metodoB();
    }

    public void metodoComplexo() {
        System.out.println("Método complexo do Facade");
        classeA.metodoA();
        classeC.metodoC();
    }
}
