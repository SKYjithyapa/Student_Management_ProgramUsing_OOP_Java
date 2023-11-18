public class Student {

    private int StudentID;
    private String Firstname;

    private String Lastname;

    private int Age;

    private Module Module;

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Module getModule() {
        return Module;
    }

    public void setModule(Module module) {
        Module = module;
    }

    public Student(int studentID, String firstname, String lastname, int age, Module module) {
        StudentID = studentID;
        Firstname = firstname;
        Lastname = lastname;
        Age = age;
        Module = module;
    }


    public void StudentDetails(){
        System.out.println("studentID : "  + getStudentID());
        System.out.println("FirstName : " + getFirstname());
        System.out.println("LastName : " + getLastname());
        System.out.println("Age : " + getAge());
        Module.PrintModule();
    }



}
