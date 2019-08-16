package actors;

import courses.Curso;
import courses.Turma;

public class Aluno extends Pessoa{
	
	private String matricula;
	private String situacao;
	
	private Curso curso = new Curso();
	private Turma[] turmas = new Turma[50];
	
	public Aluno(){}
	public Aluno(String nome, String endereco, String telefone, String matricula, String situacao) {
		super(nome, endereco, telefone);
		this.matricula = matricula;
		this.situacao = situacao;
	}
	
	public void matricularCurso() {
		
	}
	
	public void trancar() {
		
	}
	
	public void formar() {
		
	}
	
	public void evadir() {
		
	}
	
	public void obterAvaliacoes() {
		
	}
	
	public void emitirHistorico() {
		
	}
	
}
