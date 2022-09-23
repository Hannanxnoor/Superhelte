import java.util.ArrayList;
import java.util.List;

public class Database {


    private String name;

    private ArrayList<SuperHelt> superhelte = new ArrayList<>();

    //private SuperHelt[] superhelt = new SuperHelt[10];
    public void addToList(SuperHelt helt) {
        superhelte.add(helt);
    }

    public ArrayList<SuperHelt> getSuperhelte() {
        return superhelte;
    }

    //public SuperHelt findSuperHelt(){
    // ny superhelt der oprettes som gemmes i en ny superhelt variable

    // konstrukter
    public Database() {
        SuperHelt hero1 = new SuperHelt("SuperMan", "Clark Kent", false, "flying, super strength, heat vision", 1933, 95);
        SuperHelt hero2 = new SuperHelt("Wonder Woman", "Diana Prince", true, "superhuman speed", 1942, 98);
        SuperHelt hero3 = new SuperHelt("The Flash", "Barry Allen", true, "flight, super strength, heat vision", 1940, 70);
        SuperHelt hero4 = new SuperHelt("Batman", "Bruce Wayne", true, "instinct", 1939, 89);
        SuperHelt hero5 = new SuperHelt("SpiderMan", "Peter Parker", true, "reflexes,spider-sense, wallcrawling,speed", 1962, 69);


        // Arraylist
        superhelte.add(hero1);
        superhelte.add(hero2);
        superhelte.add(hero3);
        superhelte.add(hero4);
        superhelte.add(hero5);


    }


    public void addSuperHero(String superheroname, String name, boolean isHuman, String superpowers, int creationyear, double strength) {
        superhelte.add(new SuperHelt(superheroname, name, isHuman, superpowers, creationyear, strength));
    }


    public SuperHelt findSuperHero(String name) {
        for (SuperHelt hero : superhelte) {
            if (hero.getSuperheroname().equals(name)) {
                return hero;
            }

        }
        return null;
    }


}












