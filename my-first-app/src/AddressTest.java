public class AddressTest {
    public static void main(String[] args) {
        Address add = new Address();
        add.houseNumber = 34;

        Address add2 = new Address(33, "Jangpura", "Delhi", 110014);
        System.out.println(add2);
        add2.changePinCode(100241);
        System.out.println(add2);
        System.out.println(add.city);
    }
}
