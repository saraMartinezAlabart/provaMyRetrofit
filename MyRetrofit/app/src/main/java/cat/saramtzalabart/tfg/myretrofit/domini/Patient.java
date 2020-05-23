package cat.saramtzalabart.tfg.myretrofit.domini;

import java.util.Date;

public class Patient {
    private String resourceType;
    private Integer id;
    private Identifier identifier;
    private HumanName name;
    private String gender;
    private Date birthDate;

    public Patient(Identifier identifier, HumanName name, String gender, Date birthDate) {
        this.resourceType = "Patient";
        this.identifier = identifier;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getResourceType() {
        return resourceType;
    }

    public Integer getId() {
        return id;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public HumanName getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
