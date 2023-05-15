public class Aresta<T> {

    private Double Peso;
    private Vertice<T> Inicio;
    private Vertice<T> Fim;

    public Aresta(double _peso,  Vertice<T> _inicio, Vertice<T> _fim) {
        this.Peso = _peso;
        this.Inicio = _inicio;
        this.Fim = _fim;
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double peso) {
        Peso = peso;
    }
    public Vertice<T> getInicio() {
        return Inicio;
    }
    public void setInicio(Vertice<T> inicio) {
        Inicio = inicio;
    }
    public Vertice<T> getFim() {
        return Fim;
    }
    public void setFim(Vertice<T> fim) {
        Fim = fim;
    }

    
}
