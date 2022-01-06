package com.eubssantos.myfirstproject.repositories;

import com.eubssantos.myfirstproject.category.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductRepository {

    private Map<Long, Product> map = new HashMap<>();

    public void save(Product obj) {
		map.put(obj.getId(), obj);
    }

    public Product findById(Long id) {
		return map.get(id);
    }

    public List<Product> findAll() {
		return new ArrayList<Product>(map.values());
    }
}
