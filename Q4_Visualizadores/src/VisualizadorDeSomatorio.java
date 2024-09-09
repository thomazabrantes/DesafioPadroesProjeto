import java.util.List;

public class VisualizadorDeSomatorio implements Visualizador{
    private List<Integer> valores;

    public VisualizadorDeSomatorio(List<Integer> valores){
        this.valores = valores;
    }

    public void defineValores(List<Integer> valores){
        this.valores = valores;
    }

    //classes que implementam a interface
    @Override
    public void acrescentaValor(Integer valor){
        this.valores.add(valor);
    }

    @Override
    public void exibe(){
        Integer soma = valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatorio: "+soma+", quantidade de elementos analisados: "+valores.size());
    }
}
