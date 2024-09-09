import java.util.ArrayList;
import java.util.Random;

public class DadoH implements Historico{
    private Historico dadoH; // Objeto a ser decorado
    private Integer jogada;
    private ArrayList <Integer> historico; //Lista para guardar o valor dos dados rolados
    private int countConsecutivas; // saber quantas vezes consecutivas um número alto foi rodado
    private int lados;
    private final Random random;


    @SuppressWarnings("unchecked")
    public DadoH(Historico dadoH, int lados) {
        this.random = new Random();
        this.dadoH = dadoH;
        this.historico = new ArrayList();
        this.lados = lados;
    }

    public void rolar() {
        dadoH.rolar();
        jogada = dadoH.getValor();
        countConsecutivas = 0;
        int numerosGrandes = (lados /2);

        //For para descobrir a partir do ArrayList historico, se as últimas 3 jogadas tiveram números maiores que lados/2
        for (int i = historico.size() - 1; i >= 0; i--) {
            if (historico.get(i) >= numerosGrandes) {
                countConsecutivas++;
                if (countConsecutivas >= 3) { //Se ter 3 ou mais jogadas consecutivas com números grandes
                    jogada = random.nextInt(numerosGrandes) + 1; // refaz a jogada com random usando números menores que lados/2
                    break; 
                }
            } else {
                break; 
            }
        }

        historico.add(jogada); // adiciona o valor da jogada no histórico
    }
    

    public int getValor() {
        return dadoH.getValor();
    }

    public ArrayList <Integer> historico(){
        return historico; // retorna o ArrayList do histórico das jogadas
    }
}