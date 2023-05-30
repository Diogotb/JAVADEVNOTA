package POOHeranca;

public abstract class Pessoas {
    //superclasse
    //atributos
    String nome;
    String endereco;
    int idade;
    String sexo;
    String rg;

    public abstract String getRg() {
        return rg;
    }
    public abstract void setRg(String rg) {
        this.rg = rg;
    }
    //gets and sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
