import java.util.Date;

public class Prestamo {
    private Libro libro;
    private Lector lector;
    private Date fechaPrestamo;
    private boolean devuelto;

    public Prestamo(Libro libro, Lector lector) {
        this.libro = libro;
        this.lector = lector;
        this.fechaPrestamo = new Date();
        this.devuelto = false;
    }

    public Libro getLibro() {
        return libro;
    }

    public Lector getLector() {
        return lector;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void devolverLibro() {
        this.devuelto = true;
    }

    public String getInformacionPrestamo() {
        return "Libro: " + libro.getTitulo() + ", Lector: " + lector.getNombre() + 
               ", Fecha de préstamo: " + fechaPrestamo + ", Devuelto: " + (devuelto ? "Sí" : "No");
    }
}
