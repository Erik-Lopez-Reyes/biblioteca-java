import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Prestamo> prestamos;

    // Constructor
    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para agregar un préstamo a la biblioteca
    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
        prestamo.getLibro().setPrestado(true);  // Marcamos el libro como prestado
    }

    // Método para devolver un libro
    public void devolverLibro(Prestamo prestamo) {
        prestamo.devolverLibro();
        prestamo.getLibro().setPrestado(false);  // Marcamos el libro como no prestado
    }

    // Método para obtener la lista de libros prestados
    public ArrayList<Libro> obtenerLibrosPrestados() {
        ArrayList<Libro> librosPrestados = new ArrayList<>();
        for (Prestamo prestamo : prestamos) {
            if (!prestamo.isDevuelto()) {
                librosPrestados.add(prestamo.getLibro());
            }
        }
        return librosPrestados;
    }

    // Método para obtener la lista de libros no prestados
    public ArrayList<Libro> obtenerLibrosNoPrestados() {
        ArrayList<Libro> librosNoPrestados = new ArrayList<>();
        for (Libro libro : libros) {
            if (!libro.isPrestado()) {
                librosNoPrestados.add(libro);
            }
        }
        return librosNoPrestados;
    }

    // Método para obtener la lista de préstamos
    public ArrayList<Prestamo> obtenerPrestamos() {
        return prestamos;
    }
}
