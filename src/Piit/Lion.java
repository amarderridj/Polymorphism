package Piit;

public class Lion  extends Animal{

	public void AnimalSound() {
		System.out.println("Roar");
	}
	public static void main(String[] args) {
		Lion objet = new Lion();
		objet.AnimalSound();

	}
	@Override
	void AnimalHeight(int x) {
		// TODO Auto-generated method stub
		
	}

}
