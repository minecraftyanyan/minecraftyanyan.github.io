package ѧ������ϵͳ;

import java.util.ArrayList;
import java.util.Scanner;

public class StudetManager {
    public static void main(String[] args){
        ArrayList<Student>array=new ArrayList<Student>();
        while(true){
            System.out.println("-----��ӭ����ѧ������ϵͳ-----");
            System.out.println("1,���ѧ��");
            System.out.println("2,ɾ��ѧ��");
            System.out.println("3,�޸�ѧ��");
            System.out.println("4,�鿴����ѧ��");
            System.out.println("5,�˳�");
            System.out.println("���������ѡ��:");

            Scanner sc=new Scanner(System.in);
            String line=sc.nextLine();

            switch(line){
                case"1":
                    addStudent(array);
                    System.out.println("1,���ѧ��");
                    break;
                case"2":
                    deleteStudent(array);
                    System.out.println("2,ɾ��ѧ��");
                    break;
                case"3":
                    updateStudent(array);
                    System.out.println("3,�޸�ѧ��");
                    break;
                case"4":
                    findAllStudent(array);
                    System.out.println("4,�鿴����ѧ��");
                    break;
                case"5":
                    System.out.println("ллʹ��");
                    System.exit(0);
            }
        }
    }
    /*������Ĵ����д*/

    public static void addStudent(ArrayList<Student>array){
        Scanner sc=new Scanner(System.in);

        System.out.println("������ѧ��ѧ��:");
        String sid=sc.nextLine();
        System.out.println("������ѧ������:");
        String name=sc.nextLine();
        System.out.println("������ѧ������:");
        String age=sc.nextLine();
        System.out.println("������ѧ����ס��:");
        String address=sc.nextLine();

        Student s=new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);
        System.out.println("���ѧ���ɹ�");
    }
    /*���ѧ��*/

    public static void findAllStudent(ArrayList<Student>array){
        System.out.println("ѧ��\t\t����\t\t����\t\t����\t\t��ס��");
        for(int i=0;i<array.size();i++){
            Student s=array.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"��\t\t"+s.getAddress());
        }
    }
    /*�鿴ѧ����Ϣ*/

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��������Ҫɾ��ѧ����ѧ��:");
        String sid = sc.nextLine();

        int index = -1;
        for (int i=0; i < array.size(); i++) {
            Student s = array.get(i);

            if (s.getSid().equals(sid)) {
                array.remove(i);
                break;
            }
        }
        System.out.println("ɾ��ѧ���ɹ�");
    }
    /*ɾ��ѧ����Ϣ*/

    public static void updateStudent(ArrayList<Student>array){
        Scanner sc=new Scanner(System.in);

        System.out.println("������ѧ����Ҫ�޸ĵ���ѧ��:");
        String sid=sc.nextLine();
        System.out.println("������ѧ����Ҫ�޸ĵ�������:");
        String name=sc.nextLine();
        System.out.println("������ѧ����Ҫ�޸ĵ�������:");
        String age=sc.nextLine();
        System.out.println("������ѧ����Ҫ�޸ĵ��¾�ס��:");
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
        System.out.println("�޸�ѧ���ɹ�");
    }
    /*�޸�ѧ����Ϣ*/
}
