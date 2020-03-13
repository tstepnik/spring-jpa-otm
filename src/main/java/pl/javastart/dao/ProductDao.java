package pl.javastart.dao;

import org.springframework.stereotype.Repository;
import pl.javastart.model.Product;

import javax.transaction.Transactional;

@Repository
@Transactional
public class ProductDao extends GenericDao<Product,Long> {
}
