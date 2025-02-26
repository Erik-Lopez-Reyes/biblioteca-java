public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String isbn;

    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
    }

    // Getters y setters
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

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Métodos
    public String getInformacion() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año: " + añoPublicacion + ", ISBN: " + isbn;
    }

    public boolean esAntiguo() {
        return (2025 - añoPublicacion) > 20;
    }

    public String toString() {
        return getInformacion();
    }
}