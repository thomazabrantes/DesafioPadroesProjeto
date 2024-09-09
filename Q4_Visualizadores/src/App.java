import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var cm = new VisualizadorDeMedia(dados.getValores());
        var cs = new VisualizadorDeSomatorio(dados.getValores());

        Scanner s = new Scanner(System.in);
        int valor = 0;
        while(true){
            //area para selecionar os observers
            System.out.printf("\nSelecione qual visualizador deseja ligar:\n a)Somatório   b)Média   c)Sair\n");
            while(true){
                String opcao = s.nextLine();
                if (opcao.equals("a")) {
                    dados.addVisualizador(cs);
                    System.out.println("Visualizador de Somatorio ligado.");
                } 
                else if (opcao.equals("b")) {
                    dados.addVisualizador(cm);
                    System.out.println("Visualizador de Media ligado.");
                }
                else if(opcao.equals("c")){
                    break;
                }
            }

            //area para realizar a solução
            System.out.println("\nEntre um valor positivo maior que zero (0=fim):");
            valor = Integer.parseInt(s.nextLine());
            if (valor == 0){
                break;
            } 
            else {
                dados.add(valor);
            }

            System.out.println("\nResultados Finais:");
            cm.exibe();
            cs.exibe();
        }
        System.out.println("Fim");
    }
}
