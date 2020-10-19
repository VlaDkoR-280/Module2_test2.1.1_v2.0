package module2_test;


public class Main {
    public static void main(String[] args) {
        Bird swallow = new Bird("Sie", "Black", Animal.MoveSup.Flying, "Sky", false);

//        String[] animals_types = Animal.ANIMAL_TYPES;
//        for(int i = 0; i < animals_types.length; i++){
//            System.out.println(animals_types[i]);
//        }

        System.out.printf("Имя животного: %s, цвет: %s, способ перемещения: %s", swallow.getName(), swallow.getColor(), swallow.getMoveSup());
    }
}
