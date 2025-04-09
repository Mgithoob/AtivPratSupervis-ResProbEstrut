// Pilha dinâmica implementada com lista encadeada.

public class Pilha_l {
    ListaEncadeada.No topo;
    ListaEncadeada dados;

    public Pilha_l()
    {
        this.dados = new ListaEncadeada();
        // Usando 0 para representar vazio.
        this.dados.inserir(0);
        topo = this.dados.inicio;
    }

    public int olharTopo() {
        if(!vazia()) {
            ListaEncadeada.No procura = this.dados.inicio;
            // procurar pos fim
            while (procura.proximo != topo) {
                procura = procura.proximo;
            }
            return procura.dado;
        }

        System.out.println("A pilha está vazia. Não é possível acessar elementos.");
        return -1;
    }

    // Adicionar ao topo da pilha
    public void adicionar(int novo_item) {
        topo.dado = novo_item;
        this.dados.inserir(0);
        topo = topo.proximo;
    }

    // Retirar obj no topo da pilha
    // Deve retornar int em topo.dado
    public int retirar() {
        if (!vazia()){
            int elemento = topo.dado;
            System.out.printf("Retirando o elemento [%d]...", elemento);

            this.dados.remover(0);
            topo = this.dados.inicio;
            return elemento;
        }

        System.out.println("A pilha está vazia. Não é possível acessar elementos.");
        return -1;
    }

    // Verifica se pilha está vazia.
    private boolean vazia(){
        ListaEncadeada.No procura = this.dados.inicio;

        // procurar pos final
        while (procura.proximo != topo) {
            if (procura.dado != 0) return false;
            procura = procura.proximo;
        }

        return true;
    }

    public void imprimir(boolean debug)
    {
        this.dados.imprimir();
        if (debug && (topo != null)) System.out.printf("Dado topo: %d\n\n", topo.dado);
    }
}
