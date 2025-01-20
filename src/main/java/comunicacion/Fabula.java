package comunicacion;
import java.util.List;
import java.util.ArrayList;

public class Fabula extends Escrito {
    private String ensenanzas;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanzas() {
        return ensenanzas;
    }

    public void setEnsenanzas(String ensenanzas) {
        this.ensenanzas = ensenanzas;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + ensenanzas;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina * getPaginas();
    }
}
