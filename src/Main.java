import org.lessons.java.shop.Prodotto;

public class Main {
    public static void main(String[] args) {
     
        Prodotto gioco = new Prodotto("FC24", "Per PlayStation 4", 79.9f, 22);
        System.out.println("Codice: " + gioco.getCodice());
        System.out.println("Nome Gioco: " + gioco.getNome());
        System.out.println("Descrizione: " + gioco.getDescrizione());
        System.out.println("Prezzo: " + gioco.getPrezzoBase() + "$");
        System.out.println("Prezzo con IVA: " + gioco.getPrezzoIva() + "$");

        System.out.println(gioco.getNomeCodice());
        

    }
}
