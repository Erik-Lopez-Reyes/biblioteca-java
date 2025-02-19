import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    // Constructor: inicializa la lista de libros como vacía
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método que regresa todos los libros en la biblioteca como una cadena
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro.getInformacion());
            }
        }
    }

    // Método para buscar un libro por su título
    public void buscarLibroPorTitulo(String titulo) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Libro encontrado: " + libro.getInformacion());
                System.out.println("¿Es antiguo? " + (libro.esAntiguo() ? "Sí" : "No"));
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El libro con título \"" + titulo + "\" no se encuentra en la biblioteca.");
        }
    }

    // Método para obtener la lista de libros (utilizado en el Main para el método esAntiguo)
    public ArrayList<Libro> getListaLibros() {
        return libros;
    }

    @Override
    public String toString() {
        return "Biblioteca con " + libros.size() + " libros.";
    }
}