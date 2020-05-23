package cat.saramtzalabart.tfg.myretrofit.domini;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Identifier {
    @Expose
    private CodeableConcept type;

    @SerializedName("value")
    @Expose
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
