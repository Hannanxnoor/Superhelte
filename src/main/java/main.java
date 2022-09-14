import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Database db = new Database();

        Scanner sc = new Scanner(System.in);
        System.out.println("Velkommen til superhelte universet");

        System.out.println("Indtast  et tal for den information du øsnker");

        System.out.println("1. Opret en superhelt");
        System.out.println("2.Se en liste med alle superhelte");
        System.out.println("3. Søg om informationer til et specifikt superhelt");
        System.out.println("9 aflslut programmet");
        int menuvalg = sc.nextInt();
        sc.nextLine();

        // switch bliver brugt til at udvælge en specifikt kode ud af flere
        switch (menuvalg) {
            case 1:
                System.out.println("Welcome to the Superhero World!");
                System.out.println("Indtast navnet på den ønskede superhelt");

                String superheroname = sc.nextLine();
                System.out.println("Indtast superhelten rigtige navn");
                String name = sc.nextLine();
                System.out.println("Er din superhelt et menneske,write true or false?");
                boolean isHuman = sc.nextBoolean();
                sc.nextLine();
                System.out.println("Hvad er superheltens superkrafter?");
                String superpowers = sc.nextLine();
                System.out.println("Hvad er superhelten opdagelse år?");
                int creationyear = sc.nextInt();
                sc.nextLine();
                System.out.println("Hvad er superhelten styrke?");
                double strenght = sc.nextDouble();
                sc.nextLine();
                break;

            case 2:
                SuperHelt[] muligeSuperhelte = db.getSuperhelte();
                for (SuperHelt sp : muligeSuperhelte) {
                    System.out.println(sp);
                }
                System.out.println("liste  med superhelte" + db.getSuperhelte());

                break;
            case 3:

                // spørg bruger hvilken superhelt deer ønskes

                // indtast din superhelt

                //  kig i listen og sammelign navn
                break;
            case 9:
                System.out.println("programmet er nu afslutet");
                break;

        }

        //for(SuperHelt helt: helte){
        //System.out.println(helt);
        // System.out.println(hero1.toString());
        //SuperHelt[] superhelt = new SuperHelt[5];
        //superhelt [0] = "WonderWoman";*/


    }

}
