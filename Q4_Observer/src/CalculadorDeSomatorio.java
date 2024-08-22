import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CalculadorDeSomatorio {
    private List<Integer> valores;

    public CalculadorDeSomatorio(List<Integer> valores){
        this.valores = valores;
    }

    public void defineValores(List<Integer> valores){
        this.valores = valores;
    }

    public Integer somatorio(){
        return valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
    }

    public Integer quantidade(){
        return valores.size();
    }
}
