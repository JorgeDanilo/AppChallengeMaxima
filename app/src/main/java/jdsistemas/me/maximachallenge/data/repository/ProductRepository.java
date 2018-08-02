package jdsistemas.me.maximachallenge.data.repository;

import java.util.List;

import jdsistemas.me.maximachallenge.data.datasource.ProductDataSource;
import jdsistemas.me.maximachallenge.model.Product;

/**
 * Product Repository.
 *
 * @author Jorge Danilo Gomes.
 *
 */
public class ProductRepository {


    /**
     * Atribute Data Source.
     *
     */
    private final ProductDataSource dataSource;


    /**
     * Constructor
     *
     * @param dataSource
     */
    public ProductRepository(ProductDataSource dataSource) {
        this.dataSource = dataSource;
    }


    /**
     * List all products.
     *
     * @author Jorge Danilo Gomes.
     *
     * @return
     */
    public List<Product> listAll() {
        return dataSource.listAll();
    }
}
