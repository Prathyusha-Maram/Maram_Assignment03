package covariant03;

public class AnimalDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal();
        Rabbit rabbit = new Rabbit();

        Animal animalBaby = animal.giveBirth();
        Rabbit baby = rabbit.giveBirth();

        System.out.println("Animal baby is a " + animalBaby.getClass().getSimpleName()); 
        System.out.println("Rabbit baby is a " + baby.getClass().getSimpleName());       
    
		
	}

}
