public class ItemDeVenda {
    private ComponenteProduto produto;
    private int quantidade;

    public ItemDeVenda(ComponenteProduto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ComponenteProduto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubTotal() {
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return String.format("%d %s %d x %.2f = %.2f%n",produto.getId(), produto.getNome(), quantidade, produto.getPreco(), getSubTotal());
    }
}
