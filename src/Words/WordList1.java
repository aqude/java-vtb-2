package Words;
import java.util.Random;

public class WordList1 extends WordMain {

    public static String arrAdd() {
        Random r = new Random();
        int random6 = r.nextInt(6);
        return actionArr[random6];
    }
}
