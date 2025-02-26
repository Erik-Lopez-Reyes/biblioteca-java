public class Libro {
    private String titulo;
    private Autor autor;  // Ahora almacena un objeto Autor
    private int añoPublicacion;
    private String isbn;
    private boolean prestado;

    // Constructor corregido para aceptar un objeto Autor
    public Libro(String titulo, Autor autor, int añoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;  // Guardamos el objeto Autor, no solo su nombre
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        this.prestado = false;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getInformacion() {
        return "Título: " + titulo + ", Autor: " + autor.getNombre() + 
               ", Año: " + añoPublicacion + ", ISBN: " + isbn + 
               ", Prestado: " + (prestado ? "Sí" : "No");
    }
}
