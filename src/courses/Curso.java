package courses;

import actors.Aluno;
import actors.Professor;

public class Curso {
	
	private int codigo;
	private String descricao;
	
	private Aluno[] alunos = new Aluno[50]; 
	private Disciplina[] disciplinas = new Disciplina[50];
	private Professor coordenador = new Professor();
	private Professor[] professores = new Professor[50];
	
	public Curso() {}
	public Curso(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public void Cadastrar() {
		
	}
}
