package fatec.edu.gov.aulaspoo.extecelagem;

public class FuncionarioProducao extends Funcionario {
	private Integer horasDiurnas;
	private Integer horasNoturnas;

	public FuncionarioProducao() {
		super();
	}

	public FuncionarioProducao(String nome, String rg, Double salarioBase) {
		super(nome, rg, salarioBase);
		this.horasDiurnas = 0;
		this.horasNoturnas = 0;
	}

	@Override
	public Double salarioLiquido() {
		Double salarioPorHorasNoturnas = super.getSalarioBase() + (super.getSalarioBase() * 0.30);
		Double valorRecebidoHorasNoturnas = this.horasNoturnas * salarioPorHorasNoturnas;
		Double valorRecebidoHorasDiurnas = this.horasDiurnas * super.getSalarioBase();

		return valorRecebidoHorasDiurnas + valorRecebidoHorasNoturnas;
	}

	@Override
	public void hollerith() {
		System.out.println("Funcionario Producao: ");
		super.hollerith();
		System.out.println(" horasDiurnas= " + horasDiurnas + " horasNoturnas= " + horasNoturnas + "\n");
	}

	@Override
	public void novoMes() {
		this.horasDiurnas = 0;
		this.horasNoturnas = 0;
	}

	public void registrarHorasDiurnas(Integer horasTrabalhadas) {
		this.horasDiurnas += horasTrabalhadas;
	}

	public void registrarHorasNoturnas(Integer horasTrabalhadas) {
		this.horasNoturnas += horasTrabalhadas;
	}

	public Integer getHorasDiurnas() {
		return horasDiurnas;
	}

	public void setHorasDiurnas(Integer horasDiurnas) {
		this.horasDiurnas = horasDiurnas;
	}

	public Integer getHorasNoturnas() {
		return horasNoturnas;
	}

	public void setHorasNoturnas(Integer horasNoturnas) {
		this.horasNoturnas = horasNoturnas;
	}

}
