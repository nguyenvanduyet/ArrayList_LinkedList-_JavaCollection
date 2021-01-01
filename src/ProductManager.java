import java.util.*;

public class ProductManager {
    Map<String, Product> listProduct = new TreeMap();
    Set<String> keylist = listProduct.keySet();
    private Product Product;


    public void addProduct(String sourceId, Product product) {
        listProduct.put(sourceId, product);
    }

    public void disPlayAll() {
        for (String key :
                keylist) {
            System.out.println(listProduct.keySet());

        }
    }


    public void repairProduct() {
    }

    public void removeProduct() {
        listProduct.remove(Product);

    }

    public void searchProduct() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
