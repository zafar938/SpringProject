package com.nit.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nit.entity.Employee;

public interface IEmployeeRepo extends PagingAndSortingRepository<Employee, Integer> {

}
