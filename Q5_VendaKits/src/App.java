import java.util.List;

public class App {
    public static void main(String[] args) {
        VendasFachada proc = new VendasEmMemoria();
        List<ComponenteProduto> produtos = proc.buscarProdutos();
        Venda venda = proc.iniciarVenda();
        
        // Venda de produtos simples
        proc.registrarVenda(venda, produtos.get(0).getId(), 1);
        proc.registrarVenda(venda, produtos.get(1).getId(), 2);
        
        // Venda de um kit
        proc.registrarVenda(venda, produtos.get(3).getId(), 1);
        
        System.out.println(proc.emitirComprovante(venda));
    }
}
