package abstractFactory;

public class FactoryConcreta1 implements AbstractFactory {
	
	   public ProdutoA criarProdutoA() {
		   
	      return new ProdutoA1();
	   }

	   public ProdutoB criarProdutoB() {
		   
	      return new ProdutoB1();
	   }
}