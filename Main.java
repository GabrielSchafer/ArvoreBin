package br.unisinos;

public class Main {
	
	public static void main(String args[]) {
		
		Arvore arvore = new Arvore();
		
		arvore.Adicionar(10);
		arvore.Adicionar(15);
		arvore.Adicionar(5);
		arvore.Adicionar(8);
		arvore.Adicionar(20);
		arvore.Adicionar(2);
		
		
		System.out.println("Em Ordem;");
		arvore.EmOrdem(arvore.getRaiz());
		
		System.out.println("PRE ORDEM:");
		arvore.PreOrdem(arvore.getRaiz());
		
		System.out.println("PosOrdem:");
		arvore.PosOrdem(arvore.getRaiz());
		
		arvore.Remove(20);
		
		System.out.println("Em ordem depois de remover um nodo: ");
		
		arvore.EmOrdem(arvore.getRaiz());
		
		System.out.println("Buscando:");
		arvore.Buscar(2);
		arvore.GerarArquivoDot("/Users/T-Gamer/eclipse-workspace/Arvore/src/br/unisinos/arvoreBin.dot");
		
		System.getProperty("user.dir");
	}

}
