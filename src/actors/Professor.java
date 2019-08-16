package actors;

import courses.Curso;
import courses.Turma;

public class Professor extends Pessoa {
	
	private String titulacaoMaxima;
	
	private Curso[] cursosLecionando = new Curso[50];
	private Turma[] turmas = new Turma[50];
	
	public Professor() {}
	public Professor(String nome, String endereco, String telefone, String titulacaoMaxima) {
		super(nome, endereco, telefone);
		this.titulacaoMaxima = titulacaoMaxima;
	}
	
	public void cadastrar() {
		
	}
	
}
