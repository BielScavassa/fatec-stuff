package fatec.edu.gov.aulaspoo.p1;

public class Professor extends Pessoa {
	private String cursoQueLeciona;
	private Double horasAula;

	public Professor(String nome, String rg, Integer quantidadeDeFilhos, Double salarioBase, String cursoQueLeciona) {
		super(nome, rg, quantidadeDeFilhos, salarioBase);
		this.horasAula = 0.00;
		this.cursoQueLeciona = cursoQueLeciona;
	}

	@Override
	public Double calcularSalario() {
		return (super.getSalarioBase() * this.horasAula) + super.getAuxilioProcriacao();
	}

	@Override
	public void zerarMes() {
		this.horasAula = 0.00;
	}

	@Override
	public void hollerith() {
		super.hollerith();
		System.out
				.println("Curso que Leciona: " + this.cursoQueLeciona + "Horas de aula trabalhadas: " + this.horasAula);
	}

	public void registrarAulas(Integer quantidadeAulas) {
		this.horasAula += quantidadeAulas;
	}

	public String getCursoQueLeciona() {
		return cursoQueLeciona;
	}

	public void setCursoQueLeciona(String cursoQueLeciona) {
		this.cursoQueLeciona = cursoQueLeciona;
	}

	public Double getHorasAula() {
		return horasAula;
	}

}
