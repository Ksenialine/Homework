package by.academy.homework3;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Deal {
	private Product[] products;
	private User seller;
	private User buyer;
	private Date dealDate;
	private LocalDate today;
	private LocalDate deadLineDate;

	public Deal() {
		super();
	}

	public Deal(Product[] products, User seller, User buyer, Date dealDate, LocalDate today, LocalDate deadLineDate) {
		super();
		this.products = products;
		this.seller = seller;
		this.buyer = buyer;
		this.dealDate = dealDate;
		this.today = today;
		this.deadLineDate = deadLineDate;
	}

	public double calcFullPrice() {
		double fullPrice = 0;

		if (products != null) {
			for (Product p : products) {
				fullPrice += p.calcPrice();
			}
		}
		return fullPrice;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Date getDealDate() {
		return dealDate;
	}

	public void setDealDate(Date dealDate) {
		this.dealDate = dealDate;
	}

	public LocalDate getToday() {
		return today;
	}

	public void setToday(LocalDate today) {
		this.today = today;
	}

	public LocalDate getDeadLineDate() {
		return deadLineDate;
	}

	public void setDeadLineDate(LocalDate deadLineDate) {
		this.deadLineDate = deadLineDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + Objects.hash(buyer, deadLineDate, dealDate, seller, today);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deal other = (Deal) obj;
		return Objects.equals(buyer, other.buyer) && Objects.equals(deadLineDate, other.deadLineDate)
				&& Objects.equals(dealDate, other.dealDate) && Arrays.equals(products, other.products)
				&& Objects.equals(seller, other.seller) && Objects.equals(today, other.today);
	}

	@Override
	public String toString() {
		return "Deal [products=" + Arrays.toString(products) + ", seller=" + seller + ", buyer=" + buyer + ", dealDate="
				+ dealDate + ", today=" + today + ", deadLineDate=" + deadLineDate + "]";
	}

	// Текущая дата + 10 дней
	public LocalDate today() {
		LocalDate today = LocalDate.now();
		LocalDate deadLineDate = today.plusDays(10);
		return deadLineDate;
	}

	public void addProduct(Product product) {
		Product[] addProd = new Product[products.length + 1];
		for (int i = 0; i < products.length; i++) {
			addProd[i] = products[i];
		}
		addProd[products.length] = product;
		products = addProd;
	}

	public void removeProducts() {

		getProducts();
		Product[] removeProd = new Product[products.length - 1];

		System.out.println("Введите номер продукта в списке который вы хотите удалить:");

		int productIndex = intValidate();
		while (productIndex > products.length || productIndex < 0) {
			System.out.println("Введите существующий номер!");
			productIndex = intValidate();
		}

		for (int i = 0, j = 0; j < products.length; j++) {
			if (products[j].equals(products[productIndex]) != true) {
				removeProd[i] = products[j];
				i++;
			}

		}
		products = removeProd;
	}

	private int intValidate() {
		// TODO Auto-generated method stub
		return 0;
	}

}