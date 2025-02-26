import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Prestamo> prestamos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
        prestamo.getLibro().setPrestado(true);
    }

    public void devolverLibro(Prestamo prestamo) {
        prestamo.devolverLibro();
        prestamo.getLibro().setPrestado(false);
    }

    public ArrayList<Libro> obtenerLibrosPrestados() {
        ArrayList<Libro> librosPrestados = new ArrayList<>();
        for (Prestamo prestamo : prestamos) {
            if (!prestamo.isDevuelto()) {
                librosPrestados.add(prestamo.getLibro());
            }
        }
        return librosPrestados;
    }

    public ArrayList<Libro> obtenerLibrosNoPrestados() {
        ArrayList<Libro> librosNoPrestados = new ArrayList<>();
        for (Libro libro : libros) {
            if (!libro.isPrestado()) {
                librosNoPrestados.add(libro);
            }
        }
        return librosNoPrestados;
    }

    public ArrayList<Prestamo> obtenerPrestamos() {
        return prestamos;
    }
}
