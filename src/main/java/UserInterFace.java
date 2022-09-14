import java.util.ArrayList;
import java.util.Scanner;

public class UserInterFace {


    public void startProgram() {

        Database db = new Database();

        Scanner sc = new Scanner(System.in);
        System.out.println("Velkommen til superhelte universet");

        while (true) {

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
                    System.out.println("Er din superhelt et menneske, write yes or no?");
                    String human = sc.nextLine();

                    boolean isHuman = false;
                    if (human.equals("yes")) {
                        isHuman = true;

                    } else if (human.equals("no")) {
                        isHuman = false;
                    }

                    System.out.println("Hvad er superheltens superkrafter?");
                    String superpowers = sc.nextLine();
                    System.out.println("Hvad er superhelten opdagelse år?");
                    int creationyear = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Hvad er superhelten styrke?");
                    double strenght = sc.nextDouble();
                    sc.nextLine();
                    db.addSuperHero(superheroname, name, isHuman, superpowers, creationyear, strenght);
                    break;

                case 2:
                    ArrayList<SuperHelt> muligeSuperhelte = db.getSuperhelte();
                    for (SuperHelt sp : muligeSuperhelte) {
                        System.out.println(sp);
                    }
                    System.out.println("liste  med superhelte" + db.getSuperhelte());

                    break;
                case 3:

                    System.out.println("Skriv navnet på superhelten");
                    String superHeroName = sc.nextLine();
                    SuperHelt superhelt = db.findSuperHero(superHeroName);
                    System.out.println(superhelt);
                    break;

                case 9:
                    System.out.println("programmet er nu afslutet");
                    System.exit(1);
                    break;
            }

        }

    }
}

