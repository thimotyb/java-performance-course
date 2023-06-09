package com.example.services;

import com.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class RandomProductsService {

	// Here it produces a Leak
	List<Product> result = new ArrayList<>();
	
  public List<Product> getRandomProductsList(int n) {
      // Here it gets GC'd when finished (and JIT-cached)s
	  //List<Product> result = new ArrayList<>();
    Random r = new Random();
    for (int i = 0; i < n; i++) {
      int randomValue = r.nextInt(1000);

      Product p = new Product();
      p.setPrice(randomValue);

      result.add(p);
    }

    return result;
  }
}
