package it.danielecerulli.carapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.danielecerulli.carapp.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
