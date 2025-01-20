
private class Alfabeto extends Pictograma {
    private List<String> letras;
    private String interpretacion;

    public Alfabeto(String origen, List<String> letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public List<String> getLetras() {
        return letras;
    }

    public void setLetras(List<String> letras) {
        this.letras = letras;
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
        return String.join(", ", letras);
    }

    public int cantidadLetras() {
        return letras.size();
    }
}