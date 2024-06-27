public class Produto {

    public int codigo;
    public String descricao;
    public double precoDeCompra;
    public double precoDeVenda;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(double precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public String getStatusDoProduto() {
        return StatusDoProduto;
    }

    public void setStatusDoProduto(String statusDoProduto) {
        StatusDoProduto = statusDoProduto;
    }

    public String StatusDoProduto;


}
