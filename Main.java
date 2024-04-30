package br.unisinos;

public class Main {
	
	public static void main(String args[]) {
		
		Arvore arvore = new Arvore();
		
		arvore.Adicionar(11);
		arvore.Adicionar(16);
		arvore.Adicionar(6);
		arvore.Adicionar(9);
		arvore.Adicionar(21);
		arvore.Adicionar(3);
		arvore.Adicionar(13);
		arvore.Adicionar(17);
		arvore.Adicionar(8);
		arvore.Adicionar(24);
		
		
		Arvore arvore2 = new Arvore();
		
		
		Arvore arvore3 = new Arvore();
		
		Arvore arvore4 = new Arvore();
		
		Arvore arvore5 = new Arvore();
		
		arvore2.Adicionar(10);
		arvore2.Adicionar(15);
		arvore2.Adicionar(5);
		arvore2.Adicionar(8);
		arvore2.Adicionar(20);

		arvore3.Adicionar(3);
		arvore3.Adicionar(12);
		arvore3.Adicionar(7);
		arvore3.Adicionar(18);
		arvore3.Adicionar(25);

		arvore4.Adicionar(6);
		arvore4.Adicionar(14);
		arvore4.Adicionar(9);
		arvore4.Adicionar(16);
		arvore4.Adicionar(22);

		arvore5.Adicionar(1);
		arvore5.Adicionar(11);
		arvore5.Adicionar(4);
		arvore5.Adicionar(17);
		arvore5.Adicionar(21);

		
		
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
		
		// Imprimindo os elementos em cada árvore
		System.out.println("Árvore 2:");
		System.out.println("Em Ordem:");
		arvore2.EmOrdem(arvore2.getRaiz());
		System.out.println("PRE ORDEM:");
		arvore2.PreOrdem(arvore2.getRaiz());
		System.out.println("PosOrdem:");
		arvore2.PosOrdem(arvore2.getRaiz());
		System.out.println("Em ordem depois de remover um nodo:");
		arvore2.Remove(20);
		arvore2.EmOrdem(arvore2.getRaiz());
		System.out.println("Buscando:");
		arvore2.Buscar(2);
		arvore2.GerarArquivoDot("/Users/T-Gamer/eclipse-workspace/Arvore/src/br/unisinos/arvoreBin2.dot");

		System.out.println("Árvore 3:");
		System.out.println("Em Ordem:");
		arvore3.EmOrdem(arvore3.getRaiz());
		System.out.println("PRE ORDEM:");
		arvore3.PreOrdem(arvore3.getRaiz());
		System.out.println("PosOrdem:");
		arvore3.PosOrdem(arvore3.getRaiz());
		System.out.println("Em ordem depois de remover um nodo:");
		arvore3.Remove(20);
		arvore3.EmOrdem(arvore3.getRaiz());
		System.out.println("Buscando:");
		arvore3.Buscar(2);
		arvore3.GerarArquivoDot("/Users/T-Gamer/eclipse-workspace/Arvore/src/br/unisinos/arvoreBin3.dot");

		System.out.println("Árvore 4:");
		System.out.println("Em Ordem:");
		arvore4.EmOrdem(arvore4.getRaiz());
		System.out.println("PRE ORDEM:");
		arvore4.PreOrdem(arvore4.getRaiz());
		System.out.println("PosOrdem:");
		arvore4.PosOrdem(arvore4.getRaiz());
		System.out.println("Em ordem depois de remover um nodo:");
		arvore4.Remove(20);
		arvore4.EmOrdem(arvore4.getRaiz());
		System.out.println("Buscando:");
		arvore4.Buscar(2);
		arvore4.GerarArquivoDot("/Users/T-Gamer/eclipse-workspace/Arvore/src/br/unisinos/arvoreBin4.dot");

		System.out.println("Árvore 5:");
		System.out.println("Em Ordem:");
		arvore5.EmOrdem(arvore5.getRaiz());
		System.out.println("PRE ORDEM:");
		arvore5.PreOrdem(arvore5.getRaiz());
		System.out.println("PosOrdem:");
		arvore5.PosOrdem(arvore5.getRaiz());
		System.out.println("Em ordem depois de remover um nodo:");
		arvore5.Remove(20);
		arvore5.EmOrdem(arvore5.getRaiz());
		System.out.println("Buscando:");
		arvore5.Buscar(2);
		arvore5.GerarArquivoDot("/Users/T-Gamer/eclipse-workspace/Arvore/src/br/unisinos/arvoreBin5.dot");
		
		System.getProperty("user.dir");
	}

}
