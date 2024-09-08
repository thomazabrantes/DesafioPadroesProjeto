import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendasEmMemoria implements VendasFachada {
	private List<ComponenteProduto> produtos;

	public VendasEmMemoria() {
		produtos = new ArrayList<>();

		// Produtos simples
		ProdutoSimples caneta = new ProdutoSimples(1, "Caneta", 1.55);
		ProdutoSimples borracha = new ProdutoSimples(2, "Borracha", 1.15);
		ProdutoSimples caderno = new ProdutoSimples(3, "Caderno", 32.99);

		// Kit de produtos
		KitProduto kitEscola = new KitProduto(4, "Kit Escolar");
		kitEscola.adicionarProduto(caneta);
		kitEscola.adicionarProduto(borracha);
		kitEscola.adicionarProduto(caderno);

		produtos.add(caneta);
		produtos.add(borracha);
		produtos.add(caderno);
		produtos.add(kitEscola);
	}

	@Override
	public Venda iniciarVenda() {
		return new Venda(LocalDateTime.now());
	}

	@Override
	public void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade) {
		ComponenteProduto prod = produtos.stream().filter(p -> p.getId() == codigoProduto).findFirst().get();
		umaVenda.registrarVenda(prod, quantidade);
	}

	@Override
	public String emitirComprovante(Venda umaVenda) {
		return umaVenda.emitirComprovante();
	}

	@Override
	public List<ComponenteProduto> buscarProdutos() {
		return Collections.unmodifiableList(produtos);
	}
}
