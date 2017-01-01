package experiment.textfield.com.dictionaryapi.models;
public class Entries
{
    private Pronunciations[] pronunciations;

    private GrammaticalFeatures[] grammaticalFeatures;

    private String[] etymologies;

    private String[] editorialNotes;

    private VariantForms[] variantForms;

    private Senses[] senses;

    public Entries() {
    }

    private String homographNumber;

    public Pronunciations[] getPronunciations ()
    {
        return pronunciations;
    }

    public void setPronunciations (Pronunciations[] pronunciations)
    {
        this.pronunciations = pronunciations;
    }

    public GrammaticalFeatures[] getGrammaticalFeatures ()
    {
        return grammaticalFeatures;
    }

    public void setGrammaticalFeatures (GrammaticalFeatures[] grammaticalFeatures)
    {
        this.grammaticalFeatures = grammaticalFeatures;
    }

    public String[] getEtymologies ()
    {
        return etymologies;
    }

    public void setEtymologies (String[] etymologies)
    {
        this.etymologies = etymologies;
    }

    public String[] getEditorialNotes ()
    {
        return editorialNotes;
    }

    public void setEditorialNotes (String[] editorialNotes)
    {
        this.editorialNotes = editorialNotes;
    }

    public VariantForms[] getVariantForms ()
    {
        return variantForms;
    }

    public void setVariantForms (VariantForms[] variantForms)
    {
        this.variantForms = variantForms;
    }

    public Senses[] getSenses ()
    {
        return senses;
    }

    public void setSenses (Senses[] senses)
    {
        this.senses = senses;
    }

    public String getHomographNumber ()
    {
        return homographNumber;
    }

    public void setHomographNumber (String homographNumber)
    {
        this.homographNumber = homographNumber;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pronunciations = "+pronunciations+", grammaticalFeatures = "+grammaticalFeatures+", etymologies = "+etymologies+", editorialNotes = "+editorialNotes+", variantForms = "+variantForms+", senses = "+senses+", homographNumber = "+homographNumber+"]";
    }
}
