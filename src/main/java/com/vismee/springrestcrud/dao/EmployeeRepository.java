package com.vismee.springrestcrud.dao;


import com.vismee.springrestcrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*
  Spring Data REST scans JpaRepository and creates Rest API for crud operations automagically based on
  entity type.

  @RepositoryRestResource - the default name of endpoint will be pluralized form of entity name but
  if we need to change it explicity we can do it so by using this annotation
*/

// @RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
    // No need to write any code .. crud operations will be available for free for the Employee entity
}
