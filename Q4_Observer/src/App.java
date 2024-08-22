import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var cm = new CalculadorDeMedia(dados.getValores());
        var cs = new CalculadorDeSomatorio(dados.getValores());

        Scanner s = new Scanner(System.in);
        int valor = 0;
        while(true){
            System.out.println("\nEntre um valor (0=fim):");
            valor = Integer.parseInt(s.nextLine());
            if (valor == 0){
                break;
            }
            dados.add(valor);
            cs.defineValores(dados.getValores());
            System.out.println("Quantidade: "+dados.quantidade());
            System.out.println("Somatorio: "+cs.somatorio());
            cm.defineValores(dados.getValores());
            System.out.println("Media:"+cm.media());
        }
        System.out.println("Fim");
    }
}
