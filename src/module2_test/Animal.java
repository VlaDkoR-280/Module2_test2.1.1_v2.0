package module2_test;


public class Animal {
    static final public String[] ANIMAL_TYPES = {"Bird", "Fish", "Mammals"};
    public enum MoveSup{
        Running,
        Flying,
        Swimming,
        Crawling
    }
    private String name;
    private String color;
    private MoveSup moveSup;
    private boolean isHomeAnimal;

    protected String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    protected String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    protected MoveSup getMoveSup() {
        return moveSup;
    }

    private void setMoveSup(MoveSup moveSup) {
        this.moveSup = moveSup;
    }

    protected boolean isHomeAnimal() {
        return isHomeAnimal;
    }

    private void setHomeAnimal(boolean homeAnimal) {
        isHomeAnimal = homeAnimal;
    }





    public Animal(String name, String color, MoveSup movement_support, boolean is_home_animal){
        setName(name);
        setColor(color);
        setMoveSup(movement_support);
        setHomeAnimal(is_home_animal);
        doSay();
    }


    protected void doSay(){
        System.out.println("Create Animal class!");
    }

}



