package com.nit.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nit.entity.Employee;

public interface IEmployeeMgmtService {
    public Page<Employee> getPageData(Pageable pageable);
}
