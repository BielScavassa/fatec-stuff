package fatec.edu.gov.aulaspoo.extecelagem;

public class FuncionarioVendedor extends Funcionario {
	private Double vendasNoMes;

	public FuncionarioVendedor() {
		super();
	}

	public FuncionarioVendedor(String nome, String rg, Double salarioBase) {
		super(nome, rg, salarioBase);
		this.vendasNoMes = 0.00;
	}

	@Override
	public Double salarioLiquido() {
		return super.getSalarioBase() + (this.vendasNoMes * 0.03);
	}

	@Override
	public void hollerith() {
		System.out.println("FuncionarioAdministrativo [vendasNoMes= " + vendasNoMes + " nome= " + super.getNome()
				+ ", rg= " + super.getRg() + ", salarioBase= " + super.getSalarioBase() + ", salarioLiquido= "
				+ salarioLiquido() + "]" + "\n");
	}

	@Override
	public void novoMes() {
		this.vendasNoMes = 0.00;
	}

	public void registarVenda(Double valorVenda) {
		this.vendasNoMes = this.vendasNoMes + valorVenda;
	}

	public Double getVendasNoMes() {
		return vendasNoMes;
	}

	public void setVendasNoMes(Double vendasNoMes) {
		this.vendasNoMes = vendasNoMes;
	}

}
