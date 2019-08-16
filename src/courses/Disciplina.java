package courses;

public class Disciplina {

	private int codigo;
	private String descricao;
	private int cargaHoraria;
	private String ementa;
	private String bibliografia;
	
	private Curso curso = new Curso();
	private Turma[] turmas = new Turma[50];
	
	public Disciplina() {}
	public Disciplina(int codigo, String descricao, int cargaHoraria, String ementa, String bibliografia) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.ementa = ementa;
		this.bibliografia = bibliografia;
	}
	
	public void cadastrar() {
		
	}
	
}
