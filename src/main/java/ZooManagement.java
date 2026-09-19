import java.util.*;

public class ZooManagement {
    public static void main(String[] args) {
        int nbrCarges = 20;
        String zooName = "myZoo";

        System.out.println("Le nombre de carges ets de : " + nbrCarges + "Le nom du zom est : "+zooName);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le nom du zoo : ");
        String zoo;
        zoo = scanner.nextLine();
        while(zoo.trim().isEmpty()) {
            System.out.println("Veuillez saisir un nom de zoo...");
            System.out.println("Entrer le nom du zoo : ");
            zoo = scanner.nextLine();
        }
        int cage = 0;
        while (cage <= 0) {
            System.out.println("Entrer le nombre de cage : ");
            cage = scanner.nextInt();
        }

        System.out.println("Le zoo " + zoo + " comporte "+ cage + " cages");

    }
}
