package modelo;

public class Livro {

    private Long id;
    private String nome;

    public Livro(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }



    @Override
    public String toString() {
        return nome;
    }
}
