package HomeWork3;

import java.util.Objects;

public class Adresat {
    String name;
    String familyName;
    String socialStatus;
    String numberOfPhone;

    public Adresat() {}

    public Adresat(String name, String familyName, String socialStatus, String numberOfPhone) {
        this.name = name;
        this.familyName = familyName;
        this.socialStatus = socialStatus;
        this.numberOfPhone = numberOfPhone;
    }

    @Override
    public String toString() {
        return "Adresat{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", socialStatus='" + socialStatus + '\'' +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresat adresat = (Adresat) o;
        return Objects.equals(name, adresat.name) &&
                Objects.equals(familyName, adresat.familyName) &&
                Objects.equals(socialStatus, adresat.socialStatus) &&
                Objects.equals(numberOfPhone, adresat.numberOfPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, familyName, socialStatus, numberOfPhone);
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
}

