package io.github.rahulrajsonu.springbootcassandrademo.repository;

import io.github.rahulrajsonu.springbootcassandrademo.model.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ProductRepository extends CassandraRepository<Product,Integer> {
}
