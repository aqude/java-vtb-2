import Words.WordList1;
import Words.WordList2;
import Words.WordList3;

public class main {
    public static void main(String[] args) {
        String action = WordList1.arrAdd();
        String name = WordList2.arrAdd();
        String surname = WordList3.arrAdd();
        System.out.println(action + ", " + name + " " + surname + "!");
    }
}
