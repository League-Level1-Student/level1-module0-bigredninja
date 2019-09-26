package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob =new Robot();
	
	public static void drawhouse(int height) {
		rob.setPenColor(255, 0, 0);
		rob.move(height);
		rob.turn(90);
		rob.move(40);
		rob.turn(90);
		rob.move(height);
		rob.setPenColor(0, 255, 0);
		rob.turn(-90);
		rob.move(40);
		rob.turn(-90);
		
		
		
	}
		
	public static void main(String[] args) {
		rob.setSpeed(50);
		rob.setX(20);
		rob.setY(500);
		rob.penDown();
		drawhouse(100);
		drawhouse(200);
		drawhouse(50);
		
	}
}