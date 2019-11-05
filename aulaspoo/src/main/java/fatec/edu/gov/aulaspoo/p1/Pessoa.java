package fatec.edu.gov.aulaspoo.p1;

public abstract class Pessoa {

	private String nome;
	private String rg;
	private Integer quantidadeDeFilhos;
	private Double auxilioProcriacao;
	private Double salarioBase;

	public Pessoa(String nome, String rg, Integer quantidadeDeFilhos, Double salarioBase) {
		this.nome = nome;
		this.rg = rg;
		this.quantidadeDeFilhos = quantidadeDeFilhos;
		this.auxilioProcriacao = quantidadeDeFilhos * 100.00;
		this.salarioBase = salarioBase;
	}

	public abstract Double calcularSalario();

	public abstract void zerarMes();

	public void hollerith() {
		System.out
				.println("Nome: " + this.nome + "RG: " + this.rg + "Quantidade de Filhos: " + this.quantidadeDeFilhos);
	}

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

	public Integer getQuantidadeDeFilhos() {
		return quantidadeDeFilhos;
	}

	public void setQuantidadeDeFilhos(Integer quantidadeDeFilhos) {
		this.quantidadeDeFilhos = quantidadeDeFilhos;
	}

	public Double getAuxilioProcriacao() {
		return auxilioProcriacao;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

}
