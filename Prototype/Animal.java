
public abstract class Animal implements Cloneable {

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getNome() {

        return nome;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    public int getIdade() {
        
        return idade;
    }

    public abstract Animal clone();
}