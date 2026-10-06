public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("City Pharmacy", "Roorkee");
        Pharmacy p2 = new Pharmacy("Health Plus", "Haridwar");
        Pharmacy p3 = new Pharmacy("MediCare", "Dehradun");
        p1.displayPharmacy();
        p2.displayPharmacy();
        p3.displayPharmacy();
        p1.displayPharmacyCount();
    }
}
class Pharmacy {
    String pharmacyName, location;
    static int pharmacyCount;
    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }
    void displayPharmacy() {
        System.out.println(pharmacyName + " | " + location);
    }
    void displayPharmacyCount() {
        System.out.println("Total Pharmacies: " + pharmacyCount);
    }
}
