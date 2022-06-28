import java.util.ArrayList;

public class Zadatak {
    public static void main(String[] args) {

        //Zadatak 1 - Kreirati listu namirnica iz prodavnice, dodeliti vrednosti, odstampati sve vrednosti,
        // zatim obrisati drugi i cetvrti clan pa ponovo odstampati listu


        ArrayList namirnice = new ArrayList();

        namirnice.add("Brasno");
        namirnice.add("Mleko");
        namirnice.add("Cokolada");
        namirnice.add("Novine");
        namirnice.add("Kackavalj");

        System.out.println("Namirnice na listi:");
        for (int i = 0; i < namirnice.size(); i++) {
            System.out.println(namirnice.get(i));
        }

        namirnice.remove(3);
        namirnice.remove(1);

        System.out.println("Namirnice na novoj listi:");
        for (int i = 0; i < namirnice.size(); i++) {
            System.out.println(namirnice.get(i));
        }



    }
}
