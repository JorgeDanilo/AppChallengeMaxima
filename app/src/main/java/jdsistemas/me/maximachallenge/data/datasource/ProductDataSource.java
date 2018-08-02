package jdsistemas.me.maximachallenge.data.datasource;

import java.util.List;

import jdsistemas.me.maximachallenge.model.Product;

/**
 * Interface Product to user Repository.
 *
 * @author Jorge Danilo Gomes.
 */
public interface ProductDataSource {


    /**
     * Method to find all products.
     *
     * @return
     */
    List<Product> listAll();

}
