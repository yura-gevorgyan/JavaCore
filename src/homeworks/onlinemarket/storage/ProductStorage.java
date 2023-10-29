package homeworks.onlinemarket.storage;

import homeworks.onlinemarket.model.Product;

public class ProductStorage {
    private Product[] products = new Product[10];
    private int size = 0;

    public void add(Product product) {
        if (size == products.length - 1) {
            extend();
        }
        products[size++] = product;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }

    private void extend() {
        Product[] tmp = new Product[products.length + 10];
        System.arraycopy(products, 0, tmp, 0, products.length);
        products = tmp;
    }

    public Product getProductByID(String productId) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(productId)) {
                return products[i];
            }
        }
        return null;
    }

    public void deleteProduct(Product productFromStorage) {
        for (int i = 0; i < size; i++) {
            if (products[i].equals(productFromStorage)) {
                for (int j = i; j < size; j++) {
                    products[j] = products[j + 1];
                }
            }
        }
        size--;
    }
}
