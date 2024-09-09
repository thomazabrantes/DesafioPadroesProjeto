//componente extra de visualização
import java.util.List;

public class VisualizadorDeMultiplicacao implements Visualizador{
    private List<Integer> valores;

    public VisualizadorDeMultiplicacao(List<Integer> valores) {
        this.valores = valores;
    }

    @Override
    public void acrescentaValor(Integer valor) {
        this.valores.add(valor);
    }

    @Override
    public void exibe() {
        Integer produto = valores.stream()
            .reduce(1, (a, b) -> a * b);
        System.out.println("Produto: " + produto + ", quantidade de elementos analisados: " + valores.size());
    }
    
}
