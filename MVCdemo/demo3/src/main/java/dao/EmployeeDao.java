package dao;

import bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employs=null;
    static{
        employs = new HashMap<Integer, Employee>();
   // m模拟数据库 还没学mabies
        //map对于的是sql里面的记录 k value key对应主键
        employs.put(1001, new Employee(1001, "E-AA", "aa@163.com", 1));
        employs.put(1002, new Employee(1002, "E-BB", "bb@163.com", 1));
        employs.put(1003, new Employee(1003, "E-CC", "cc@163.com", 0));
        employs.put(1004, new Employee(1004, "E-DD", "dd@163.com", 0));
        employs.put(1005, new Employee(1005, "E-EE", "ee@163.com", 1));
        employs.put(1006,new Employee(1006,"e-dd","mm@sdsd",0));
    }

    private static Integer initId = 1006;

    public void save(Employee employee){
        if(employee.getId() == null){
            employee.setId(initId++);
        }
        employs.put(employee.getId(), employee);
    }

    public Collection<Employee> getAll(){
        return employs.values();
    }

    public Employee get(Integer id){
        return employs.get(id);
    }

    public void delete(Integer id){
        employs.remove(id);
    }

}
