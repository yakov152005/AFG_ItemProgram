public class NewItem{
	private Item product;
	private int bonus;


	// Constructor
	public NewItem(Item product, int bonus) {
		this.product = product;
		this.bonus = bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public float cost(int numberProducts) {
		float finalCost = 0.0f;
		if (numberProducts <= 100){
			finalCost =product.costPrice(numberProducts);
		}else {
			float discount = (float) bonus/100;
			finalCost = product.costPrice(100) + ((numberProducts-100) * ((product.getPrice() - (product.getPrice() * discount))));
		}
		return finalCost;
	}

}
