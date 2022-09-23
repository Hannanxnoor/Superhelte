public class SuperHelt {



    //  Attributter defineres
    private String superheroname;
    private String name;

    private boolean isHuman;
    private String superpowers;
    private int creationyear;
    private double  strength;


    // Kontruktøren defineres

    public SuperHelt(String superheroname, String name, boolean isHuman, String superpowers, int creationyear, double strength){
        this.superheroname  = superheroname;
        this.name = name;
        this.isHuman = isHuman;
        this.superpowers = superpowers;
        this.creationyear = creationyear;
        this.strength = strength;
    }


    // Getter metoder

    public String getSuperheroname(){
        return superheroname;
    }
    public String getName(){
        return name;
    }

    public boolean isHuman() {
        return isHuman;
    }


    public String getSuperpowers(){
        return superpowers;
    }
    public int getCreationyear(){
        return creationyear;
    }
    public double getStrength(){
        return strength;
    }


    // strenge er i gåseøjne
    @Override
    public String toString(){
        return "\n ______________________________________\n"+
                       "Superhero name:" + " " + superheroname +
                "\n Real name: " +" "  + name +
                "\n Are they Human?" + " " + isHuman +
                "\n Superpowers:" +  " " + superpowers +
                "\n Their creation year:"  + " " + creationyear +
                "\n Strenght: "  + " " + strength;

    }














}
