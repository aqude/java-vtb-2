package Words;
import java.util.Random;
public class WordList2 extends WordMain{

    public static String arrAdd() {
        Random r = new Random();
        int random10 = r.nextInt(10);
        return nameArr[random10];
    }
}
