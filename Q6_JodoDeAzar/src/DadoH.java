import java.util.ArrayList;
import java.util.Random;

public class DadoH implements Historico{
    private Historico dadoH;
    private Integer jogada;
    private ArrayList <Integer> historico; 
    private int countConsecutivas;
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

        for (int i = historico.size() - 1; i >= 0; i--) {
            if (historico.get(i) >= numerosGrandes) {
                countConsecutivas++;
                if (countConsecutivas >= 3) {
                    jogada = random.nextInt(numerosGrandes) + 1; 
                    break; 
                }
            } else {
                break; 
            }
        }


        historico.add(jogada);
    }
    

    public int getValor() {
        return dadoH.getValor();
    }

    public ArrayList <Integer> historico(){
        return historico;
    }
}