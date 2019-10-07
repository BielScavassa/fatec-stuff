package fatec.edu.gov.aulaspoo.exestacionamento;

import java.time.LocalDateTime;

public class MainEstacionamento {

	public static void main(String[] args) {

		//Constroi carros
		Carro gol = new CarroConsignado("DKA-2037", 2002, "Bola", "Gabriel", 13550.00);
		Carro uno = new CarroProprio("EWT-5963", 2012, "New Uno", 8000.00, LocalDateTime.of(2019, 10, 07, 15, 30));
		
		//Mostra resultado do metodo disponivel
		System.out.println("Disponivel: " + gol.disponivel());
		System.out.println("Disponivel: " + uno.disponivel());
		
		//Oferta valida para carros
		System.out.println("Oferta valida: " + gol.oferta(680.00));
		System.out.println("Oferta valida: " + uno.oferta(810.00));
		
		//Oferta invalida para carros
		System.out.println("Oferta invalida: " + gol.oferta(650.00));
		System.out.println("Oferta invalida: " + uno.oferta(750.00));
		
		//Imprimir dados sem vendedor
		gol.imprimeDados();
		uno.imprimeDados();
		
		//Vender carro com sucesso
		System.out.println("Vender carro: " + gol.venderCarro("Carlitos", 700.00));
		System.out.println("Vender carro: " + uno.venderCarro("Jurema", 850.00));
		
		//Vender carro fracasso -> Carros vendidos
		System.out.println("Vender carro: " + gol.venderCarro("Carlitos", 700.00));
		System.out.println("Vender carro: " + uno.venderCarro("Jurema", 850.00));
		
		//Imprimir dados com vendedor
		gol.imprimeDados();
		uno.imprimeDados();
	}

}
