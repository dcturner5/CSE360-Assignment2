package cse360assign2;

public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Constructor of calculator
	 */
	public Calculator () {
		total = 0;
		history = "0";
	}
	
	/**
	 * getTotal - gets total
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add - adds value to total, updates history
	 * @param value
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * subtract - subtracts value from total, updates history
	 * @param value
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * multiply - multiplies total by value, updates history
	 * @param value
	 */
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	
	/**
	 * divide - divides total by value, updates history
	 * @param value
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		}
		else {
			total /= value;
		}
		history += " / " + value;
	}
	
	/**
	 * getHistory - gets history of total
	 * @return
	 */
	public String getHistory () {
		return history;
	}
	
}
