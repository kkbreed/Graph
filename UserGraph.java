/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usergraph;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class UserGraph {

    /**
     * @param args the command line arguments
     */
    
    /*
    This problem prints a simple graph based on user-provided data.

Code the following methods:

A method that takes no parameters and returns a String.
Request a String from the user to be used for the title of the graph.
A method that takes no parameters and returns an ArrayList of Integers.
Ask the user to enter a list of integers. They can enter as many integers as 
they like (use a sentinel to stop). The method returns these in the ArrayList.
A method that takes a String (the graph title) and an ArrayList of Integers as parameters.
This method prints the title and a graph to the command line using the ArrayList of Integers as data.
Each value in the ArrayList is the number of stars to print on that line.
Each element in the ArrayList is a separate line in the graph.
See the example below.
    */
    public static void main(String[] args) {
        String graphTitle = getTitleString();
		ArrayList<Integer> numberList = getIntegerArrayList();
		printGraph(graphTitle, numberList);
	}
	
	private static void printGraph(String graphTitle, ArrayList<Integer> numberList) {
		System.out.println(graphTitle);
		for(int num: numberList)
		{
			for(int i=0;i<num;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}


	public static String getTitleString()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter graph title : ");
		String title = sc.nextLine();
		return title;
	}


	public static ArrayList<Integer> getIntegerArrayList()
	{
		ArrayList<Integer> numberList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter number (-1 to stop) : ");
			int num = Integer.parseInt(sc.nextLine());
			if(num <0)
			{
				break;
			}
			else
			{
				numberList.add(num);
			}
		}
		return numberList;
	}
    
}
