public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private boolean disponivel;

    // Construtor
    private Livro(int id, String titulo, String autor){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;

    }
}