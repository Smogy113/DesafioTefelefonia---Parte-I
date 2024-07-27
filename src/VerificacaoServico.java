import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
            
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // Verificação do serviço na lista de serviços contratados
        int repeticao = 0;
        for (String parte : partes){
            if (parte.equals(servico)) {
                System.out.println("Sim");
                break;
            }
            else if (repeticao < partes.length){
                continue;
            }
            System.out.println("Nao");
            repeticao++;
        }
        System.out.println(repeticao + partes.length);
        
        scanner.close();
    }
}