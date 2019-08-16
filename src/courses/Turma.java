package courses;

import actors.Aluno;

public class Turma {

	private int ano;
	private int semestre;
	private int diaSemana;
	private String horarios;
	
	private Disciplina[] disciplinas = new Disciplina[50];
	private Aluno[] alunos = new Aluno[50];
	
	public Turma() {}
	public Turma(int ano, int semestre, int diaSemana, String horarios) {
		this.ano = ano;
		this.semestre = semestre;
		this.diaSemana = diaSemana;
		this.horarios = horarios;
	}
	
	public void abrirTurma() {}
	public void alocarProfessor() {}
	public void matricularAluno() {}
	public void emitirDiario() {}
}
