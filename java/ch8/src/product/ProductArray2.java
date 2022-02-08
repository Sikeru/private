package product;

public class ProductArray2 {

	public static int calcProdQty(Product[] prod) {
		int total = 0;

		for (int i = 0; i < prod.length; i++) {
			total += prod[i].getQty();
		}
		return total;
	}

	public static void main(String[] args) {
		int totProd = 0;
		Product[] product = new Product[3];
		product[0] = new Product();
		product[1] = new Product("0002", "½º¸¶Æ® TV", "Èò»ö", 200);
		product[2] = new Product("0003", "³ëÆ®ºÏ", "Àº»ö", 100);

		totProd = calcProdQty(product);
		System.out.println("ÃÑ Á¦Ç° ¼ö·®Àº" + totProd);
	}

}
