import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Definizione della lista che contiene i 90 numeri da cui estrarre
        List<Integer> numeri = new ArrayList<>();
        for (int i = 1; i <= 90; i++) {
            numeri.add(i);
        }

        // Mescolare i numeri
        Collections.shuffle(numeri);

        // Estrazione di venti numeri dalla lista mescolata
        List<Integer> estratti = new ArrayList<Integer>(numeri.subList(0, 20));
        System.out.println("Numeri estratti nel 10eLotto:");
        for (int numero : estratti) {
            System.out.println(numero);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}