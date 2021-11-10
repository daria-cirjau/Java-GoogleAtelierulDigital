package Lab3.Builder;

public class Main {
    public static void main(String[] args) {
        Computer.Builder builder = new Computer.Builder("Intel I9");
        builder.setBluetooth(true);
        builder.setMemory(200);
        builder.setRam(3000);
        builder.setVideo("Nvidia");

        Computer myComputer=builder.build();
        System.out.println(myComputer); //afiseaza path-ul catre computer si adresa de memorie =>trb sa suprascriem
        //toString care este metoda de afisare

    }
}
