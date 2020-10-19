package module2_lesson1;


public class Car {
    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private String color;
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }


    public Car(String name, String type, String color){
        setName(name);
        setColor(color);
        setType(type);
    }
    public void doBeep(){
        System.out.println("BEEEEEEP!!!!!");
    }
}


