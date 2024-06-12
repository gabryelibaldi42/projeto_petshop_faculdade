public class Pet {
    private String raca;
    private String nome;
    private int idade;

    public Pet(String raca, String nome, int idade) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    // métodos de acesso
    public String getRaca() {
        return raca;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pet [raca=" + raca + ", nome=" + nome + ", idade=" + idade + "]";
    }
}