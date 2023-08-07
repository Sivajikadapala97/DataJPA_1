package com.example.DataJPA_1;

import com.example.DataJPA_1.entity.Employee;
import com.example.DataJPA_1.entity.Product;
import com.example.DataJPA_1.repository.EmpRepository;
import com.example.DataJPA_1.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run1 = SpringApplication.run(DataJpa1Application.class, args);
		EmpRepository emprepository = run1.getBean(EmpRepository.class);

		System.out.println("Impl class "+emprepository.getClass().getName());
//		Save:only one record
//		Employee employee=new Employee();
//		employee.setEmpId(103);
//		employee.setEmpName("Ramana");
//		employee.setEmpSal(180000.00);
//		emprepository.save(employee);


		//Save all:insert multiple records
//		Employee e1=new Employee(104,"Ramu",23000.00);
//		Employee e2=new Employee(105,"Rani",24000.00);
//		Employee e3=new Employee(106,"Gita",34000.00);
//		List<Employee> employees=new ArrayList<>();
//		employees.add(e1);
//		employees.add(e2);
//		employees.add(e3);
//		emprepository.saveAll(employees);


//		findByID :getting one record
//		Optional<Employee> byId = emprepository.findById(107);
//		if (byId .isPresent()) {
//			System.out.println("Prsented value is : " +byId.get());
//		}else {
//			System.out.println("Is not Presented");
//		}


//		findAllById :getting multiple records
//		List<Serializable> empIds=new ArrayList<>();
//		empIds.add(101);
//		empIds.add(102);
//		empIds.add(103);
//		Iterable<Employee> allById = emprepository.findAllById(empIds);
//		allById.forEach(emp->{
//			System.out.println(emp);
//		});


//		findAll : Retrieve all records
//		Iterable<Employee> all = emprepository.findAll();
//		all.forEach(emp->{
//			System.out.println(emp);
//		});

//		count: How many records present in table
//		long count = emprepository.count();
//		System.out.println(count+" records are present in Employee table");
//		boolean b = emprepository.existsById(104);
//		System.out.println(b+" record is available");


//		deleteById:Delete the record based on ID
//		emprepository.deleteById(200);

// 		deleteAllById:Delete the records based on IDs
//		emprepository.deleteById(200);
//		List<Serializable> list=new ArrayList<>();
//		list.add(104);
//		list.add(105);
//		emprepository.deleteAllById(list);


//		deleteAll: deleting all records
//		emprepository.deleteAll();


//		ProductRepository productRepository=run1.getBean(ProductRepository.class);
//		Product product=new Product();
//		product.setProductId(101);
//		product.setProductName("Mouse");
//		product.setProductPrice(900.00);
//		productRepository.save(product);
		System.out.println(" +++++Recored Saved++++++ ");
	}

}
