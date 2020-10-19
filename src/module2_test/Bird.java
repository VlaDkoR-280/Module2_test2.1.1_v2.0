package module2_test;


public class Bird extends Animal{
    public String area;

    public void setArea(String area) {
        this.area = area;
    }

    public Bird(String name, String color, MoveSup move_sup, String area, boolean is_home_animal){
        super(name, color, move_sup, is_home_animal);
        setArea(area);
    }

    @Override
    protected void doSay() {
        System.out.println("Create Bird class!");
    }
}
