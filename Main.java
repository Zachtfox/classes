public class Main {

    public static void main(String[] args) {

        Employee manager = new Employee();

        manager.setName("Jodine ");
        manager.setNumber("1448928 ");
        manager.setShift(" 6pm to 12am ");



        Employee scot = new Employee();

        scot.setName("Zach");
        scot.setNumber("1463662");
        scot.setShift("4pm to 11pm");



        Employee cashier = new Employee();

        cashier.setName("Mikey");
        cashier.setNumber("1463549");
        cashier.setShift("12noon to 8pm");


        System.out.println("Schedule:");
        System.out.println(manager.schedule("Jodine ", "1448928 ","6pm to 12am "));
        System.out.println(scot.schedule("Zach ","1463662 ", "4pm to 11pm "));
        System.out.println(cashier.schedule("Mikey ", "1463549 ", "12noon to 8pm"));



    }
}
