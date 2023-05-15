import java.util.ArrayList;

public class Vertice<Pessoa> {

    private Pessoa dado;
    private ArrayList<Aresta<Pessoa>> arestasEntrada;
    private ArrayList<Aresta<Pessoa>> arestasSaida;

    public Vertice(Pessoa valor) {
        this.dado = valor;
        this.arestasEntrada = new ArrayList<Aresta<Pessoa>>();
        this.arestasSaida = new ArrayList<Aresta<Pessoa>>();
    }

    public Pessoa getDado() {
        return dado;
    }

    public void setDado(Pessoa dado) {
        this.dado = dado;
    }

    /**
     * Recebe as arestas que são antecessores da aresta em questão(referência o vértice atual)
     * @param aresta
     */
    public void adicionarArestaEntrada(Aresta<Pessoa> aresta) {
        this.arestasEntrada.add(aresta);
    }

    /**
     * Recebe as arestas que são sucessoras da aresta em questão(referenciam os próximos vértices)
     * @param aresta
     */
    public void adicionarArestaSaida(Aresta<Pessoa> aresta) {
        this.arestasSaida.add(aresta);
    }
}
