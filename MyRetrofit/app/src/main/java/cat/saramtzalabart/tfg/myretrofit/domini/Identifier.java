package cat.saramtzalabart.tfg.myretrofit.domini;

import com.google.gson.annotations.SerializedName;

public class Identifier {
    private CodeableConcept type;

    @SerializedName("value")
    private String dni;

    public Identifier(CodeableConcept type, String dni) {
        this.type = type;
        this.dni = dni;
    }

    public CodeableConcept getType() {
        return type;
    }

    public String getDni() {
        return dni;
    }
}
