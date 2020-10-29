/**
 * This is my code! It's goal is to create and store terms
 * CS 312- Assignment 5
 * @author Gil Carlson
 */

class Terms implements Comparable<Terms>
{
	int termExponent;
	int termBase;


	Terms( int termBase, int termExponent )
	{
		this.termBase = termBase;
		this.termExponent = termExponent;
	}

public int compareTo( Terms exp )
{
	if( termExponent == exp.termExponent)
		return 0;
 	else if( termExponent > exp.termExponent)
		return -1;
	else
		return 1;
}
}
