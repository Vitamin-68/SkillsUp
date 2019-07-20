package HomeWork3;

import java.util.Objects;

public class Addressee {
    private String name;
    private String familyName;
    private String socialStatus;
    private String numberOfPhone;

    public Addressee() {}

    public Addressee(String name, String familyName, String socialStatus, String numberOfPhone) {
        this.name = name;
        this.familyName = familyName;
        this.socialStatus = socialStatus;
        this.numberOfPhone = numberOfPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getSocialStatus() {
        return socialStatus;
    }

    public void setSocialStatus(String socialStatus) {
        this.socialStatus = socialStatus;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }

    public void setNumberOfPhone(String numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Addressee addressee = (Addressee) o;
        return Objects.equals(name, addressee.name) &&
                Objects.equals(familyName, addressee.familyName) &&
                Objects.equals(socialStatus, addressee.socialStatus) &&
                Objects.equals(numberOfPhone, addressee.numberOfPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, familyName, socialStatus, numberOfPhone);
    }

    @Override
    public String toString() {
        return "Addressee{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", socialStatus='" + socialStatus + '\'' +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                '}';
    }
}

