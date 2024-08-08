import java.util.HashMap;
import java.util.Map;

public class StoreInventory {
    private Map<Integer, Product> productCatalog;

    public StoreInventory() {
        this.productCatalog = new HashMap<>();
    }

    public void registerProduct(Product newProduct) {
        productCatalog.put(newProduct.getProductId(), newProduct);
    }

    public void modifyProduct(int productId, Product updatedProduct) {
        if (productCatalog.containsKey(productId)) {
            Product existingProduct = productCatalog.get(productId);
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setQuantity(updatedProduct.getQuantity());
        }
    }

    public void removeProduct(int productId) {
        productCatalog.remove(productId);
    }

    public Product findProduct(int productId) {
        return productCatalog.get(productId);
    }
}
