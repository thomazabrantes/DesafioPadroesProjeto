import java.util.Random;

public class Dado implements Historico{

    private int lados;
    private int valorJogada;
    private final Random random;

    public Dado(int lados) {
        this.lados = lados;
        this.random = new Random();
    }

    @Override
    public void rolar() {
        valorJogada = random.nextInt(lados) + 1;
    }

    @Override
    public int getValor() {
        return valorJogada;
    }


}
