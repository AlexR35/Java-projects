package programbydoing;

public class WhatIf {
	public static void main (String [] args) {
		
		int people = 35;
		int aliens = 65;
		int mystics = 25;
		
		if (people < aliens)
		{
			System.out.println("Aliens will take over ");
		}
		
		if (people > aliens)
		{
			System.out.println("People will become Aliens ");
		}
		
		if (people == aliens)
		{
			System.out.println("Not possible");
		}
		
		mystics+= 50;
		
		if (mystics >= people)
		{
			System.out.println("It'll be easy to believe");
		}
		
		if (mystics <= people)
		{
			System.out.println("It'll be hard to believe");
		}
		if (mystics == people)
		{
			System.out.println("Its a possibirity");
		}
		
	}
	

}
