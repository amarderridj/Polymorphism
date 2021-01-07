package Piit;

public class Dog extends Animal{

	public void AnimalSound() {
		System.out.println("Woof");
	}
	
	public static void main(String[] args) {
		Dog objet=new Dog();
		objet.AnimalSound();
		objet.AnimalHeight(3);
	}

	@Override
    void AnimalHeight(int i) {
		System.out.println("the average height of dogs is about "+i+" feet");
		
	}

}
