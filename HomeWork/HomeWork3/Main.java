package HomeWork3;

public class Main {
    public static void main(String[] args) {

        Addressee addressee1 = new Addressee();
        Addressee addressee2 = new Addressee("Alex", "Ivanov", "Programmer", "+38067-123-45-67");

        System.out.println("\nObject addressee1:");
        System.out.println(addressee1.toString());
        System.out.println("\nObject addressee2:");
        System.out.println(addressee2.toString());
        outFieldToScreen(addressee2);

        addressee1.setName("Jonn");
        addressee1.setFamilyName("Tailor");
        addressee1.setSocialStatus("Unemployed");
        addressee1.setNumberOfPhone("+38050-987-65-43");

        System.out.println("\nObject addressee1 with new fields");
        System.out.println(addressee1);
        outFieldToScreen(addressee1);

    }
    public static void outFieldToScreen(Addressee addressee) {
        System.out.println("Name: " + addressee.getName());
        System.out.println("Family name: " + addressee.getFamilyName());
        System.out.println("Social status: " + addressee.getSocialStatus());
        System.out.println("Phone number: " + addressee.getNumberOfPhone());

    }
}

