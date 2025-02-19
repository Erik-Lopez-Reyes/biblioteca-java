public class Main {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "1234567890");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "0987654321");
        Libro libro3 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954, "1122334455");

        // Crear biblioteca y agregar libros
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Mostrar todos los libros
        System.out.println("Listado de libros en la biblioteca:");
        biblioteca.mostrarLibros();

        // Buscar un libro por título
        System.out.println("\nBuscando el libro \"Don Quijote de la Mancha\":");
        biblioteca.buscarLibroPorTitulo("Don Quijote de la Mancha");

        System.out.println("\nBuscando un libro que no existe:");
        biblioteca.buscarLibroPorTitulo("El principito");

        // Mostrar si los libros son antiguos
        System.out.println("\n¿Los libros son antiguos?");
        for (Libro libro : biblioteca.getListaLibros()) {
            System.out.println("El libro \"" + libro.getTitulo() + "\" es antiguo: " + libro.esAntiguo());
        }
    }
}