package Test;

import com.kgc.pojo.Dept;
import com.kgc.pojo.Person;
import com.kgc.service.PersonService;

import java.util.List;

public class Persontest {

    public static void main(String[] args) {
        PersonService personService=new PersonService();
        List<Person>list = personService.getAll();
        for (Person person : list) {
            System.out.println("编号："+person.getId()+"姓名"+person.getName()+"年龄"+person.getAge()+"地址"+person.getAddress()+"部门编号"+person.getDept_id()+"部门姓名"+person.getDept().getDeptname());
        }
    }
}
