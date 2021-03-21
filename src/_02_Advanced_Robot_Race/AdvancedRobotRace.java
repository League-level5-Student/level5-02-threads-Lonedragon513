package _02_Advanced_Robot_Race;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
public static void main(String[] args) {
	Robot r1 = new Robot(200, 300);
	Robot r2 = new Robot(350, 450);
	Robot r3 = new Robot(650, 450);
	Robot r4 = new Robot(500, 300);
	Robot r5 = new Robot(800, 300);
	r1.penDown();
	r2.penDown();
	r3.penDown();
	r4.penDown();
	r5.penDown();
	r1.setSpeed(1000);
	r2.setSpeed(1000);
	r3.setSpeed(1000);
	r4.setSpeed(1000);
	r5.setSpeed(1000);
	r1.setPenColor(Color.BLUE);
	r2.setPenColor(Color.YELLOW);
	r3.setPenColor(Color.GREEN);
	r4.setPenColor(Color.BLACK);
	r5.setPenColor(Color.RED);
	
	Thread t1 = new Thread(() -> {
		for(int i = 0; i < 360; i++) {
			r1.move(2);
			r2.move(2);
			r3.move(2);
			r4.move(2);
			r5.move(2);
			r1.turn(1);
			r2.turn(1);
			r3.turn(1);
			r4.turn(1);
			r5.turn(1);
		}
	
	});
	t1.start();
	
	
	}
}
