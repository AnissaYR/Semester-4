import java.util.ArrayList;
import java.util.List;

public class Latihan {
    public static void main(String[] args) {

        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println("Hewan : " + hewan);

        System.out.println("\nHewan Yang Dihapus : \n[ Kelinci ,Kambing ,Unta ]\n");
        hewan.removeAll(List.of("Kelinci","Kambing", "Unta"));
        System.out.println("Hewan : " + hewan);
    }
}
