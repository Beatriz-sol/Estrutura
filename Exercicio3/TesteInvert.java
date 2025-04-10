import java.util.Scanner;

// Programa principal para testar o método invert
public class TesteInvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Programa para testar o método invert da classe Pilha3 ");
        System.out.println("---------------------------------------------------");
        
        // Cria uma Pilha3  com tamanho 10
        Pilha3  p = new Pilha3 (10);
        
        // Menu de opções
        int opcao = 0;
        do {
            System.out.println("\nOpções:");
            System.out.println("1 - Inserir elemento na Pilha3 ");
            System.out.println("2 - Remover elemento da Pilha3 ");
            System.out.println("3 - Mostrar Pilha3 ");
            System.out.println("4 - Inverter Pilha3 ");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser inserido: ");
                    int valor = scanner.nextInt();
                    p.push(valor);
                    break;
                    
                case 2:
                    int removido = p.pop();
                    if (removido != -1) {
                        System.out.println("Valor removido: " + removido);
                    }
                    break;
                    
                case 3:
                    p.exibir();
                    break;
                    
                case 4:
                    System.out.println("Invertendo a Pilha3 ...");
                    p.invert();
                    System.out.println("Pilha3  invertida!");
                    p.exibir();
                    break;
                    
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (opcao != 0);
        
        scanner.close();
    }
}