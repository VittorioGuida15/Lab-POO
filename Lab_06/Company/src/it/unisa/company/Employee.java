package it.unisa.company;

public class Employee extends Staff {

    private String jobTitle;
    private float hourlyWage;

    public Employee(String name, String lastName, String jobTitle, float hourlyWage){
        super(name, lastName);
        setHourlyWage(hourlyWage);
        setJobTitle(jobTitle);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public float getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(float hourlyWage){
        this.hourlyWage = hourlyWage;
        uploaderSalary(hourlyWage);
    }

    public  void uploaderSalary(float hourlyWage){
        float salary = 40 * hourlyWage;
        super.setWage(salary);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Incarico='" + jobTitle + '\'';
    }
}
