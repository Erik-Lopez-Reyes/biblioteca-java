public class Main {
    public static void main(String[] args) {
        // Crear autores
        Autor autor1 = new Autor(1, "Gabriel García Márquez", "gabriel@correo.com");
        Autor autor2 = new Autor(2, "Miguel de Cervantes", "cervantes@correo.com");

        // Crear libros con objeto Autor
        Libro libro1 = new Libro("Cien años de soledad", autor1, 1967, "1234567890");
        Libro libro2 = new Libro("Don Quijote de la Mancha", autor2, 1605, "0987654321");

        // Crear lectores
        Lector lector1 = new Lector(1, "Juan Pérez");
        Lector lector2 = new Lector(2, "María López");

        // Crear biblioteca y agregar libros
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Crear préstamos
        Prestamo prestamo1 = new Prestamo(libro1, lector1);
        Prestamo prestamo2 = new Prestamo(libro2, lector2);

        // Agregar préstamos a la biblioteca
        biblioteca.agregarPrestamo(prestamo1);
        biblioteca.agregarPrestamo(prestamo2);

        // Mostrar libros prestados
        System.out.println("Libros prestados:");
        for (Libro libro : biblioteca.obtenerLibrosPrestados()) {
            System.out.println(libro.getTitulo());
        }

        // Mostrar libros no prestados
        System.out.println("\nLibros no prestados:");
        for (Libro libro : biblioteca.obtenerLibrosNoPrestados()) {
            System.out.println(libro.getTitulo());
        }

        // Devolver un libro
        biblioteca.devolverLibro(prestamo1);

        // Mostrar libros prestados después de devolver uno
        System.out.println("\nLibros prestados después de devolver uno:");
        for (Libro libro : biblioteca.obtenerLibrosPrestados()) {
            System.out.println(libro.getTitulo());
        }
    }
}
