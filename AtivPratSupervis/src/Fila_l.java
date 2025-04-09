// Fila dinâmica implementada com lista encadeada.
public class Fila_l {
    ListaEncadeada.No comeco;
    ListaEncadeada.No fim;

    ListaEncadeada dados;

    public Fila_l() {
        ListaEncadeada lista = new ListaEncadeada();
        // Usando 0 para representar vazio.
        lista.inserir(0);
        lista.inserir(0);

        comeco = lista.inicio;
        fim = comeco.proximo;
    }

    // Insere objeto no fim da fila
    public void adicionar(int elemento)
    {
        // caso para inicio
        if (vazia())
        {
            comeco.dado = elemento;
        }

        }
        else dados.inserir(elemento);

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
        else {
            elemento = dados[inicio];
            dados[inicio] = 0;
            // wrap
            if ( (inicio + 1) >= MAX) inicio = 0;
            else inicio++;

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
        if (comeco.dado == 0) return true;
        else return false;
    }

    public void imprimir(boolean debug)
    {
        dados.imprimir();
        if (debug) { System.out.printf("Início: %d | Fim: %d\n\n", comeco.dado, fim.dado); }
    }

}

