package HomeWork3;

public class Main {
    public static void main(String[] args) {

        Adresat adresat1 = new Adresat();
        Adresat adresat2 = new Adresat("Alex", "Ivanov", "Programmer", "+38067-123-45-67");

        System.out.println("\nObject adresat1:");
        System.out.println(adresat1.toString());
        System.out.println("\nObject adresat2:");
        System.out.println(adresat2.toString());
        outFieldToScreen(adresat2);

        adresat1.setName("Jonn");
        adresat1.setFamilyName("Tailor");
        adresat1.setSocialStatus("Unemployed");
        adresat1.setNumberOfPhone("+38050-987-65-43");

        System.out.println("\nObject adresat1 with new fields");
        System.out.println(adresat1.toString());
//         Запись этой же строки без метода toString() дает тот же результат,
//         можно обойтись без добавления этого метода? Он добавляется по умолчанию при выводе?
        outFieldToScreen(adresat1);

    }
    public static void outFieldToScreen(Adresat adresat) {
        System.out.println("Name: " + adresat.name);
        System.out.println("Family name: " + adresat.familyName);
        System.out.println("Social status: " + adresat.socialStatus);
        System.out.println("Phone number: " + adresat.numberOfPhone);

    }
}

