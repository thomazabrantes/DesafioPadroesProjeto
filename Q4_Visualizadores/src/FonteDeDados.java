import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private List<Visualizador> visualizadores;

    public FonteDeDados(){
        lst = new LinkedList<>();
        visualizadores = new ArrayList<>();
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notifyVisualizadores(value);
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }

    //para manter registro dos visualizadores
    public void addVisualizador(Visualizador visualizador) {
        visualizadores.add(visualizador);
    }

    private void notifyVisualizadores(Integer valor) {
        for (Visualizador v : visualizadores) {
            v.acrescentaValor(valor);
        }
    }
}