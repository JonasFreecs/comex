package comex;

public class mainCategoria {
	public static void main(String[] args) {
		
		Categoria c1 = new Categoria();
		c1.setId(1);
		c1.setNome("INFORMATICA");
		
		Categoria c2 = new Categoria();
		c2.setId(2);
		c2.setNome("MOVEIS");
		c2.setStatus("INATIVA");
		
		Categoria c3 = new Categoria();
		c3.setId(3);
		c3.setNome("LIVROS");
		
		System.out.println("Categoria " + c1.getNome() + " (" + c1.getId() + " - " + c1.getStatus() + ")");
		System.out.println("Categoria " + c2.getNome() + " (" + c2.getId() + " - " + c2.getStatus() + ")");
		System.out.println("Categoria " + c3.getNome() + " (" + c3.getId() + " - " + c3.getStatus() + ")");
	}
}
