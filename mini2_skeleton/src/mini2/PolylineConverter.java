package mini2;

import java.awt.Point;

import java.util.Scanner;

import api.Converter;
import plotter.Polyline;

/**
 * Converts a string into a <code>Polyline</code> object.  The given 
 * string must conform to the format specified for one valid line of the file 
 * as described in Lab 8, checkpoint 2.  See
 * <pre>
 * http://web.cs.iastate.edu/~cs227/labs/lab8/page12.html
 * </pre>
 */
public class PolylineConverter implements Converter<Polyline>
{
	
	public Polyline convert(String s) {
		Scanner temp = new Scanner(s);
        int width;
        if(temp.hasNextInt()) {width = temp.nextInt();}//if the scanner has another number then with is that number
        else width = 1;//otherwise the width is one
        String color = temp.next();
        Polyline p1 = new Polyline(color, width);//makes a new polyline given width and color
        while(temp.hasNextInt())
        {
        	//goes through and every 2 numbers is a new plot
            int x = temp.nextInt();
            int y = temp.nextInt();
            p1.addPoint(new Point(x, y));
        }
        temp.close();
        return p1; //returns the new object
	}
}

