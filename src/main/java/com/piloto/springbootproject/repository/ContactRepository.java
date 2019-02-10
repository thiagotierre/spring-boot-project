package com.piloto.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piloto.springbootproject.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
