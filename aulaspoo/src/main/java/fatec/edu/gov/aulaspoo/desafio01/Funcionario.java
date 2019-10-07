package fatec.edu.gov.aulaspoo.desafio01;

public class Funcionario {

	private Long id;
	private String nome;
	private Double comissao;
	private Double salario;
	private Integer qtdVendas;

	public Funcionario() {
	}
	
	public Funcionario(Long id, String nome, Double comissao, Double salario, Integer qtdVendas) {
		this.id = id;
		this.nome = nome;
		this.comissao = comissao;
		this.salario = salario;
		this.qtdVendas = qtdVendas;
	}
	
	//Construtor copia
	public Funcionario(Funcionario funcionario) {
		this.id = funcionario.getId();
		this.nome = funcionario.getNome();
		this.comissao = funcionario.getComissao();
		this.salario = funcionario.getSalario();
		this.qtdVendas = funcionario.getQtdVendas();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(Integer qtdVendas) {
		this.qtdVendas = qtdVendas;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", comissao=" + comissao + ", salario=" + salario
				+ ", qtdVendas=" + qtdVendas + "]";
	}

}
