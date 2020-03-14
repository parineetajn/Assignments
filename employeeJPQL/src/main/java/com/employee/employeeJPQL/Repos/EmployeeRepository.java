package com.employee.employeeJPQL.Repos;

import com.employee.employeeJPQL.entity.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;


public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    @Query("from Employee")
    List<Employee> findAllEmployees();

    //JPQL Q1
    @Query(value = "select AVG(salary) as avgSal from Employee")
    public Double findAvgSalary();

    @Query(value = "select em.firstName, em.lastName from Employee em where em.salary >:avgSal")
    List<Object[]> findFirstNameAndLAstNameGreaterThanAverageSalary(@Param("avgSal") Double avgSal,Sort sort);

   //JPQL Q2
   @Transactional
    @Modifying
    @Query(value = "update Employee set salary =:avgSal where salary <:avgSal")
    public void updateSalary(@Param("avgSal") Double avgSal);

    //JPQL Q3
    @Query(value = "select MIN(salary) as minSal from Employee")
    public Double findMinSalary();

    @Transactional
    @Modifying
    @Query("delete from Employee e where e.salary = :minSal")
    public void deleteMinSalaryEmployees(@Param("minSal") Double minSal);

    //*****************************************************************************************//

    //Native SQL Query Q1
    @Query(value = "select empid,empFirstName,empAge from Employee where empLastName='Singh'",nativeQuery = true)
     List<Object[]> findByLastName();

    //Native SQL Query Q2
    @Transactional
    @Modifying
    @Query(value = "delete from Employee where empAge>:age",nativeQuery = true)
     void deleteEmployee(@Param("age") int age);
}
