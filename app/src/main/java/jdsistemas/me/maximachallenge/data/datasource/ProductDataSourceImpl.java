package jdsistemas.me.maximachallenge.data.datasource;

import java.util.List;

import jdsistemas.me.maximachallenge.model.Product;


/**
 * @author Jorge Danilo Gomes.
 *
 * Created on data 01/08/18.
 */
public class ProductDataSourceImpl implements ProductDataSource {


    /**
     * Atribute product.
     *
     */
    private Product product;


    /**
     * Responsable to find products on data base.
     *
     * @author Jorge Danilo Gomes.
     *
     * @return
     */
    @Override
    public List<Product> listAll() {
        List<Product> products = Product.listAll(Product.class);
        return products;
    }
}
