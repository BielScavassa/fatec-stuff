package fatec.edu.gov.aulaspoo.p1;

public class MainFaculdade {

	public static void main(String[] args) {

		Professor prof = new Professor("Prof", "12.345.345-8", 3,  15.00, "Prog");
		Funcionario func = new Funcionario("Func", "23.454.345-3", 4, 800.00, "T.I");
		
		prof.registrarAulas(10);
		System.out.println("Salario liquido: " + prof.calcularSalario());
		prof.hollerith();
		prof.zerarMes();
		prof.hollerith();
		
		func.registarFalta();
		System.out.println("Salario liquido: " + func.calcularSalario());
		func.hollerith();
		func.zerarMes();
		func.hollerith();
	}

}
