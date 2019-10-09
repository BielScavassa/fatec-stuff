package fatec.edu.gov.aulaspoo.extecelagem;

public abstract class Funcionario {

	private String nome;
	private String rg;
	private Double salarioBase;

	public Funcionario() {
	}

	public Funcionario(String nome, String rg, Double salarioBase) {
		this.nome = nome;
		this.rg = rg;
		this.salarioBase = salarioBase;
	}

	public abstract Double salarioLiquido();

	public abstract void hollerith();

	public abstract void novoMes();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", rg=" + rg + ", salarioBase=" + salarioBase + "]";
	}

}
