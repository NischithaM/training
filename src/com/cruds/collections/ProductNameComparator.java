package com.cruds.collections;

import java.util.Comparator;
import com.cruds.collections.Product;

public class ProductNameComparator  implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getProductname().compareTo(o2.getProductname());
	}

}
