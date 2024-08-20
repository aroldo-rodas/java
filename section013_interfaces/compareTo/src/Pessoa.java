//Determinar que a classe irá implementar o comparable
public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private Integer idade;
    
    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.idade;
    }

    //Lógica do compareTo
    @Override
    public int compareTo(Pessoa pessoa) {
        if(this.idade < pessoa.getIdade()) {
            return -1;
        }
        else if (this.idade > pessoa.getIdade()) {
            return 1;
        }
        return 0;
    }    
}
