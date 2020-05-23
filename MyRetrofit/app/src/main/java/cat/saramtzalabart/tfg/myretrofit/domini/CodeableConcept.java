package cat.saramtzalabart.tfg.myretrofit.domini;

import com.google.gson.annotations.Expose;

public class CodeableConcept {
    @Expose
    private Coding coding;
    @Expose
    private String text;

    public CodeableConcept(Coding coding) {
        this.coding = coding;
        this.text = "Document Nacional d'Identitat";
    }

    public Coding getCoding() {
        return coding;
    }

    public String getText() {
        return text;
    }
}
