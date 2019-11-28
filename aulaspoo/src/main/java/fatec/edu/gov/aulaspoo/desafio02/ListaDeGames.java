package fatec.edu.gov.aulaspoo.desafio02;

public class ListaDeGames {
    private GameStyle lista[];
    private Integer count;

    public ListaDeGames(Integer capacidadeMaxima) {
        this.lista = new GameStyle[capacidadeMaxima];
        this.count = 0;
    }

    public void add(GameStyle game) {
        if (this.lista.length < count)
            throw new RuntimeException("Lista cheia");
        lista[count] = game;
        count++;
    }

    public void printList() {
        for (Integer i = 0; i < count; i++) {
            lista[i].print();
        }
    }

    public GameStyle find(Long id) {
        for (Integer i = 0; i <= count; i++) {
            if (lista[i].findId() == id)
                return lista[i];
        }
        throw new RuntimeException("Jogo não cadastrado.");
    }
}
