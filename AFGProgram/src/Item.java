public class Item {
	private long catalog;
	private String name;
	private float price;
	public long getCatalog(){
		return catalog;
	}
	public String getName(){
		return name;
	}
	public float getPrice(){
		return price;
	}
	//constructor1
	public Item(long catalog, String name, float price){
		this.catalog = catalog;
		this.name = name;
		this.price = price;
	}

	//constructor2
	public Item(){
		this.catalog = 0;
		this.name = "NA";
		this.price = 0.0f;
	}
	public String toString(){
		return "Number of Catalog: " + catalog + "\nName of product: " +name +
				"\nPrice of product: " +price;
	}
	public void setData(long catalog, String name, float price) {
		this.catalog = catalog;
		this.name = name;
		this.price = price;
	}
	public float costPrice(int numberProducts){
		return (this.price * numberProducts);
	}
}
