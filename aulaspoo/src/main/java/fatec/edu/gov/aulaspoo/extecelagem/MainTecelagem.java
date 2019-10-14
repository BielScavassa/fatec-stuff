package fatec.edu.gov.aulaspoo.extecelagem;

public class MainTecelagem {

	public static void main(String[] args) {
		
		//Cria funcionarios
		FuncionarioAdministrativo funcionarioAdm = new FuncionarioAdministrativo("Julio", "75.123.785-8", 1500.00);
		FuncionarioProducao funcionarioProd = new FuncionarioProducao("Sergio", "25.143.755-6", 30.00);
		FuncionarioVendedor funcionarioVend = new FuncionarioVendedor("Amanada", "44.122.711-9", 850.00);
		
		//Funcionario Administrativo
		funcionarioAdm.registartFalta();
		funcionarioAdm.registartFalta();
		funcionarioAdm.registartFalta();
		funcionarioAdm.registartFalta();
		
		funcionarioAdm.hollerith();
		
		//Funcionario Producao
		funcionarioProd.registrarHorasDiurnas(30);
		funcionarioProd.registrarHorasNoturnas(14);
		
		funcionarioProd.hollerith();
		
		//Funcionario Vendedor
		funcionarioVend.registarVenda(500.00);
		funcionarioVend.registarVenda(700.00);
		funcionarioVend.registarVenda(1100.00);
		
		funcionarioVend.hollerith();
		
		//Novo mes
		funcionarioAdm.novoMes();
		funcionarioAdm.hollerith();
		
		funcionarioProd.novoMes();
		funcionarioProd.hollerith();
		
		funcionarioVend.novoMes();
		funcionarioVend.hollerith();
		
	}

}
