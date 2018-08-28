package student.dao;

import student.model.Student;

import java.util.Date;
import java.util.List;



public class StudentDao implements StudentDAL {


    private  static Student student = new Student();
    public void saveStudents(List<Student> students) {

    }

    public void saveStudent(Student student) {

    }

    public Student getStudentByRollNo(long rollNo) {



       return  null;
    }

    public List<Student> getStudentsByPercentage(double gte, double lte) {
        return null;
    }

    public List<Student> getStudentsByDOB(Date after) {
        return null;
    }

    public List<Student> findStudentByNameLike(String name) {
        return null;

    }


}
