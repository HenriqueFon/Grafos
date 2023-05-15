import java.util.ArrayList;

import model.Pessoa;

/*Classe responsável por montar o grafo em sí.
 * Nela temos as definições dos vertices e arestas.
 */
public class Grafo {

    private ArrayList<Vertice<Pessoa>> vertices;
    private ArrayList<Aresta<Pessoa>> arestas;

    public Grafo() {
        this.vertices = new ArrayList<Vertice<Pessoa>>();
        this.arestas = new ArrayList<Aresta<Pessoa>>();
    }

    /**
     * Função para adicionar um Vértice no nosso grafo.
     * Recebe um dado do Tipo Pessoa, transforma em um objeto Vertice<Pessoa>
     * Adiciona a lista de Vertices do grafo
     * @param dado Pessoa
     */
    public void adicionarVertice(Pessoa dado) {
        Vertice<Pessoa> novoVertice = new Vertice<Pessoa>(dado);
        this.vertices.add(novoVertice);
    } 


    /**
     * Função para adicionar uma Aresta no nosso grafo.
     * Por se tratar de um caminho entre vértices, recebe um peso a aresta
     * Uma referência do vértice ao qual a aresta em questão sai
     * Uma referência do vértice ao qual a aresta em questão chega
     * Adiciona a lista de arestas do grafo
     * @param peso Double
     * @param dadoInicio Pessoa
     * @param dadoFim Pessoa
     */
    public void adicionarAresta(Double peso, Pessoa dadoInicio, Pessoa dadoFim) {
        Vertice<Pessoa> inicio = this.getVertice(dadoInicio);
        Vertice<Pessoa> fim = this.getVertice(dadoFim);
        Aresta<Pessoa> aresta = new Aresta<Pessoa>(peso, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }

    /**
     * Verifica se o vértice inserido existe na lista de vértices do Grafo
     * Caso exista retorna o vértice existente
     * @param dado Pessoa
     * @return Vertice<Pessoa> vertice
     */
    public Vertice<Pessoa> getVertice(Pessoa dado) {
        Vertice<Pessoa> vertice = null;
        for(int i = 0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).getDado().equals(dado)) {
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }
}
