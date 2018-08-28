package student.model;

import java.util.Date;

public class Student {
    private int rollNo;
    private String name;
    private String gender;
    private long mobileNumber;
    private String gmailId;
    private double percentage;
    private Date dob;


    public Student(int rollNo, String name, String gender, long mobileNumber, String gmailId, double percentage, Date dob) {
        this.rollNo = rollNo;
        this.name = name;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.gmailId = gmailId;
        this.percentage = percentage;
        this.dob = dob;
    }

    public Student() {

    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getGmailId() {
        return gmailId;
    }

    public void setGmailId(String gmailId) {
        this.gmailId = gmailId;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", gmailId='" + gmailId + '\'' +
                ", percentage=" + percentage +
                ", dob=" + dob +
                '}';
    }
}
