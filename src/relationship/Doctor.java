package relationship;

class Doctor {
    String name;

    public Doctor(String name) {
        this.name = name;
    }
}

class Hospital {
    String hospitalName;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void assignDoctor(Doctor doctor) {
        System.out.println(doctor.name + " is assigned to " + this.hospitalName);
    }
}
