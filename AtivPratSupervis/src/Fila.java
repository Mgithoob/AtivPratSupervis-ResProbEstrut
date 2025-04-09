// Fila estática implementada com vetor.

public class Fila {
    private int inicio;
    private int fim;
    private final int MAX;

    private final int[] dados;

    public Fila(int MAX) {
        this.MAX = MAX;
        dados = new int[MAX];
        inicio = 0;
        fim = 0;
    }

    public int getInicio() {
        return inicio;
    }
    public int getFim() {
        return fim;
    }
    public int getMAX() {
        return MAX;
    }

    // Insere objeto no fim da fila
    public void inserir(int elemento)
    {
        // caso para inicio
        if (vazia())
        {
            dados[fim] = elemento;
            fim++;
        }
        else if (cheia())
        {
            System.out.printf("Fila cheia. Elemento [%d] não pôde ser adicionado.\nFila:\n", elemento);
            imprimir(true);
        }
        else if ((fim + 1) > (MAX - 1) ){ // wrap da lista circular
            dados[fim] = elemento;
            fim = 0;
        } else {
            // caso geral
            dados[fim] = elemento;
            fim++;
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
            elemento = dados[inicio];
            return elemento;
        }
    }

    // Verifica se fila está cheia
    public boolean cheia()
    {
        if ( ((fim + 1) % MAX) == inicio ) return true;
        else return false;
    }

    // Verifica se fila está vazia
    public boolean vazia()
    {
        if ((inicio == fim)) return true;
        else return false;
    }

    public void imprimir(boolean debug)
    {
        for (int d : dados)
        {
            if (d > 0) { System.out.printf(" %d |", d); }
            else System.out.print("   |");
        }
        System.out.print('\n');

        if (debug) { System.out.printf("Início: %d | Fim: %d\n\n", inicio, fim); }
    }

}
