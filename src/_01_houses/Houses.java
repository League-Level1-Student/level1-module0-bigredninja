package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob =new Robot();
	
	public static void drawhouse(String tall, Color col) {
		
		int height = 0;
		if (tall.equals("small")) {
			height = 50;
		}
		else  if (tall.equals("medium")) {
			height = 140;
		}
		else if(tall.equals("large")){
			height = 270;
		}
		rob.setPenColor(col);
		
		rob.move(height);
		
		if (height <= 140) {
			pointedroof();
		}
		else {
			flatroof();
		}
		rob.move(height);
		rob.setPenColor(Color.green);
		rob.turn(-90);
		rob.move(40);
		rob.turn(-90);
		
		
		
	}
	
	public static void pointedroof() {
		rob.turn(45);
		rob.move(30);
		rob.turn(90);
		rob.move(30);
		rob.turn(45);
		
		
	}
	public static void flatroof() {
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		
	}
	public static void main(String[] args) {
		rob.setSpeed(50);
		rob.setX(20);
		rob.setY(500);
		rob.penDown();
		drawhouse("small", Color.blue);
		drawhouse("medium", Color.black);
		drawhouse("large", Color.red);
		drawhouse("small", Color.blue);
		drawhouse("medium", Color.black);
		drawhouse("large", Color.red);
		drawhouse("small", Color.blue);
		drawhouse("medium", Color.black);
		drawhouse("large", Color.red);
		
	}}