package modelo;

import java.util.ArrayList;

public class Aluno {

    private Long id;
    private String nome;

    private ArrayList<LivroAvaliacao> livroAvaliados = new ArrayList<LivroAvaliacao>();

    public Aluno() {
    }

    public Aluno(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<LivroAvaliacao> getLivros() {
        return livroAvaliados;
    }

    public void adicionarLivro(Livro livro, double nota){
        LivroAvaliacao livroAvaliado = new LivroAvaliacao(livro, nota);
        livroAvaliados.add(livroAvaliado);

    }


    @Override
    public String toString() {
        return "Aluno:" +
                "id:" + id +
                "\nNome: " + nome + '\'' +
                "\nLivros Avaliados: " + livroAvaliados;
    }
}
