// Lista encadeada circular.

public class ListaEncadeada {
    class No {
        int dado;
        No proximo;

        public No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    No inicio = null;

    // Insire um elemento no final da lista.
    public void inserir(int elemento)
    {
        No novoNo = new No(elemento);

        // Caso lista vazia
        if (inicio == null)
        {
            inicio = novoNo;
            novoNo.proximo = novoNo; // Aponta para ele mesmo

        // Caso geral
        } else {
            No atual = inicio;

            while (atual.proximo != inicio) { atual = atual.proximo; }

            // Chegando na cauda:
            atual.proximo = novoNo;
            novoNo.proximo = inicio;

        }
    }

    // Remove um elemento da lista
    public void remover(int pos)
    {
        // Nó a ser removido é o primeiro
        if (pos == 0)
        {
            // Lista com um elemento
            if (inicio.proximo == inicio)
            {
                inicio.proximo = null;
                inicio = null;
                return;
            }
            else {
                // Achar cauda
                No atual = inicio;
                while( atual.proximo != inicio ) {
                    atual = atual.proximo;
                }

                atual.proximo = inicio.proximo;
                inicio = atual.proximo;
                return;
            }
        }
        // Caso geral, percorre lista.
        No atual = inicio;
        No anterior = null;
        int contador = 1;

        while ((contador <= pos) && (atual.proximo != null))
        {
            // Guardar nó anterior para apagar referência
            if (contador == (pos - 1))
            {
                anterior = atual;
            }
            // Posição desejada
            if (contador == pos)
            {
                anterior.proximo = atual.proximo;
                return;
            }

            atual = atual.proximo;
            contador++;
        }

        System.out.println("Não foi possível encontrar o elemento a ser removido!");
    }

    public void imprimir()
    {
        if (inicio == null) {
            System.out.print("Lista vazia. Sem dados para impressão.");
        }

        No atual = inicio;
        System.out.print("Lista: ");
        if(atual.dado == 0) System.out.print("  |");
        else System.out.printf(" %d |", atual.dado);

        // Não imprime se for lista de um elemento.
        while (atual.proximo != inicio)
        {
            if(atual.dado == 0) System.out.print("  |");
            else System.out.printf(" %d |", atual.dado);
            atual = atual.proximo;
        }
        System.out.println();
    }
}
