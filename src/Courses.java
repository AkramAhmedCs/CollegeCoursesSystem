import java.util.ArrayList;

public class Courses {
    private String Cname;
    private int CreditHours;
    private int id;
    private String DrName;


    public Courses(String cname, int creditHours, int id, String drName) {
        this.setCname(cname);
        this.setCreditHours(creditHours);
        this.setId(id);
        this.setDrName(drName);
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public int getCreditHours() {
        return CreditHours;
    }

    public void setCreditHours(int creditHours) {
        CreditHours = creditHours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrName() {
        return DrName;
    }

    public void setDrName(String drName) {
        DrName = drName;
    }

    // In Courses.java
    @Override
    public String toString() {
        return "Course Name: " + Cname + ", Credit Hours: " + CreditHours + ", Instructor: " + DrName+" ,id:"+id;
    }


}
