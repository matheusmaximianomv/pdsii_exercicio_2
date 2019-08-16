package courses;

import actors.Aluno;

public class Avaliacao {
	
	private float nota1;
	private float nota2;
	private float notaProvaFinal;
	private int frequencia;
	
	private Aluno aluno = new Aluno();
	private Turma turma = new Turma();
	
	public Avaliacao() {}
	public Avaliacao(float nota1, float nota2, float notaProvaFinal, int frequencia) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.frequencia = frequencia;
	}
	
	public void lancarAvaliacao() {}
	public void calcularAprovacao() {}
	
}
