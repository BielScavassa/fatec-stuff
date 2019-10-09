package fatec.edu.gov.aulaspoo.extecelagem;

public class FuncionarioAdministrativo extends Funcionario {
	private Double numeroFaltas;

	public FuncionarioAdministrativo() {
		super();
	}

	public FuncionarioAdministrativo(String nome, String rg, Double salarioBase) {
		super(nome, rg, salarioBase);
		this.numeroFaltas = 0.00;
	}

	@Override
	public Double salarioLiquido() {
		Double valorDescontadoPorFaltas = super.getSalarioBase() / 30;
		return super.getSalarioBase() - (valorDescontadoPorFaltas * this.numeroFaltas);
	}

	@Override
	public void hollerith() {
		System.out.println("FuncionarioAdministrativo [numeroFaltas= " + numeroFaltas + " nome= " + super.getNome()
				+ ", rg= " + super.getRg() + ", salarioBase= " + super.getSalarioBase() + ", salarioLiquido= "
				+ salarioLiquido() + "]" + "\n");
	}

	@Override
	public void novoMes() {
		this.numeroFaltas = 0.00;
	}

	public void registartFalta() {
		this.numeroFaltas = this.numeroFaltas + 1;
	}

	public Double getNumeroFaltas() {
		return numeroFaltas;
	}

	public void setNumeroFaltas(Double numeroFaltas) {
		this.numeroFaltas = numeroFaltas;
	}

}
