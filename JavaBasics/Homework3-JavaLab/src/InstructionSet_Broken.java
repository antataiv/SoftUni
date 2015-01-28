import java.util.Scanner;
public class InstructionSet_Broken {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String opCode = input.nextLine();

		while (!opCode.equals("END")) {
			String[] codeArgs = opCode.split(" ");

			long result = 0;
			switch (codeArgs[0]) {
			case "INC": {
				//int operandOne = Integer.parseInt(codeArgs[1]);
				long operandOne = Long.parseLong(codeArgs[1]);			//all operands should be defined as long
				//result = operandOne++;
				result = ++operandOne;						//operandOne should be first incremented and then assigned to result
				break;
			}
			case "DEC": {
				//int operandOne = Integer.parseInt(codeArgs[1]);
				long operandOne = Long.parseLong(codeArgs[1]);			//all operands should be defined as long
				//result = operandOne--;
				result = --operandOne;						//operandOne should be decremented first and then assigned to result
				break;
			}
			case "ADD": {
				//int operandOne  = Integer.parseInt(codeArgs[1]);
				long operandOne = Long.parseLong(codeArgs[1]);			//all operands should be defined as long
				//int operandTwo = Integer.parseInt(codeArgs[2]);
				long operandTwo = Long.parseLong(codeArgs[2]);			//all operands should be defined as long
				result = operandOne + operandTwo;
				break;
			}
			case "MLA": {
				//int operandOne  = Integer.parseInt(codeArgs[1]);
				long operandOne = Long.parseLong(codeArgs[1]);			//all operands should be defined as long
				//int operandTwo = Integer.parseInt(codeArgs[2]);
				long operandTwo = Long.parseLong(codeArgs[2]);			//all operands should be defined as long
				//result = (long)(operandOne * operandTwo);
				result = operandOne * operandTwo;								//no need of casting
				break;
			}
			default:
				break;
			}
			
			System.out.println(result);
			//add a line to get the next command at the end of each while loop
			opCode = input.nextLine();
		}
	}
}