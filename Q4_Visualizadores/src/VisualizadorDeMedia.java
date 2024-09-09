import java.util.List;

public class VisualizadorDeMedia implements Visualizador{
    private List<Integer> valores;

    public VisualizadorDeMedia(List<Integer> valores){
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
        double media = valores.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("Media: "+media+", quantidade de elementos analisados: "+valores.size());
    }
}
