public class Pessoa implements Identificavel{
    //Atributos
    private Integer id;
    private String nomePessoa;

    //Construtores
    public Pessoa(Integer id, String nomePessoa) {
        this.id = id;
        this.nomePessoa = nomePessoa;
    }

    @Override
    public int getId() {
        return this.getId();
    }

    @Override
    public String toString() {
        return this.id + ", " + this.nomePessoa;
    }
}
