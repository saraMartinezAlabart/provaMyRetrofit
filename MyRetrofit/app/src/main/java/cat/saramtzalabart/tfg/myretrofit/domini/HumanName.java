package cat.saramtzalabart.tfg.myretrofit.domini;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HumanName {
    @SerializedName("family")
    @Expose
    private String surname;

    @SerializedName("given")
    @Expose
    private String name;

    public HumanName(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
}
