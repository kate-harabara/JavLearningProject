package md.teckwillacademy.methodstask;

public class ExecutionService {
    public static void main(String[] args) {

        Customer marcelCustomer = new Customer();
        marcelCustomer.setId(DataGeneratorUtil.generateRandomInt(999999));
        marcelCustomer.setName("Marcel");
        marcelCustomer.setAge(DataGeneratorUtil.generateRandomInt(115));
        marcelCustomer.setAddress("Str. Petricani 100");

        Customer ionelCustomer = new Customer(990, "Ionel Bujorel" , "Str. Bucuriei 45");
        ionelCustomer.setId(DataGeneratorUtil.generateRandomInt(9999999));
        ionelCustomer.setName("Ionel Istrati");
        ionelCustomer.setAge(DataGeneratorUtil.generateRandomInt(115));
        ionelCustomer.setAddress("Str. bucuriei 45");


        System.out.println(marcelCustomer.getId());
        System.out.println(ionelCustomer.getId());
        System.out.println(ionelCustomer.getAge());

        System.out.println(DataGeneratorUtil.generateRandomInt(60));
        System.out.println(DataGeneratorUtil.generateRandomInt(25));
        System.out.println(DataGeneratorUtil.generateRandomInt(11,10));
        System.out.println(DataGeneratorUtil.returnRandomString("gmail.com"));
        System.out.println(DataGeneratorUtil.returnRandomString());

    }
}
