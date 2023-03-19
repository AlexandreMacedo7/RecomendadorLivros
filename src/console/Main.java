package console;

import modelo.Livro;
import modelo.Aluno;
import servicos.RecomendacaoLivro;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

        Livro livro1 = new Livro(1l, "Livro A");
        Livro livro2 = new Livro(2l, "Livro B");
        Livro livro3 = new Livro(3l, "Livro C");
        Livro livro4 = new Livro(4l, "Livro D");
        Livro livro5 = new Livro(5l, "Livro E");

        Aluno alunoBase = new Aluno(1l, "Alexandre");

        Aluno aluno2 = new Aluno(2l, "Luiza");
        Aluno aluno3 = new Aluno(3l, "Cristiano");
        Aluno aluno4 = new Aluno(4l, "Bruna");
        Aluno aluno5 = new Aluno(5l, "Sandra");


        alunoBase.adicionarLivro(livro1,4);
        alunoBase.adicionarLivro(livro2,3);
        alunoBase.adicionarLivro(livro3,0);
        alunoBase.adicionarLivro(livro4,0);
        alunoBase.adicionarLivro(livro5,0);


        aluno2.adicionarLivro(livro1, 4);
        aluno2.adicionarLivro(livro2, 3);
        aluno2.adicionarLivro(livro3, 2);
        aluno2.adicionarLivro(livro4, 5);
        aluno2.adicionarLivro(livro5, 5);

        aluno3.adicionarLivro(livro1, 3);
        aluno3.adicionarLivro(livro2, 3);
        aluno3.adicionarLivro(livro3, 1);
        aluno3.adicionarLivro(livro4, 5);
        aluno3.adicionarLivro(livro5, 5);

        aluno4.adicionarLivro(livro1, 1);
        aluno4.adicionarLivro(livro2, 3);
        aluno4.adicionarLivro(livro3, 5);
        aluno4.adicionarLivro(livro4, 5);
        aluno4.adicionarLivro(livro5, 2);

        aluno5.adicionarLivro(livro1, 5);
        aluno5.adicionarLivro(livro2, 5);
        aluno5.adicionarLivro(livro3, 4);
        aluno5.adicionarLivro(livro4, 3);
        aluno5.adicionarLivro(livro5, 5);

        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno4);
        listaAlunos.add(aluno5);


        RecomendacaoLivro recomendacaoLivro = new RecomendacaoLivro();

        recomendacaoLivro.recomendadorDeLivros(alunoBase, listaAlunos);

    }
}