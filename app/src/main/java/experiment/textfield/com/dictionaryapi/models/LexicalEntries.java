package experiment.textfield.com.dictionaryapi.models;

public class LexicalEntries
{
    private Pronunciations[] pronunciations;

    private String text;

    private Inflections[] inflections;

    private GrammaticalFeatures[] grammaticalFeatures;

    private VariantForms[] variantForms;

    private Entries[] entries;

    public LexicalEntries() {
    }

    private String[] grammaticalNotes;

    private String language;

    private String lexicalCategory;

    private InflectionOf[] inflectionOf;

    public Pronunciations[] getPronunciations ()
    {
        return pronunciations;
    }

    public void setPronunciations (Pronunciations[] pronunciations)
    {
        this.pronunciations = pronunciations;
    }

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public Inflections[] getInflections ()
    {
        return inflections;
    }

    public void setInflections (Inflections[] inflections)
    {
        this.inflections = inflections;
    }

    public GrammaticalFeatures[] getGrammaticalFeatures ()
    {
        return grammaticalFeatures;
    }

    public void setGrammaticalFeatures (GrammaticalFeatures[] grammaticalFeatures)
    {
        this.grammaticalFeatures = grammaticalFeatures;
    }

    public VariantForms[] getVariantForms ()
    {
        return variantForms;
    }

    public void setVariantForms (VariantForms[] variantForms)
    {
        this.variantForms = variantForms;
    }

    public Entries[] getEntries ()
    {
        return entries;
    }

    public void setEntries (Entries[] entries)
    {
        this.entries = entries;
    }

    public String[] getGrammaticalNotes ()
    {
        return grammaticalNotes;
    }

    public void setGrammaticalNotes (String[] grammaticalNotes)
    {
        this.grammaticalNotes = grammaticalNotes;
    }

    public String getLanguage ()
    {
        return language;
    }

    public void setLanguage (String language)
    {
        this.language = language;
    }

    public String getLexicalCategory ()
    {
        return lexicalCategory;
    }

    public void setLexicalCategory (String lexicalCategory)
    {
        this.lexicalCategory = lexicalCategory;
    }

    public InflectionOf[] getInflectionOf ()
    {
        return inflectionOf;
    }

    public void setInflectionOf (InflectionOf[] inflectionOf)
    {
        this.inflectionOf = inflectionOf;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pronunciations = "+pronunciations+", text = "+text+", inflections = "+inflections+", grammaticalFeatures = "+grammaticalFeatures+", variantForms = "+variantForms+", entries = "+entries+", grammaticalNotes = "+grammaticalNotes+", language = "+language+", lexicalCategory = "+lexicalCategory+", inflectionOf = "+inflectionOf+"]";
    }
}