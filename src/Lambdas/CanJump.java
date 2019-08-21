package Lambdas;

public class CanJump implements CheckAnimal {
    @Override
    public boolean check(Animal animal) {
        return animal.canJump();
    }
}
