import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P09ListOfProducts {
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		try {
			Scanner input = new Scanner(new File("Input.txt"));
			while (input.hasNext()) {
				String[] inputLine = input.nextLine().trim().split(" ");
				String name = inputLine[0];
				BigDecimal price = new BigDecimal(inputLine[1]);
				Product currentProduct = new Product(name, price);
				productList.add(currentProduct);
			}
			input.close();
			
			Collections.sort(productList);
			
			BufferedWriter bufWriter = new BufferedWriter(new FileWriter("Output.txt"));
			for (Product product : productList) {
				bufWriter.write(product.getPrice()+ " " + product.getName() + "\n");
			}
			bufWriter.close();
		}
		catch (Exception e) {
			System.out.println("Cannot red file!!!");
		}
	}
}