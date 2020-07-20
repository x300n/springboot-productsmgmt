package org.ahmedgaber.productsmanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import org.ahmedgaber.productsmanager.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
