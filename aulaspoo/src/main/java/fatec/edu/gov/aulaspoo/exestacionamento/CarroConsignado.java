package fatec.edu.gov.aulaspoo.exestacionamento;

public class CarroConsignado extends Carro {

	private String nomeProprietario;
	private Double valorVenda;

	public CarroConsignado(String placa, Integer anoDeFabricacao, String modelo, String nomeProprietario,
			Double valorVenda) {
		super(placa, anoDeFabricacao, modelo);
		this.nomeProprietario = nomeProprietario;
		this.valorVenda = valorVenda;
	}

	@Override
	public Boolean oferta(Double valorOfertado) {
		if (valorOfertado > 0.05 * this.valorVenda)
			return true;
		else
			return false;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	@Override
	public void imprimeDados() {
		if (super.disponivel()) {
			System.out.println(
					"CarroProprio [placa=" + super.getPlaca() + ", anoDeFabricacao=" + super.getAnoDeFabricacao()
							+ ", modelo=" + super.getModelo() + ", disponivel=" + super.getDisponivel() + " valorVenda="
							+ valorVenda + ", nomeProprietario=" + nomeProprietario + "]");
		} else {
			System.out.println("CarroProprio [placa=" + super.getPlaca() + ", anoDeFabricacao="
					+ super.getAnoDeFabricacao() + ", modelo=" + super.getModelo() + ", disponivel="
					+ super.getDisponivel() + " nomeVendedor=" + super.getNomeVendedor() + " nomeProprietario="
					+ nomeProprietario + ", valorVenda=" + valorVenda + "]");
		}

	}

}
