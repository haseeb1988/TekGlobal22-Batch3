package GenericPackage;

public class StudentService {
    private int rollNumber;
    private String studName;
    private  String program;

    public StudentService(int rollNumber, String studName, String program) {
        this.rollNumber = rollNumber;
        this.studName = studName;
        this.program = program;
    }

    public StudentService()
    {

    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }


}
