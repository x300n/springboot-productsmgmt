package org.ahmedgaber.productsmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.ahmedgaber.productsmanager.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
