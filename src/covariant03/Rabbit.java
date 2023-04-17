package covariant03;

public class Rabbit extends Animal{

	@Override
    public Rabbit giveBirth() {
        return new Rabbit();
    }
	
}
