/**
 * This is my code! It's goal is to form polynomials
 * CS 312 - Assignment 5
 * @author Gil Carlson
 */

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

class Polynomial
{
	public List<?> createPolynomial( )
	{
                LinkedList<Terms> a = new LinkedList<Terms>();

		a.add( new Terms( 5, 2 ));
                a.add( new Terms( 2, 5 ));
                a.add( new Terms( 3, 4 ));

                Collections.sort(a);


		return a;
	}	

	public int degree( List<Terms> b )
	{
		int degree = 0;

		for( Terms y: b )
                {
                     if (y.termExponent > degree)
		     {
			     degree = y.termExponent;
		     }
                }

		return degree;

	}

	public LinkedList<Terms> add( LinkedList<Terms> poly1, LinkedList< Terms> poly2 )
	{
		LinkedList<Terms> addedPolynomial = new LinkedList<Terms>();
		List<Terms> tempPoly2 = poly2;

		for( Terms y: poly1 )
                {    
		     addedPolynomial.add( y );

		     for( Terms z: tempPoly2 )
		     {
                     	if ( y.termExponent == z.termExponent)
                     	{
                     		addedPolynomial.add( new Terms( y.termBase + z.termBase, y.termExponent ));
			        addedPolynomial.remove( y );	
				tempPoly2.remove( z );
                     	}

		     }
                }

		for( Terms d : tempPoly2 )
		{
			addedPolynomial.add( d );
		}
		
		Collections.sort( addedPolynomial );

		System.out.println( );

		for( Terms c: addedPolynomial )
                {	
                        System.out.print( c.termBase + "x" +  c.termExponent + " + " );
                }	

		return addedPolynomial;

	}

	public LinkedList<Terms> multiply( LinkedList<Terms> poly1, LinkedList<Terms> poly2 )
	{
		 LinkedList<Terms> multiplyPolynomial = new LinkedList<Terms>();

                for( Terms y: poly1 )
                {

                     for( Terms z: poly2 )
                     {
                                multiplyPolynomial.add( new Terms( y.termBase * z.termBase, y.termExponent + z.termExponent ));

                     }
                }

                Collections.sort( multiplyPolynomial );
		
		System.out.println( );

                for( Terms c: multiplyPolynomial )
                {
                        System.out.print( c.termBase + "x" +  c.termExponent + " + " );
                }

		return multiplyPolynomial;

	}

}
