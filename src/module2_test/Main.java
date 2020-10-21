package module2_test;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Bird swallow = new Bird("Sie", "Black", Animal.MoveSup.Flying, "Sky", false);

//        String[] animals_types = Animal.ANIMAL_TYPES;
//        for(int i = 0; i < animals_types.length; i++){
//            System.out.println(animals_types[i]);
//        }

        StringBuffer str = new StringBuffer("Шиза");

        String m_str = str.toString();
        int i = Integer.parseInt(m_str);
        String d3 = Integer.toString(i);
        System.out.println(m_str);
        Bird a = new Bird("Sie", "Black", Animal.MoveSup.Flying, "Sky", false){

        };
//        System.out.printf("Имя животного: %s, цвет: %s, способ перемещения: %s", swallow.getName(), swallow.getColor(), swallow.getMoveSup());
    }
}
