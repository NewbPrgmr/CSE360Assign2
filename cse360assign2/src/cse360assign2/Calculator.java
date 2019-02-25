package cse360assign2;

/**
 * Calculator is a class which takes numerical data into a user-selected operations
 * and produces the result of the operation with given numerical data.
 * The operation includes addition, subtraction, multiplication, and division. 
 * @author jb6055
 * @version 1.0
 * @since 2/24/2019
 */

public class Calculator {
private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	
	/**
	 * This method returns the calculator's total value.
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method adds the integer value to the total.
	 * @param value This is the integer value to be added to the total.
	 */
	public void add (int value) {
		total += value;
	}
	
	/**
	 * This method subtracts the integer value from the total.
	 * @param value This is the integer value to be subtracted from the total.
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/**
	 * This method multiplies the total by the integer value.
	 * @param value The total will be multiplied by this value.
	 */
	public void multiply (int value) {
		total *= value;
	}
	
	/**
	 * This method divides the total by the integer value.
	 * @param value The total will be divided by this value.
	 */
	public void divide (int value) {
		if (value == 0)
		{
			total = 0;
		}
		else
		{
			total /= value;
		}
	}
	
	/**
	 * This method will return the history of all operations done by this calculator.
	 * @return This string variable will return all of the operations done by this
	 * calculator in String format.
	 */
	public String getHistory () {
		return "";
	}
}
