package scope02;

public class AnimalDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
        Dog dog = new Dog();
        Lion lion = new Lion();
        Bird bird = new Bird();

        animal.makeSound();  
        dog.makeSound();     
        lion.makeSound();     
        bird.makeSound();

	}

}
