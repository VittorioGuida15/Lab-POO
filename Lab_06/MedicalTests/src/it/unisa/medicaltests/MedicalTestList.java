package it.unisa.medicaltests;

import java.util.*;

public class MedicalTestList {

    private final List<MedicalTest> medicalTestList;

    public MedicalTestList() {
        this.medicalTestList = new ArrayList<>();
    }

    /*Comparator<MedicalTest> date = new Comparator<MedicalTest>() {
        @Override
        public int compare(MedicalTest mt1, MedicalTest mt2) {
            return mt1.getDate().compareTo(mt2.getDate());
        }
    };*/


    public void addMedicalTest(MedicalTest mt) {
        this.medicalTestList.add(mt);
        Collections.sort(medicalTestList);
    }

    public List<MedicalTest> getMedicalTestByDate(GregorianCalendar date) {
        List<MedicalTest> medicalTestsReturn = new ArrayList<>();
        for(MedicalTest mt : this.medicalTestList){
            if(date.equals(mt.getDate()) && mt.getDate() != null)
                medicalTestsReturn.add(mt);
        }
        return  medicalTestsReturn;
    }

    public List<MedicalTest> getMedicalTestByDoctor(String doctorName) {
        List<MedicalTest> medicalTestsReturn = new ArrayList<>();
        for(MedicalTest mt : this.medicalTestList){
            if(mt.getDoctorName().equals(doctorName) && mt.getDoctorName() != null){
                medicalTestsReturn.add(mt);
            }
        }
        return medicalTestsReturn;
    }

    public double getAverageCost() {
        double average = 0;
        for(MedicalTest mt : this.medicalTestList){
            average += mt.getCost();
        }
        return average /= this.medicalTestList.size();
    }

    public List<MedicalTest> getMedicalTestList() {
        return medicalTestList;
    }
}
