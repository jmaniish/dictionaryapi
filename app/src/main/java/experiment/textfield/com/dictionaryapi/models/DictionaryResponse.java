package experiment.textfield.com.dictionaryapi.models;

public class DictionaryResponse {

    public Metadata metadata;

    public Results[] results;

    public DictionaryResponse(Metadata metadata, Results[] results) {
        this.metadata = metadata;
        this.results = results;
    }

    @Override
    public String toString() {
        return "ClassPojo [results = " + results + ", metadata = " + metadata + "]";
    }
}


