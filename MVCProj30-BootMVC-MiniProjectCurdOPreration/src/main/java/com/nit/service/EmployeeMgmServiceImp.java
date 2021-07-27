package com.nit.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.nit.model.Emplyee;
import com.nit.repo.IEmpolyeeRepository;

@Service("empService")
@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
public class EmployeeMgmServiceImp implements EmployeeMgmService {
    @Autowired
	private IEmpolyeeRepository empRepo;
    
	@Override
	public Iterable<Emplyee> fetchAllEmps() {
		Iterable<Emplyee> listEmps=empRepo.findAll();
		return listEmps;
	}

	@Override
	public Emplyee fetchEmployeeDetailsById(int eno) {
		// use dao
		Emplyee emp=empRepo.findById(eno).get();
		return emp;
	}

	@Override
	public String modifyEmplolyeeDetailByEno(Emplyee emp) {
	  Emplyee emp1=empRepo.findById(emp.getEmpno()).get();
	  System.out.println(emp1);
	  if(emp1!=null) {
		  empRepo.save(emp);
		  return "Employee Update";
	  }
	  else {
	return "Employee Not Updates";
	  }
	}

	@Override
	public String fireEmployeeByNO(int eno) {
		if(empRepo.findById(eno).get()!=null) {
			empRepo.deleteById(eno);
			return "Employee Deleted";
		}
		else
		return "Employee Not Deleted";
		
	}

}
