package cse360assign2;

public class Calculator {

	private int total;
	
	/**
	 * Constructor of calculator
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal - gets total
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add - adds value to total
	 * @param value
	 */
	public void add (int value) {
		total += value;
	}
	
	/**
	 * subtract - subtracts value from total
	 * @param value
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/**
	 * multiply - multiplies total by value
	 * @param value
	 */
	public void multiply (int value) {
		total *= value;
	}
	
	/**
	 * divide - divides total by value
	 * @param value
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		}
		else {
			total /= value;
		}
	}
	
	/**
	 * getHistory - gets history of total
	 * @return
	 */
	public String getHistory () {
		return "";
	}
	
}
