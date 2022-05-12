public class Worker extends Person{
    String puesto;
    String experience;
    public Worker(String name, String height, String puesto, String experience) {
        super(name, height);
        this.experience = experience;
        this.puesto = puesto;

    }
    public String getPuesto() {
        return puesto;
    }
    public String getExperience() {

        return experience;
    }
}
