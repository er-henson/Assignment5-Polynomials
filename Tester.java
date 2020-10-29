/** 
 * This is my code! It's goal is to test the program
 * CS 312 - Assignment 5
 * @author Gil Carlson
 */

import java.util.*;

public class Tester
{
	public static void main( String [] args )
	{
		
                LinkedList<Terms> a = new LinkedList<Terms>();
		LinkedList<Terms> b = new LinkedList<Terms>();


                a.add( new Terms( 5, 2 ));
		b.add( new Terms( 7,2 ));
		b.add( new Terms( 7,4 ));
		a.add( new Terms( 5,6 ));
                a.add( new Terms( 3, 4 ));
		a.add( new Terms( 4,5 ));

                Collections.sort(a);

		for( Terms y: a )
		{
			System.out.print( y.termBase + "x" + y.termExponent + "  ");
		}

		for( Terms z: b )
                {
                        System.out.println("\n" + z.termBase + "x" + z.termExponent);
                }

		
		Polynomial poly = new Polynomial();
		System.out.println( "Degree is " + poly.degree(a ));
		System.out.println( "Degree is " + poly.degree(b ));

		for(int i=0; i<K1; i++)
			poly = poly + poly;
		for(int i=0; i<K2; i++)
			poly = poly * term;
		for(int i=0; i<K3; i++)
			poly = poly * poly;

	 	poly.add( a, b );
		poly.multiply( a, b );
	}
}	
