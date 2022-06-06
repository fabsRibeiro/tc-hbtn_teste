

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {

    private static String name;
    private static String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;

    private static float salary;

    public static String fullname() {
        return String.format(name + " " + surname);
    }

    public static double calculateYearlySalary(double salario){
        return salario * 12;
    }

    public boolean isMEI(){

        if(calculateYearlySalary(getSalary()) < 130000 && calcularIdade(birthDate) > 18 &&
                !anotherCompanyOwner && !pensioner && !publicServer){
            return true;
        }
        return false;
    }

    private int calcularIdade(Date dataNascimento){
        Calendar dataNasc = new GregorianCalendar();
        Calendar hoje = Calendar.getInstance();
        dataNasc.setTime(dataNascimento);

        return hoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
