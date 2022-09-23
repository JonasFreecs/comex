package comex;

public class ProdutoIsento extends Produto {
	
	@Override
	public double calculaImposto() {
		return 0;
	}
	
	@Override
	public double calculaEstoque() {
		return super.calculaEstoque();
	}

}
