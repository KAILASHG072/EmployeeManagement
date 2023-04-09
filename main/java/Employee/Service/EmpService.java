package Employee.Service;

import Employee.Entity.Employee;
import Employee.Repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    EmpRepo repo;

    public void addEmp(Employee e)
    {
        repo.save(e);
    }
    public List<Employee> getAllEmp(){
        return repo.findAll();
    }

    public Employee getEmpById(int id){
        Optional<Employee> e = repo.findById(id);
        if(e.isPresent()){
            return e.get();
        }return null;
    }
    public void Delete(int id){
       repo.deleteById(id);
       System.out.println();
    }

}
