package 学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class StudetManager {
    public static void main(String[] args){
        ArrayList<Student>array=new ArrayList<Student>();
        while(true){
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1,添加学生");
            System.out.println("2,删除学生");
            System.out.println("3,修改学生");
            System.out.println("4,查看所有学生");
            System.out.println("5,退出");
            System.out.println("请输入你的选择:");

            Scanner sc=new Scanner(System.in);
            String line=sc.nextLine();

            switch(line){
                case"1":
                    addStudent(array);
                    System.out.println("1,添加学生");
                    break;
                case"2":
                    deleteStudent(array);
                    System.out.println("2,删除学生");
                    break;
                case"3":
                    updateStudent(array);
                    System.out.println("3,修改学生");
                    break;
                case"4":
                    findAllStudent(array);
                    System.out.println("4,查看所有学生");
                    break;
                case"5":
                    System.out.println("谢谢使用");
                    System.exit(0);
            }
        }
    }
    /*主界面的代码编写*/

    public static void addStudent(ArrayList<Student>array){
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入学生学号:");
        String sid=sc.nextLine();
        System.out.println("请输入学生姓名:");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄:");
        String age=sc.nextLine();
        System.out.println("请输入学生居住地:");
        String address=sc.nextLine();

        Student s=new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);
        System.out.println("添加学生成功");
    }
    /*添加学生*/

    public static void findAllStudent(ArrayList<Student>array){
        System.out.println("学生\t\t姓名\t\t姓名\t\t年龄\t\t居住地");
        for(int i=0;i<array.size();i++){
            Student s=array.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"岁\t\t"+s.getAddress());
        }
    }
    /*查看学生信息*/

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除学生的学号:");
        String sid = sc.nextLine();

        int index = -1;
        for (int i=0; i < array.size(); i++) {
            Student s = array.get(i);

            if (s.getSid().equals(sid)) {
                array.remove(i);
                break;
            }
        }
        System.out.println("删除学生成功");
    }
    /*删除学生信息*/

    public static void updateStudent(ArrayList<Student>array){
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入学生你要修改的新学号:");
        String sid=sc.nextLine();
        System.out.println("请输入学生你要修改的新姓名:");
        String name=sc.nextLine();
        System.out.println("请输入学生你要修改的新年龄:");
        String age=sc.nextLine();
        System.out.println("请输入学生你要修改的新居住地:");
        String address=sc.nextLine();

        Student s=new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        for(int i=0;i<array.size();i++){
            Student student=array.get(i);
            if(student.getSid().equals(sid)){
                array.set(i,s);
                break;
            }
        }
        System.out.println("修改学生成功");
    }
    /*修改学生信息*/
}
