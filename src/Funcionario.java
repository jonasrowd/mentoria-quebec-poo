public abstract class Funcionario {
	//atributos
	private String nome;
	private String cpf;
	protected final Double SALARIO_MINIMO = 1000.0;

	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Funcionario() {
	}

	public abstract double calcularSalario();


	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSALARIO_MINIMO() {
		return this.SALARIO_MINIMO;
	}

}
