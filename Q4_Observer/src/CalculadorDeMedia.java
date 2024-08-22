import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CalculadorDeMedia {
    private List<Integer> valores;

    public CalculadorDeMedia(List<Integer> valores){
        this.valores = valores;
    }

    public void defineValores(List<Integer> valores){
        this.valores = valores;
    }

    public Integer quantidade(){
        return valores.size();
    }

    public double media(){
        return valores.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
    }
}
