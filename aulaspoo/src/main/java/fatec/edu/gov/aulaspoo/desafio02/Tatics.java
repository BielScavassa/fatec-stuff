package fatec.edu.gov.aulaspoo.desafio02;

public class Tatics implements GameStyle {
    private Long id;
    private String nome;
    private Integer idadeMinima;
    private Integer idadeMaxima;

    public Tatics(Long id, String nome, Integer idadeMinima, Integer idadeMaxima) {
        this.id = id;
        this.nome = nome;
        this.idadeMinima = idadeMinima;
        this.idadeMaxima = idadeMaxima;
    }

    public Integer idadeMediaParaJogar() {
        return (this.idadeMinima + this.idadeMaxima) / 2;
    }

    public void print() {
        System.out.println("id: " + this.id + "\n nome: " + this.nome + "\n idadeMinima: " + this.idadeMinima + "\n idadeMaxima: " + this.idadeMaxima);
    }

    public Long findId() {
        return getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(Integer idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public Integer getIdadeMaxima() {
        return idadeMaxima;
    }

    public void setIdadeMaxima(Integer idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }
}
