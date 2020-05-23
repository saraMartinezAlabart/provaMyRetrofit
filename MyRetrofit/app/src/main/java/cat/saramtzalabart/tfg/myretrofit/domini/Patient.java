package cat.saramtzalabart.tfg.myretrofit.domini;

import com.google.gson.annotations.Expose;

import java.util.Date;

public class Patient {
    @Expose
    private String resourceType;
    @Expose
    private Integer id;
    @Expose
    private Identifier identifier;
    @Expose
    private HumanName name;
    @Expose
    private String gender;
    @Expose
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
