package by.sfedu.manager.client;

import by.sfedu.manager.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductsRestClient {

    List<Product> findAllProducts();

    Product createProduct(String title, String details);

    Optional<Product> findProduct(int productId);

    void updateProduct(int productId, String title, String details);

    void deleteProduct(int productId);
}
