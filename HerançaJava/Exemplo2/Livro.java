public abstract class Livro {
    private String titulo;
    private String autor;
    private int isbn;

    public Livro(){
        
    } 

    
    public Livro(String titulo, String autor, int isbn) { // construtor 
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }


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


    public int getIsbn() {
        return isbn;
    }


    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public abstract boolean ValidaLivro();
    
}
