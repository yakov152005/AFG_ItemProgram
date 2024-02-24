public class Program {
	public static void main(String[] args) {
		Item item = new Item(1, "A", 10.0f);
		System.out.println(item);
		System.out.println("The sum for 1000 items is: " + item.costPrice(1000));

		NewItem newItem =new NewItem(item, 50);
		System.out.println("The sum for 1000 items is: " + newItem.cost(1000));


	}

}
