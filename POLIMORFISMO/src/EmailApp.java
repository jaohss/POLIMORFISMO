import java.util.Scanner;
public class EmailApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Instanciando os objetos
        Pessoa p1 = new Pessoa("null", "null", "null");
        
        //Entrada dos dados de implementação do objeto
        System.out.println("Digite o nome do destinatário: ");
        p1.setNome(scn.nextLine());

        System.out.println("Insira o título honorifico/função do destinatário: ");
        p1.setFuncao(scn.nextLine());

        System.out.println("Escreva a sua mensagem a ser enviada:");
        p1.setMensagem(scn.nextLine());

        //Saída de dados exibindo o Email
        System.out.println(p1.enviarEmail());

        scn.close();
    }
    
}
