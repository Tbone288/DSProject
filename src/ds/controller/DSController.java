package ds.controller;

import ds.model.*;
import java.util.*;

public class DSController 
{
	private Stack<String> myStack;
	private Queue<Customer> customerQueue;
	
	public DSController()
	{
		myStack = new Stack<String>();
		customerQueue = new LinkedList<Customer>();
	}
	
	public void start()
	{
		Customer Brandon = new Customer("Brandon");
		Customer Payasain = new Customer("Payasain");
		
		customerQueue.add(Brandon);
		customerQueue.add(Payasain);
		
		customerQueue.remove();
		customerQueue.peek();
		
		String wowAString = "Wow this is my String look how great it is";
		String anotherStringWow = "This is yet another neat String that is neat";
		
		myStack.push(anotherStringWow);
		myStack.push(wowAString);
		
		myStack.pop();
		
		
	}
}
