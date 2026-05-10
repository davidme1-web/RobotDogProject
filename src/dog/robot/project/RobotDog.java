package dog.robot.project;

public class RobotDog extends Animal{
	private Battery dogBattery;
	public RobotDog() {
		this.dogBattery= new Battery(); 
	}
	public void move() {
		dogBattery.usePower();
		System.out.println("Robot dog is walking");
	}
	@Override
public void makeSound() {
		System.out.println("Electronic Bark: Woof-Beep!");
}
}
