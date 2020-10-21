package module2_test2_2_2;

/**
 * Created by student1 on 21.10.20.
 */
public class Vector2D {
    public double vX, vY;
    public Vector2D(){
        vX = 1f;
        vY = 1f;
    }
    public Vector2D(double x, double y){
        vX = x;
        vY = y;
    }

    public Vector2D(Vector2D v){
        this.vX = v.vX;
        this.vY = v.vY;
    }

    public void print(){
        System.out.printf("(%.2f, %.2f)%n", vX, vY);
    }
    public void length(){

    }

    public void add(Vector2D v){

    }
    public void sub(Vector2D v){

    }
    public void scale(double scaleFactor){
        
    }
}
