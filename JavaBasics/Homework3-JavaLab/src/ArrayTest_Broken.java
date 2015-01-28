import java.util.Scanner;

public class ArrayTest_Broken {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);	

		//int sizeOfArray = scn.nextInt();
		int sizeOfArray = Integer.parseInt(scn.nextLine());			//should be parsing the whole line, not only the int value
		long[] array = new long[sizeOfArray];

		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextLong(); 
		}

		String command = scn.next();

		//while (!command.equals("over")) {
		while (!command.equals("stop")) {								//the command for end of the program is "stop", not "over"
			String line = scn.nextLine().trim();
			int[] params = new int[2];

			//if(command.equals("add") || command.equals("substract") || command.equals("multiply")) {
			//the correct command is "subtract", not "substract"
			if(command.equals("add") || command.equals("subtract") || command.equals("multiply")) {
				String[] stringParams = line.split(" ");
				params[0] = Integer.parseInt(stringParams[0]);
				params[1] = Integer.parseInt(stringParams[1]);

				//performAction(array, command, params);
				array = performAction(array, command, params);			//performAction returns an array, which should be stored in some variable in order to be printed
			}
			//two more cases should be added "rshift" and "lshift"
			else if (command.equals("rshift")) {
				array = arrayShiftRight(array);
			}
			else if (command.equals("lshift")) {
				array = arrayShiftLeft(array);
			}
			//performAction(array, command, params); -  not needed here

			printArray(array);
			System.out.print('\n');

			command = scn.next();			
		}	
	}

	//static void performAction(long[] arr, String action, int[] params){
	static long[] performAction(long[] arr, String action, int[] params){		//method should return a new array as result with the performed changes
		long[] array = arr.clone();
		//int pos = params[0];
		int pos = params[0] - 1;							//because the element in array start from 0, 1, 2,...etc, meaning that the 2nd element is 1, 3rd - 2, etc....
		int value = params[1];

		switch (action) {
		case "multiply":
			array[pos] *= value;
			break;
		case "add":
			array[pos] += value;
			break;
		case "subtract":
			array[pos] -= value;
			break;
		//the below two cases are not needed anymore here as shifting methods are called in the main() method through if-else construction
		//case "lshift":
		//	arrayShiftLeft(array);
		//	break;
		//case "rshift":
		//	arrayShiftRight(array);
		//	break;
		}
		return array;			//method should return a new array with the already made changes
	}

	private static long[] arrayShiftRight(long[] array) {
		//this method should return a new array, with the changes made, most of the method's code is overwritten with new code
		long temp = array[array.length - 1];
		for (int i = array.length-1; i >= 0 ; i--) {
			if (i ==0) {
				array[i] = temp;
			}
			else {
				array[i] = array[i - 1];
			}
		}
		return array;
	}

	private static long[] arrayShiftLeft(long[] array) {
		//this method should return a new array, with the changes made, most of the method's code is overwritten with new code
		long temp = array[0];
		for (int i = 0; i <= array.length - 1; i++) {
			if (i == array.length - 1) {
				array[i] = temp;
			}
			else {
				array[i] = array[i+1];
			}
		}
		return array;
	}

	private static void printArray(long[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}