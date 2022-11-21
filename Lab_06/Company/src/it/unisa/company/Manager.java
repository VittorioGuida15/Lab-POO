package it.unisa.company;

public class Manager extends Employee {

    private String expertiseArea;
    private int workedHours;

    public Manager(String name, String lastName, String jobTitle, float hourlyWage, String expertiseArea){
        super(name,lastName,jobTitle, hourlyWage);
        this.uploaderSalary(hourlyWage, workedHours);
        this.setExpertiseArea(expertiseArea);
    }

    public String getExpertiseArea() {
        return expertiseArea;
    }

    public void setExpertiseArea(String expertiseArea) {
        this.expertiseArea = expertiseArea;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
        this.uploaderSalary(this.getHourlyWage(), workedHours);
    }

    @Override
    public void setHourlyWage(float hourlyWage) {
        super.setHourlyWage(hourlyWage);
        uploaderSalary(hourlyWage, this.workedHours);
    }


    public void uploaderSalary(float hourlyWage, int workedHours) {
        if(workedHours <= 40){
            this.setWage(hourlyWage * workedHours);
        }
        else{
            super.uploaderSalary(hourlyWage);
            float wage = this.getWage();
            int extraHours = workedHours - 40;
            wage += extraHours * hourlyWage * 1.5;
            this.setWage(wage);
        }


    }

    @Override
    public String toString() {
        return super.toString() +
                ", Area di competenza='" + expertiseArea + '\'';
    }
}
