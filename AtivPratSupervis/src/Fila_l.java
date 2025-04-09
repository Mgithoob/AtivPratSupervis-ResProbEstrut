// Fila dinâmica implementada com lista encadeada.

public class Fila_l {
    ListaEncadeada.No comeco;
    ListaEncadeada.No fim;

    ListaEncadeada dados;

    public Fila_l() {
        this.dados = new ListaEncadeada();
        // Usando 0 para representar vazio.
        this.dados.inserir(0);
        this.comeco = dados.inicio;
        this.dados.inserir(0);
        this.fim = dados.inicio.proximo;
        this.fim.proximo = this.comeco;
    }

    // Insere objeto no fim da fila
    public void adicionar(int elemento)
    {
        if (vazia())
        {
            if ((comeco != null) || (this.dados.inicio == null)) {
                this.dados.inserir(0);
            }
            comeco = this.dados.inicio;

            this.comeco.dado = elemento;
        }
        else {
            this.dados.inserir(elemento);
            comeco = comeco.proximo;

            // Resetar ponteiro de fim
            if (fim.dado == 0) {
                ListaEncadeada.No procura = dados.inicio;
                int contador = 0;

                // procurar pos fim
                while (procura.proximo != comeco) {
                    procura = procura.proximo;
                    contador++;
                }
                dados.remover(contador);

                fim = procura;
            }
        }

    }

    // Retira objeto do começo da fila
    public int retirar()
    {
        int elemento;

        if (vazia())
        {
            System.out.println("A fila está vazia. Não é possível acessar elementos.\nFila:\n");
            imprimir(true);
            return -1;
        }
        // Para lista de 1 elemento
        else if (comeco == fim) {
            elemento = comeco.dado;
            this.dados.remover(0);
            return elemento;
        }
        else {
            elemento = comeco.dado;
            comeco = comeco.proximo;
            this.dados.remover(0);


            // Resetar ponteiro de fim
            if (fim.dado == 0) {
                ListaEncadeada.No procura = dados.inicio;
                int contador = 0;

                // procurar pos fim
                while (procura.proximo != comeco) {
                    procura = procura.proximo;
                    contador++;
                }
                dados.remover(contador);

                fim = procura;
            }

            System.out.printf("Elemento removido: [%d]\n", elemento);
            return elemento;
        }
    }

    // Retorna item do começo da fila
    public int olhar(){
        int elemento;

        if (vazia())
        {
            System.out.println("A fila está vazia. Não é possível acessar elementos.\nFila:\n");
            imprimir(true);
            return -1;
        }
        else {
            elemento = comeco.dado;
            return elemento;
        }
    }

    // Verifica se fila está vazia
    public boolean vazia()
    {
        if ((comeco.dado == 0 || (comeco == null))) return true;
        else return false;
    }

    public void imprimir(boolean debug)
    {
        this.dados.imprimir();
        if (debug && ((comeco != null) && (fim != null))) {
            System.out.printf("Início dado: %d | Fim dado: %d\n\n", comeco.dado, fim.dado);
        }
    }

}

