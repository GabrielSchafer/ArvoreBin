package br.unisinos;

public class Nodo {
	
	private int Info;
	Nodo esq, dir, pai;
	
	public Nodo(int novoValor){
		
		this.Info = novoValor;
		this.esq=null;
		this.dir=null;
		this.pai=null;
		
	}

	public int getInfo() {
		return Info;
	}

	public void setInfo(int valor) {
		this.Info = valor;
	}

	public Nodo getEsq() {
		return esq;
	}

	public void setEsq(Nodo esq) {
		this.esq = esq;
	}

	public Nodo getDir() {
		return dir;
	}

	public void setDir(Nodo dir) {
		this.dir = dir;
	}

	public Nodo getPai() {
		return pai;
	}

	public void setPai(Nodo pai) {
		this.pai = pai;
	}
}
