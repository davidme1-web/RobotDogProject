package dog.robot.project;

public class Battery {
private int percentage ;

public Battery() {
	percentage = 100;
}
public Battery(int p) {
	percentage = p;
	
}
public void setPercent(int p) {
	if(p < 0)return;
	else {
		percentage = p;
	}
	
}
public int getPercent() {
	return percentage;
}
public void usePower() {
	percentage = percentage - 10 ;
	System.out.println("new battery percentage :" + percentage);
	
}
}
