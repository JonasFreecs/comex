package comex;

public class mainProduto {
	public static void main(String[] args) {
		
		Produto p1 = new ProdutoTributado();
		p1.setId(1);
		p1.setNome("Notebook Samsung");
		p1.setPrecoUnitario(3253);
		p1.setQuantidadeEstoque(1);	
		p1.setCategoria("Informatica");
	
		Produto p2 = new ProdutoIsento();
		p2.setId(2);
		p2.setNome("Clean Architecture");
		p2.setPrecoUnitario(102.90);
		p2.setQuantidadeEstoque(2);	
		p2.setCategoria("Livros");
		
		Produto p3 = new ProdutoTributado();
		p3.setId(3);
		p3.setNome("Monitor Dell 27");
		p3.setPrecoUnitario(1889);
		p3.setQuantidadeEstoque(3);	
		p3.setCategoria("Informatica");
		
		System.out.println("Informacoes dos produtos: ");
		System.out.println();
		System.out.println("Id: " + p1.getId() + ", " + "Nome: " + p1.getNome() + ", " + "Preco: " + p1.getPrecoUnitario() + ", Estoque: " + p1.getQuantidadeEstoque() + ", Categoria:" + p1.getCategoria());
		System.out.println("Valor total em estoque: " + p1.calculaEstoque() + ", Impostos aproximados: " + p1.calculaImposto());
		System.out.println();
		System.out.println("Id: " + p2.getId() + ", " + "Nome: " + p2.getNome() + ", " + "Preco: " + p2.getPrecoUnitario() + ", Estoque: " + p2.getQuantidadeEstoque() + ", Categoria:" + p2.getCategoria());
		System.out.println("Valor total em estoque: " + p2.calculaEstoque() + ", Impostos aproximados: " + p2.calculaImposto());
		System.out.println();
		System.out.println("Id: " + p3.getId() + ", " + "Nome: " + p3.getNome() + ", " + "Preco: " + p3.getPrecoUnitario() + ", Estoque: " + p3.getQuantidadeEstoque() + ", Categoria:" + p3.getCategoria());
		System.out.println("Valor total em estoque: " + p3.calculaEstoque() + ", Impostos aproximados: " + p3.calculaImposto());
		System.out.println();
		
	
	}
}
