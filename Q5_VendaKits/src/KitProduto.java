import java.util.ArrayList;
import java.util.List;

public class KitProduto implements ComponenteProduto {
    private int id;
    private String nome;
    private List<ComponenteProduto> componentes;

    public KitProduto(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.componentes = new ArrayList<>();
    }

    public void adicionarProduto(ComponenteProduto produto) {
        componentes.add(produto);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome + " (Kit)";
    }

    @Override
    public double getPreco() {
        double precoTotal = 0.0;
        for (ComponenteProduto componente : componentes) {
            precoTotal += componente.getPreco();
        }
        return precoTotal;
    }
}
