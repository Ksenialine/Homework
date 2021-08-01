package by.academy.homework3;

public class Application {
	public static void main(String... args) {
		Deal deal = new Deal();
		User seller = new User();
		User buyer = new User();

		Product[] products = new Product[3];

		products[0] = new Milk("Молоко", 1.5, 1, 1.5, 0.75);
		products[1] = new Cheese("Сыр", 3.7, 1, 1.5, "Оранжевый");
		products[2] = new Ham("Хамон", 25, 1, 0.5, 3);

		deal.setBuyer(buyer);
		deal.setSeller(seller);

		deal.setProducts(products);
		System.out.println("Bill: ");
		for (Product p : deal.getProducts()) {
			System.out.println(p.getName() + " price: " + p.calcPrice());
		}
		System.out.println("------------");
		System.out.println("Full price: " + deal.calcFullPrice());
	}

}