package hw1;
public class MathOperation {

	/**
	 * Returns the greatest common divider of given two numbers
	 * 
	 * @param firstNumber
	 *            - positive number
	 * @param secondNumber
	 *            - positive number
	 * @return greatest common divider of two numbers
	 */
	public static int gcd(int a,int b) {
		    while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
                    }
        return a;
        
    }
	
	public int getCommonDivisor(int firstNumber, int secondNumber) {
		// TODO the method body
		return 0;
	}

	/**
	 * Returns sum of digits of the given number
	 * 
	 * @param number
	 *            - positive number
	 * @return the sum of digits of the given number
	 */
	public int getSumOfDigits(int number) {
		// TODO the method body
		return 0;
	}

	/**
	 * Checks if the given number is prime or not
	 * 
	 * @param number
	 * @return true - if number is prime, if not return false
	 */
	public boolean isPrime(int number) {
		// TODO the method body
		return false;
	}

	/**
	 * Returns sum of row: 1! - 2! + 3! – 4! + 5! - … + n!
	 * 
	 * @param n
	 *            - positive number
	 */
	public int getSumOfRow(int n) {
		// TODO the method body
		return 0;
	}

	/**
	 * Подсчитать, сколько шестизначных чисел имеют равную сумму трех первых и
	 * трех последних цифр.
	 * 
	 */
	public int getSixDigitNumbersCount() {
		return 0;
	}

	/**
	 * Returns Fibonacci series of a specified length
	 * 
	 * @param length
	 *            - the length of the Fibonacci series
	 * @return array filled with Fibonacci series
	 */
	public int[] getFibonacciSeries(int length) {
		// TODO the method body
		return null;
	}

	/**
	 * Returns array with prime numbers
	 * 
	 * @param length
	 *            - the length of prime numbers series
	 * @return array filled with prime numbers
	 */
	public int[] getPrimeSeries(int length) {
		// TODO the method body
		return null;
	}

	/**
	 * Prints to console chessboard using arrays b - black square w - white
	 * square
	 * 
	 * the output should be like the following
	 * 
	 * w b w b w b w b b w b w b w b w w b w b w b w b b w b w b w b w w b w b w
	 * b w b b w b w b w b w w b w b w b w b b w b w b w b w
	 */
	public void printChessboard() {
		// TODO the method body
	}

	/**
	 * 1.9. Создать целый шестимерный массив с двумя значениями в каждом
	 * измерении. Заполнить массив числами из начала натурального ряда: 1, 2, 3,
	 * … Сказать, сколько потребуется чисел ?
	 * 
	 * @return
	 */
	public int createSixDimensionArray() {
		return 0;
	}

	/**
	 * Prints to console Pascal's triangle with the given number of rows
	 * 
	 * @param numberOfRows
	 *            the number of rows in the triangle
	 */
	public void printPascalsTriangle(int numberOfRows) {
		// TODO the method body
	}
	
	public static void main(String[] args) {
		MathOperation math = new MathOperation();
		
		int gdc = math.getCommonDivisor(10, 15); // 5
		int sumOfDigits = math.getSumOfDigits(123456); // 21
		boolean isPrime = math.isPrime(7); // true
		isPrime = math.isPrime(10); //false
		int sumOfRow = math.getSumOfRow(5);
		int count = math.getSixDigitNumbersCount();
		int [] fibbonacci = math.getFibonacciSeries(10); // [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
		int [] primes = math.getPrimeSeries(5); // 1, 3, 5, 7, 11
		math.printChessboard();
		int numbersCount = math.createSixDimensionArray();
		math.printPascalsTriangle(3);
	}
}
