import java.math.BigDecimal;

public class Product implements Comparable<Product> {
	private String name;
	private BigDecimal price;
	
	public Product(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public BigDecimal getPrice() {
		return price;
	}

	@Override
	public int compareTo(Product product1) {
		return this.getPrice().compareTo(product1.getPrice());
	}
}