package fatec.edu.gov.aulaspoo.desafio02;

public class MainDesafio02 {
    public static void main(String[] args) {
        GameStyle cs = new Fps(12L, "Counter Strinke", 16, 55);
        GameStyle ffTatics = new Tatics(01L, "Final Fantasy Tatics", 10, 55);

        ListaDeGames listaDeGames = new ListaDeGames(2);

        listaDeGames.add(cs);
        listaDeGames.add(ffTatics);
        listaDeGames.printList();
        GameStyle jogoEncontrado = listaDeGames.find(01L);
        jogoEncontrado.print();
//        listaDeGames.add(cs);  Lista cheia Exception
//        listaDeGames.find(33L);  Jogo não cadastrado Exception

    }
}
