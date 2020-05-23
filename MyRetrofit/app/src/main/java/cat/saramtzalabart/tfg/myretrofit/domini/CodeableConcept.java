package cat.saramtzalabart.tfg.myretrofit.domini;

public class CodeableConcept {
    private Coding coding;
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
