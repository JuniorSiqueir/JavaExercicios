package Alura.DesafioPOO.Desafio2;

public class livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void fichaLivro() {
        System.out.println(getAutor());
        System.out.println(getTitulo());
    }

}
