package com.example.idmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.idmanagement.model.IdentityCard;

@Repository
public interface IdRepository extends JpaRepository<IdentityCard, Integer>{

}
