import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        
        List<Float> productPriceList = productsList.stream().map(x->x.price).collect(Collectors.toList());
        System.out.println(productPriceList);
        
        productsList.forEach(System.out::println);
        productPriceList.forEach(System.out::println);
        
//        Set<Product> productPriceList1 = productsList.stream().sorted().collect(Collectors.toSet());
//        System.out.println(productPriceList1);
        
        productPriceList.forEach(prices -> System.out.println(prices));
        
        productPriceList.stream().forEachOrdered(prices -> System.out.println(prices));
        
        productPriceList.forEach(System.out::println);
	}

}
