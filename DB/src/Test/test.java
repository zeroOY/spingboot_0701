package Test;

import com.kgc.pojo.Dept;
import com.kgc.service.DeptService;
import sun.net.sdp.SdpSupport;

import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DeptService ds = new DeptService();
        List<Dept> list = ds.getAll();
        for (Dept dept : list) {
            System.out.println("编号：" + dept.getId() + "部门名称：" + dept.getDeptname());
        }

       /* Dept dept = new Dept();
        System.out.println("请输入部门名称：");
        String name=input.next();
        dept.setDept_name(name);
        int insert = ds.insert(dept);
        if(insert>0){
            System.out.println("新增成功！！");
        }
        System.out.println("请输入要删除的ID：");
        int id=input.nextInt();
        int delete = ds.delete(id);
        if(delete>0){
            System.out.println("删除成功！");
        }else {
            System.out.println("删除失败！");
        }

        System.out.println("请输入要修改的ID：");
        int id2=input.nextInt();
        Dept dept1 = new Dept();
        dept1.setId(id2);
        System.out.println("请输入修改后的部门名称：");
        String name2=input.next();
        dept1.setDept_name(name2);
        int update = ds.update(dept1);
        if(update>0){
            System.out.println("修改成功！");
        }
    }
*/

    }
}
