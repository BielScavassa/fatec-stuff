package fatec.edu.gov.aulaspoo.exestacionamento;

import java.time.LocalDateTime;

public class CarroProprio extends Carro {

	private Double valorCompra;
	private LocalDateTime dataCompra;

	public CarroProprio(String placa, Integer anoDeFabricacao, String modelo, Double valorCompra,
			LocalDateTime dataCompra) {
		super(placa, anoDeFabricacao, modelo);
		this.valorCompra = valorCompra;
		this.dataCompra = dataCompra;

	}

	@Override
	public Boolean oferta(Double valorOfertado) {
		if (valorOfertado > 0.10 * this.valorCompra)
			return true;
		else
			return false;
	}

	public Double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public LocalDateTime getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDateTime dataCompra) {
		this.dataCompra = dataCompra;
	}

	@Override
	public void imprimeDados() {
		if (super.disponivel()) {
			System.out.println("CarroProprio [placa=" + super.getPlaca() + ", anoDeFabricacao="
					+ super.getAnoDeFabricacao() + ", modelo=" + super.getModelo() + ", disponivel="
					+ super.getDisponivel() + " valorCompra=" + valorCompra + ", dataCompra=" + dataCompra + "]");
		} else {
			System.out.println("CarroProprio [placa=" + super.getPlaca() + ", anoDeFabricacao="
					+ super.getAnoDeFabricacao() + ", modelo=" + super.getModelo() + ", disponivel="
					+ super.getDisponivel() + " nomeVendedor=" + super.getNomeVendedor() + " valorCompra=" + valorCompra
					+ ", dataCompra=" + dataCompra + "]");
		}

	}

}
