class Pilha3  {
    private int[] elementos;
    private int topo;
    private int capacidade;
    
    // Construtor
    public Pilha3 (int tamanho) {
        this.elementos = new int[tamanho];
        this.topo = -1;
        this.capacidade = tamanho;
    }
    
    // Métodos básicos da Pilha3 
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
            System.out.println("Erro: Pilha3  cheia!");
        }
    }
    
    public int pop() {
        if (!isEmpty()) {
            return elementos[topo--];
        } else {
            System.out.println("Erro: Pilha3  vazia!");
            return -1;
        }
    }
    
    public int peek() {
        if (!isEmpty()) {
            return elementos[topo];
        } else {
            System.out.println("Erro: Pilha3  vazia!");
            return -1;
        }
    }
    
    // Método para exibir a Pilha3 
    public void exibir() {
        if (isEmpty()) {
            System.out.println("Pilha3  vazia!");
            return;
        }
        
        System.out.print("Pilha3 : ");
        for (int i = 0; i <= topo; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
    
    /**
     * Inverte o conteúdo da Pilha3 
     */
    public void invert() {
        // Se a Pilha3  está vazia ou tem apenas um elemento, não precisa inverter
        if (topo <= 0) {
            return;
        }
        
        // Crio um vetor auxiliar para guardar os elementos
        int[] aux = new int[topo + 1];
        int i = 0;
        
        // Copio os elementos para o vetor auxiliar
        while (!isEmpty()) {
            aux[i++] = pop();
        }
        
        // Recoloco os elementos na Pilha3  (já invertidos)
        for (int j = 0; j < i; j++) {
            push(aux[j]);
        }
    }
}
