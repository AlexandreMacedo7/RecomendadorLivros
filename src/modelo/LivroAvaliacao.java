package modelo;

import java.util.Objects;

public class LivroAvaliacao {

    Livro livro;
    Double nota;

    public Livro getLivro() {
        return livro;
    }

    public Double getNota() {
        return nota;
    }

    public LivroAvaliacao(Livro livro, double nota) {
        this.livro = livro;
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LivroAvaliacao that)) return false;
        return livro.equals(that.livro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livro);
    }

    @Override
    public String toString() {
        return
                "\nLivro: " + livro +
                " - Nota: " + nota;
    }
}
