package fatec.edu.gov.aulaspoo.p1;

public class Funcionario extends Pessoa {
	private String departamentoQueTrabalha;
	private Double faltas;
	private Double valeCoxinha;

	public Funcionario(String nome, String rg, Integer quantidadeDeFilhos, Double salarioBase,
			String departamentoQueTrabalha) {
		super(nome, rg, quantidadeDeFilhos, salarioBase);
		this.faltas = 0.00;
		this.departamentoQueTrabalha = departamentoQueTrabalha;
		this.valeCoxinha = 42.00;
	}

	@Override
	public Double calcularSalario() {
		Double perdaPorFaltas = super.getSalarioBase() * this.faltas / 20;
		return (super.getSalarioBase() - perdaPorFaltas) + this.valeCoxinha + super.getAuxilioProcriacao();
	}

	@Override
	public void zerarMes() {
		this.departamentoQueTrabalha = "";
		this.faltas = 0.00;
	}

	@Override
	public void hollerith() {
		super.hollerith();
		System.out.println("Departamento que trabalha: " + this.departamentoQueTrabalha + "Vale coxinha: " + this.valeCoxinha + "Quantidade de faltas: ");
	}

	public void registarFalta() {
		this.faltas++;
	}

	public String getDepartamentoQueTrabalha() {
		return departamentoQueTrabalha;
	}

	public void setDepartamentoQueTrabalha(String departamentoQueTrabalha) {
		this.departamentoQueTrabalha = departamentoQueTrabalha;
	}

	public Double getValeCoxinha() {
		return valeCoxinha;
	}

}
