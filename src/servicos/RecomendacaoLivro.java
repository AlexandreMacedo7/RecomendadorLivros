package servicos;

import modelo.Aluno;
import modelo.LivroAvaliacao;

import java.util.ArrayList;

public class RecomendacaoLivro {


    public void recomendadorDeLivros(Aluno alunoBase, ArrayList<Aluno> listaAlunos) {
        Aluno alunoSemelhante = alunoMaisSemelhante(alunoBase, listaAlunos);

        ArrayList<LivroAvaliacao> livrosBase = alunoBase.getLivros();
        ArrayList<LivroAvaliacao> livrosSemelhante = alunoSemelhante.getLivros();

        LivroAvaliacao livroRecomendado = null;
        double maiorNota = -1;

        for (int i = 0; i < livrosBase.size(); i++) {
            if (livrosBase.get(i).getNota() == 0) {

                for (int j = 0; j < livrosSemelhante.size(); j++) {

                    if (livrosBase.get(i).equals(livrosSemelhante.get(j)) && livrosSemelhante.get(j).getNota() > 0) {
                        if (livrosSemelhante.get(j).getNota() > maiorNota) {
                            maiorNota = livrosSemelhante.get(j).getNota();
                            livroRecomendado = livrosSemelhante.get(j);
                        }
                    }

                }
            }
        }
        System.out.println(alunoBase);
        System.out.println("***************");
        System.out.println(alunoSemelhante);
        System.out.println("Livro recomendado: " + livroRecomendado);
    }


    private Aluno alunoMaisSemelhante(Aluno alunoBase, ArrayList<Aluno> listaAlunos) {

        Aluno alunoMaisSemelhante = null;

        int indiceAlunoSemelhante = calculoDesvioPadrao(alunoBase, listaAlunos);

        for (int i = 0; i < listaAlunos.size(); i++) {
            if (indiceAlunoSemelhante == i) {
                alunoMaisSemelhante = listaAlunos.get(i);
            }
        }
        return alunoMaisSemelhante;

    }

    private int calculoDesvioPadrao(Aluno alunoBase, ArrayList<Aluno> listaAlunos) {

        double minDesvioPadrao = Double.MAX_VALUE;
        int indiceMenorDesvioPadrao = -1;

        ArrayList<LivroAvaliacao> base = alunoBase.getLivros();

        for (int i = 0; i < listaAlunos.size(); i++) {

            double somaDosQuadrados = 0;

            for (int j = 0; j < base.size(); j++) {
                double notaBase = base.get(j).getNota();
                double notaComparavel = listaAlunos.get(i).getLivros().get(j).getNota();
                somaDosQuadrados += Math.pow(notaBase - notaComparavel, 2);
            }

            double desvioPadrao = Math.sqrt(somaDosQuadrados);

            if (desvioPadrao < minDesvioPadrao) {
                minDesvioPadrao = desvioPadrao;
                indiceMenorDesvioPadrao = i;
            }
        }
        return indiceMenorDesvioPadrao;
    }
}
