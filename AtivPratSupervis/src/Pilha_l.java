// Pilha dinâmica implementada com lista encadeada.

public class Pilha_l {
    ListaEncadeada.No topo;
    ListaEncadeada dados;

    public Pilha_l()
    {
        ListaEncadeada lista = new ListaEncadeada();
        // Usando 0 para representar vazio.
        lista.inserir(0);
        topo = lista.inicio;
    }

    public int olharTopo() {
        if(!vazia()) return topo.dado;

        System.out.println("A pilha está vazia. Não é possível acessar elementos.");
        return -1;
    }

    // Adicionar ao topo da pilha
    public void adicionar(int novo_item) {
        // caso inicial
        if (vazia()){
            topo.dado = novo_item;
            return;
        }

        dados.inserir(novo_item);
        topo = topo.proximo;
    }

    // Retirar obj no topo da pilha
    // Deve retornar int em topo.dado
    public int retirar() {
        if (!vazia()){
            int elemento = topo.dado;
            dados.remover(0);
            topo = dados.inicio;
            return elemento;
        }

        System.out.println("A pilha está vazia. Não é possível acessar elementos.");
        return -1;
    }

    // Verifica se pilha está vazia.
    private boolean vazia(){
        if (topo.dado == 0) return true;
        else return false;
    }

    public void imprimir(boolean debug)
    {
        dados.imprimir();
        if (debug) System.out.printf("Dado topo: %d\n\n", topo.dado);
    }
}
