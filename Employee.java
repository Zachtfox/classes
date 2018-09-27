public class Employee {
    String name = "";
    String number = "";
    String shift = "";


    public Employee(String name, String number, String shift) {
        this.name = name;
        this.number = number;
        this.shift = shift;
    }

    public Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
    public String schedule(String name, String number, String shift){
        String Schedule = name + number + shift;
        return Schedule;
    }
}

