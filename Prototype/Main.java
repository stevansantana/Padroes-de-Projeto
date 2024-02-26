
public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Mike", 4, "Shih-tzu");
        Cachorro cachorro2 = (Cachorro) cachorro1.clone();

        System.out.println("Cachorro 1: " + cachorro1.getNome() + " " + cachorro1.getIdade() + " " + cachorro1.getRaca());
        System.out.println("Cachorro 2: " + cachorro2.getNome() + " " + cachorro2.getIdade() + " " + cachorro2.getRaca());

        cachorro2.setNome("Tomas");
        cachorro2.setIdade(2);
        cachorro2.setRaca("Vira-lata");

        System.out.println("Cachorro 1: " + cachorro1.getNome() + " " + cachorro1.getIdade() + " " + cachorro1.getRaca());
        System.out.println("Cachorro 2: " + cachorro2.getNome() + " " + cachorro2.getIdade() + " " + cachorro2.getRaca());
    }
}