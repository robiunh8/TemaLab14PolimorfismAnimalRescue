package AnimalRescue;

public class MedicalStaff {
    private String nameOfVet;
    private String vetSpecialty;

    public String getNameOfVet() {
        return nameOfVet;
    }

    public void setNameOfVet(String nameOfVet) {
        this.nameOfVet = nameOfVet;
    }

    public String getVetSpecialty() {
        return vetSpecialty;
    }

    public void setVetSpecialty(String vetSpecialty) {
        this.vetSpecialty = vetSpecialty;
    }
    public void takescare(){
        System.out.println("The medical staff takes care of the animal");
    }
}
