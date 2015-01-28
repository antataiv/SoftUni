import java.util.Scanner;

public class P08SortArrayOfStrings {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter how many items you want to be sorted? ");
		int itemsToBeSorted = Integer.parseInt(input.nextLine());
		
		String[] items = new String[itemsToBeSorted];
		for (int i = 0; i < items.length; i++) {
			System.out.printf("%d ", i+1);
			items[i] = input.nextLine();
		}
		
		for (int i = 0; i < items.length; i++) {
			for (int index = 0; index < items.length - 1; index++) {
				if (items[index].compareTo(items[index+1]) > 0){
					String temp = items[index+1];
					items[index+1] = items[index];
					items[index] = temp;
				}
			}
		}
		
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}
	}
}