
/**
 * This program draws a shooting star using a Turtle pen
 * 
 * Last Modified: September 19, 2016
 * @author: Thomas "RadiantBytes" Lynaugh
 */
import java.awt.Color;
import galapagos.Turtle;

public class Star {

	public static void main(String[] args) {
		// Initializes the Turtle pen
		Turtle pen;
		pen = new Turtle();

		// Declares initial pen speed and color
		pen.speed(300);
		pen.penColor(Color.yellow);

		// Draw yellow star
		pen.penUp();
		pen.turn(18);
		pen.move(80);
		pen.penDown();
		pen.turn(162);
		pen.move(80);

		pen.turn(307);
		pen.move(80);
		pen.turn(127);
		pen.move(80);

		pen.turn(307);
		pen.move(80);
		pen.turn(127);
		pen.move(80);

		pen.turn(307);
		pen.move(80);
		pen.turn(127);
		pen.move(80);

		pen.turn(307);
		pen.move(80);
		pen.turn(127);
		pen.move(80);

		pen.turn(292);
		pen.move(75);

		// Draw magenta colored trail line behind star
		pen.penColor(Color.magenta);
		pen.move(120);

		// Draw blue colored trail line behind star
		pen.penColor(Color.blue);
		pen.jumpTo(55, 35);
		pen.move(120);

		// Draw cyan colored trail line behind star
		pen.penColor(Color.cyan);
		pen.jumpTo(35, 35);
		pen.move(120);

		// Draw green colored trail line behind star
		pen.penColor(Color.GREEN);
		pen.jumpTo(15, 35);
		pen.move(120);

		// Draw yellow colored trail line behind star
		pen.penColor(Color.yellow);
		pen.jumpTo(5, 45);
		pen.move(120);

		// Draw orange colored trail line behind star
		pen.penColor(Color.orange);
		pen.jumpTo(-5, 55);
		pen.move(120);

		// Draw red colored trail line behind star
		pen.penColor(Color.red);
		pen.jumpTo(-15, 65);
		pen.move(120);

		// Places turtle onto star
		pen.jumpTo(-25, -15);
		pen.penUp();
		pen.turn(180);

	}

}
