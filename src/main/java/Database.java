import java.util.ArrayList;
import java.util.List;

public class Database {



    private String name;

    private SuperHelt[] superhelt= new SuperHelt[10];

    public void addToList(SuperHelt helt, int index){
        superhelt[index] = helt;
    }

    public SuperHelt[] getSuperhelte(){
        return superhelt;
    }

    //public SuperHelt findSuperHelt(){
    // ny superhelt der oprettes som gemmes i en ny superhelt variable


    // konstrukter
    public Database(){
        this.name= "Superheroes";
        SuperHelt hero1 = new SuperHelt("SuperMan","Clark Kent",false,"flying, super strength, heat vision",1933,95);
        SuperHelt hero2 = new SuperHelt("Wonder Woman","Diana Prince",true,"superhuman speed",1942,98);
        SuperHelt hero3 = new SuperHelt("The Flash","Barry Allen",true,"flight, super strength, heat vision",1940,70);
        SuperHelt hero4 = new SuperHelt("Batman","Bruce Wayne",true,"instinct",1939,89);
        SuperHelt hero5 = new SuperHelt("SpiderMan","Peter Parker",true,"reflexes,spider-sense, wallcrawling,speed",1962,69);


        // Arraylist
        ArrayList<SuperHelt> Database = new ArrayList<SuperHelt>(List.of(hero1,hero2,hero3,hero4,hero5));

        // et index oprettes til hvis  derblver tilføjet et ny superhelt til databasen for den så ikke automatisk tallet 0.

        addToList(hero1,  0);
        addToList(hero2,  1);
        addToList(hero3,  2);
        addToList(hero4,  3);
        addToList(hero5,  4);

        //this.superhelt = new SuperHelt[]{hero1,hero2,hero3,hero4,hero5};
    }

}

