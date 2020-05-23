package cat.saramtzalabart.tfg.myretrofit.domini;

import com.google.gson.annotations.Expose;

public class Coding {
    @Expose
    private String code;

    public Coding() {
        this.code = "DNI";
    }

    public String getCode() {
        return code;
    }
}
