package Employee.Controller;


import Employee.Entity.Employee;
import Employee.Service.EmpService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping("/home")
    public String home(Model m)
    {
        List<Employee> emp=empService.getAllEmp();
        m.addAttribute("emp",emp);
        return  "index";
    }

    @GetMapping("/addemp")
    public String addEmpForm()
    {
        return  "add_emp";
    }

    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee e, HttpSession session)
    {
       empService.addEmp(e);
       session.setAttribute("msg","Employee Added successfully");
        return  "redirect:/home";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id,Model m){
      Employee emp =  empService.getEmpById(id);
        m.addAttribute("emp",emp);
        return "edit";
    }

    @PostMapping("/update")
    public String updateEmp(@ModelAttribute Employee e,HttpSession session){
        empService.addEmp(e);
        session.setAttribute("msg","emp data updated");
        return "redirect:/home";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id,Model m){
        empService.Delete(id);
        return "redirect:/home";
    }

}


