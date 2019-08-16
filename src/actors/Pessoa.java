package actors;
import java.util.Scanner;

public class Pessoa {
	
	protected String nome;
	protected String endereco;
	protected String telefone;

	Scanner input = new Scanner(System.in);
	
	public Pessoa() {}
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public void cadastrar() {
	
		System.out.println("Digite o nome:");
		this.nome = input.next();
		System.out.println("Digite o endereco");
		this.endereco = input.next();
		System.out.println("Digite o telefone");
		this.telefone = input.next();
		
	}

}
