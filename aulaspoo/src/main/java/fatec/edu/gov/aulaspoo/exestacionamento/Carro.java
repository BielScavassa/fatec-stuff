package fatec.edu.gov.aulaspoo.exestacionamento;

public abstract class Carro {

	private String placa;
	private Integer anoDeFabricacao;
	private String modelo;
	private Boolean disponivel;
	private String nomeVendedor;

	public Carro(String placa, Integer anoDeFabricacao, String modelo) {
		this.placa = placa;
		this.anoDeFabricacao = anoDeFabricacao;
		this.modelo = modelo;
		this.disponivel = true;
	}

	public Boolean disponivel() {
		if (this.disponivel == true)
			return true;
		else
			return false;
	}

	public abstract void imprimeDados();

	public abstract Boolean oferta(Double valorOfertado);

	public Boolean venderCarro(String vendedor, Double valorVenda) {
		if (oferta(valorVenda) && disponivel()) {
			this.disponivel = false;
			this.nomeVendedor = vendedor;
			return true;
		} else
			return false;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(Integer anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", anoDeFabricacao=" + anoDeFabricacao + ", modelo=" + modelo + ", disponivel="
				+ disponivel + ", nomeVendedor=" + nomeVendedor + "]";
	}

	public Boolean oferta() {
		// TODO Auto-generated method stub
		return null;
	}

}
