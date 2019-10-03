package practica23;

/**
 *
 * @author 18PROGB0073
 */
public class Libro {
    private String Titulo;
    private String Autor;
    private int Numeroexistencia;
    private int Numeroprestados;

    public Libro() {
    }

    public Libro(String Titulo, String Autor, int Numeroexistencia, int Numeroprestados) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Numeroexistencia = Numeroexistencia;
        this.Numeroprestados = Numeroprestados;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroexistencia() {
        return Numeroexistencia;
    }

    public void setNumeroexistencia(int Numeroexistencia) {
        this.Numeroexistencia = Numeroexistencia;
    }

    public int getNumeroprestados() {
        return Numeroprestados;
    }

    public void setNumeroprestados(int Numeroprestados) {
        this.Numeroprestados = Numeroprestados;
    }
   
    
    }
  

