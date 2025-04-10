// Classe Pilha2 com implementação do método popNTop
class Pilha2 {
    private int[] elementos;
    private int topo;
    private int capacidade;
    
    // Construtor
    public Pilha2(int tamanho) {
        this.elementos = new int[tamanho];
        this.topo = -1;
        this.capacidade = tamanho;
    }
    
    // Métodos básicos da Pilha2
    public boolean isEmpty() {
        return (topo == -1);
    }
    
    public boolean isFull() {
        return (topo == capacidade - 1);
    }
    
    public void push(int valor) {
        if (!isFull()) {
            elementos[++topo] = valor;
        } else {
            System.out.println("Erro: Pilha2 cheia!");
        }
    }
    
    public int pop() {
        if (!isEmpty()) {
            return elementos[topo--];
        } else {
            System.out.println("Erro: Pilha2 vazia!");
            return -1; // valor de erro
        }
    }
    
    public int peek() {
        if (!isEmpty()) {
            return elementos[topo];
        } else {
            System.out.println("Erro: Pilha2 vazia!");
            return -1; // valor de erro
        }
    }
    
    // Método para exibir a Pilha2
    public void exibir() {
        if (isEmpty()) {
            System.out.println("Pilha2 vazia!");
            return;
        }
        
        System.out.print("Pilha2: ");
        for (int i = 0; i <= topo; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
    
    // Retorna o número atual de elementos na Pilha2
    public int size() {
        return topo + 1;
    }
    
    /**
     * Remove n elementos do topo da Pilha2
     * @param n Quantidade de elementos a serem removidos
     * @throws Exception quando a quantidade de elementos é menor que n
     */
    public void popNTop(int n) throws Exception {
        // Verificar se n é um valor válido
        if (n < 0) {
            throw new Exception("Erro: O valor de n não pode ser negativo!");
        }
        
        // Verifica se a Pilha2 tem pelo menos n elementos
        if (size() < n) {
            throw new Exception("Erro: A Pilha2 possui apenas " + size() + 
                               " elementos, não é possível remover " + n + " elementos!");
        }
        
        // Remove n elementos do topo
        System.out.println("Removendo " + n + " elementos do topo da Pilha2...");
        for (int i = 0; i < n; i++) {
            int removido = pop();
            System.out.println("Elemento removido: " + removido);
        }
    }
}

