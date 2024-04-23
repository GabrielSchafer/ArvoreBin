package br.unisinos;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Arvore{

	private Nodo raiz;

	public Arvore() {
		this.raiz = null;
	}

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	public void Adicionar(int valor) {

		Nodo novoNodo = new Nodo(valor);
		if(raiz == null) {
			this.raiz = novoNodo;
		}else {
			Nodo atual = this.raiz;
			while(true) {

				if(novoNodo.getInfo() < atual.getInfo()) {
					if(atual.getEsq() != null) {
						atual = atual.getEsq();
					}else {
						atual.setEsq(novoNodo);
						break;
					}
				}else {
					if(atual.getDir() != null) {
						atual = atual.getDir();
					}else {
						atual.setDir(novoNodo);
						break;
					}


				}


			}
		}

	}

	public void EmOrdem(Nodo atual) {


		if(atual != null) {
			EmOrdem(atual.getEsq());
			System.out.println(atual.getInfo());
			EmOrdem(atual.getDir());

		}


	}

	public void PreOrdem(Nodo atual) {

		if(atual != null){
			System.out.println(atual.getInfo());
			PreOrdem(atual.getEsq());
			PreOrdem(atual.getDir());

		}

	}

	public void PosOrdem(Nodo atual) {

		if(atual != null){
			PosOrdem(atual.getDir());
			PosOrdem(atual.getEsq());
			System.out.println(atual.getInfo());

		}


	}

	public boolean Remove(int valor) {


		//buscar o elemento na árvore
		Nodo atual = this.raiz;
		Nodo paiAtual = null;
		while(atual != null){
			if (atual.getInfo() == valor){
				break;                
			}else if (valor < atual.getInfo()){ //valor procurado é menor que o atual 
				paiAtual = atual;
				atual = atual.getEsq();
			}else{
				paiAtual = atual;
				atual = atual.getDir();
			}
		}
		//verifica se existe o elemento
		if (atual != null){

			//elemento tem 2 filhos ou elemento tem somente filho à direita
			if (atual.getDir() != null){

				Nodo substituto = atual.getDir();
				Nodo paiSubstituto = atual;
				while(substituto.getEsq() != null){
					paiSubstituto = substituto;
					substituto = substituto.getEsq();
				}
				substituto.setEsq(atual.getEsq());
				if (paiAtual != null){
					if (atual.getInfo() < paiAtual.getInfo()){ //atual < paiAtual
						paiAtual.setEsq(substituto);
					}else{
						paiAtual.setDir(substituto);
					}
				}else{ //se não tem paiAtual, então é a raiz
					this.raiz = substituto;
					paiSubstituto.setEsq(null);
					this.raiz.setDir(paiSubstituto);
					this.raiz.setEsq(atual.getEsq());
				}

				//removeu o elemento da árvore
				if (substituto.getInfo() <  paiSubstituto.getInfo()){ //substituto < paiSubstituto
					paiSubstituto.setEsq(null);
				}else{
					paiSubstituto.setDir(null);
				}

			}else if (atual.getEsq() != null){ //tem filho só à esquerda
				Nodo substituto = atual.getEsq();
				Nodo paiSubstituto = atual;
				while(substituto.getDir() != null){
					paiSubstituto = substituto;
					substituto = substituto.getDir();
				}
				if (paiAtual != null){
					if (atual.getInfo() < paiAtual.getInfo()){ //atual < paiAtual
						paiAtual.setEsq(substituto);
					}else{
						paiAtual.setDir(substituto);
					}
				}else{ //se for a raiz
					this.raiz = substituto;
				}

				//removeu o elemento da árvore
				if (substituto.getInfo() < paiSubstituto.getInfo()){ //substituto < paiSubstituto
					paiSubstituto.setEsq(null);
				}else{
					paiSubstituto.setDir(null);
				}
			}else{ //não tem filho
				if (paiAtual != null){
					if (atual.getInfo() < paiAtual.getInfo()){ //atual < paiAtual
						paiAtual.setEsq(null);
					}else{
						paiAtual.setDir(null);
					}
				}else{ //é a raiz
					this.raiz = null;
				}
			}

			return true;
		}else{
			return false;
		}        

	}

	public void Buscar(int valor) {

		Nodo atual = this.raiz;

		while(true) {

			if(atual != null) {

				if(atual.getInfo() == valor) {
					System.out.println("valor encontrado: " +  atual.getInfo());
					break;
				}else if(valor < atual.getInfo()){
					atual = atual.getEsq();

				}else {
					atual = atual.getDir();
				}

			}else {
				System.out.println("valor não encontrado");
				break;
			}

		}

	}

	public void GerarArquivoDot(String nomeArquivo) {
		try (PrintWriter writer = new PrintWriter(new File(nomeArquivo))) {
			writer.println("digraph Arvore {");
			// Chamada ao método recursivo para gerar os nós e arestas
			GerarArquivoDotPreOrdem(writer, raiz);
			writer.println("}");
			System.out.println("Arquivo DOT gerado com sucesso: " + nomeArquivo);
		} catch (IOException e) {
			System.out.println("Erro ao gerar o arquivo DOT: " + e.getMessage());
		}
	}

	private void GerarArquivoDotPreOrdem(PrintWriter writer, Nodo no) {
		if (no != null) {
			writer.println("  " + no.getInfo() + ";");
			if (no.getEsq() != null) {
				writer.println("  " + no.getInfo() + " -> " + no.getEsq().getInfo() + ";");
				GerarArquivoDotPreOrdem(writer, no.getEsq());
			}
			if (no.getDir() != null) {
				writer.println("  " + no.getInfo() + " -> " + no.getDir().getInfo() + ";");
				GerarArquivoDotPreOrdem(writer, no.getDir());
			}
		}
	}

}











