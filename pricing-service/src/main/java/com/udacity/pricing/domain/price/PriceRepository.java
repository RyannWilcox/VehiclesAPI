package com.udacity.pricing.domain.price;

import com.udacity.pricing.entity.Price;
import org.springframework.data.repository.CrudRepository;

public interface PriceRepository extends CrudRepository<Price, Long> {
}
