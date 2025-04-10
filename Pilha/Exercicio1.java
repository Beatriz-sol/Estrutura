import java.util.Scanner;

public class Exercicio1 {
    private static final int TAM_PILHA = 200;
    
    public static void main(String[] args) {
        Pilha p = new Pilha(TAM_PILHA);
        int n, cont = 0;
        char resp;
        Scanner s = new Scanner(System.in);
        
        do {// leitura dos números
            System.out.print("Deseja fornecer um nro (S/N): ");
            resp = s.next().toUpperCase().charAt(0);
            if (resp == 'S') {
                System.out.print("Forneça o " + ++cont + " o nro: ");
                n = s.nextInt();
                p.push(n);
            }
        } while(( resp == 'S') && (cont < TAM_PILHA));
        
        // Minha solução começa aqui! 
        // Vou usar o método de duas pilhas auxiliares
        
        // Primeiro, vou verificar se a pilha está vazia
        if (p.isEmpty()) {
            System.out.println("A pilha está vazia. Nada a fazer.");
            s.close();
            return;
        }
        
        // Criando as pilhas auxiliares
        Pilha temp1 = new Pilha(TAM_PILHA);  // guarda temporariamente
        Pilha temp2 = new Pilha(TAM_PILHA);  // guarda os não múltiplos
        
        // Passo 1: Tirar todos os elementos da pilha original
        System.out.println("\nRemovendo múltiplos de 3 e 5...");
        
        while (!p.isEmpty()) {
            int elemento = p.pop();
            
            // Se o número for múltiplo de 3 E 5, descarta
            // Múltiplo de 3 E 5 é o mesmo que múltiplo de 15
            if (elemento % 15 == 0) {
                System.out.println("Removendo: " + elemento + " (múltiplo de 3 e 5)");
            } else {
                // Senão, guarda na pilha temporária
                temp1.push(elemento);
            }
        }
        
        // Passo 2: Inverter a ordem dos elementos (usando a segunda pilha temp)
        while (!temp1.isEmpty()) {
            temp2.push(temp1.pop());
        }
        
        // Passo 3: Devolver para a pilha original na ordem correta
        while (!temp2.isEmpty()) {
            p.push(temp2.pop());
        }
        
        // Mostrar o resultado
        System.out.println("\nPilha após remoção dos múltiplos de 3 e 5:");
        
        // Para mostrar, vamos usar uma pilha temporária de novo
        Pilha exibir = new Pilha(TAM_PILHA);
        
        if (p.isEmpty()) {
            System.out.println("A pilha ficou vazia após as remoções!");
        } else {
            while (!p.isEmpty()) {
                int valor = p.pop();
                System.out.print(valor + " ");
                exibir.push(valor);
            }
            
            // Restaurar a pilha original depois de exibir
            while (!exibir.isEmpty()) {
                p.push(exibir.pop());
            }
        }
        
        s.close();
    }
}