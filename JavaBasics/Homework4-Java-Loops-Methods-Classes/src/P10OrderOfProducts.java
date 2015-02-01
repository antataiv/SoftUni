import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;

public class P10OrderOfProducts {
	public static void main(String[] args) {
		BigDecimal totalOrderPrice = new BigDecimal(0);
		try {
			BufferedReader productPricesReader = new BufferedReader(new FileReader("Products.txt"));
			ArrayList<Product> productPrices = new ArrayList<Product>();
			
			String priceEntry = productPricesReader.readLine();
			
			while (priceEntry != null) {
				String[] entry = priceEntry.trim().split(" ");
				String name = entry[0];
				BigDecimal price = new BigDecimal(entry[1]);
				Product currentProduct = new Product(name, price);
				productPrices.add(currentProduct);
				priceEntry = productPricesReader.readLine();
			}
			productPricesReader.close();
			
			BufferedReader productOrders = new BufferedReader(new FileReader("Order.txt"));
			String orderEntry = productOrders.readLine();
			while (orderEntry != null) {
				String[] entry = orderEntry.trim().split(" ");
				for (Product item : productPrices) {
					if (item.getName().equals(entry[1])) {
						BigDecimal quantity = new BigDecimal(entry[0]);
						BigDecimal orderedPrice = (item.getPrice()).multiply(quantity);
						totalOrderPrice = totalOrderPrice.add(orderedPrice);
					}
				}
				orderEntry = productOrders.readLine();
			}
			productOrders.close();
			
			System.out.println(totalOrderPrice);
			
			BufferedWriter buffWriter = new BufferedWriter(new FileWriter("Output.txt"));
			buffWriter.write(totalOrderPrice.toPlainString());
			buffWriter.close();
		}
		catch (Exception e) {
			System.out.println("Error, while reading file!!!");
		}
	}
}