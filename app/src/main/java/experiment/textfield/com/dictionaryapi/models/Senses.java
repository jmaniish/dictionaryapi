package experiment.textfield.com.dictionaryapi.models;

public class Senses
{
    private CrossReferences[] crossReferences;

    private Pronunciations[] pronunciations;

    private String[] relatedTo;

    private String parentSense;

    private String[] markers;

    private String[] domains;

    private String[] definitions;

    private String[] regions;

    private String[] closeMatches;

    private String id;

    private String[] registers;

    public Senses() {
    }

    private VariantForms[] variantForms;

    private String[] seeAlso;

    private String[] grammaticalNotes;

    private Examples[] examples;

    public CrossReferences[] getCrossReferences ()
    {
        return crossReferences;
    }

    public void setCrossReferences (CrossReferences[] crossReferences)
    {
        this.crossReferences = crossReferences;
    }

    public Pronunciations[] getPronunciations ()
    {
        return pronunciations;
    }

    public void setPronunciations (Pronunciations[] pronunciations)
    {
        this.pronunciations = pronunciations;
    }

    public String[] getRelatedTo ()
    {
        return relatedTo;
    }

    public void setRelatedTo (String[] relatedTo)
    {
        this.relatedTo = relatedTo;
    }

    public String getParentSense ()
    {
        return parentSense;
    }

    public void setParentSense (String parentSense)
    {
        this.parentSense = parentSense;
    }

    public String[] getMarkers ()
    {
        return markers;
    }

    public void setMarkers (String[] markers)
    {
        this.markers = markers;
    }

    public String[] getDomains ()
    {
        return domains;
    }

    public void setDomains (String[] domains)
    {
        this.domains = domains;
    }

    public String[] getDefinitions ()
    {
        return definitions;
    }

    public void setDefinitions (String[] definitions)
    {
        this.definitions = definitions;
    }

    public String[] getRegions ()
    {
        return regions;
    }

    public void setRegions (String[] regions)
    {
        this.regions = regions;
    }

    public String[] getCloseMatches ()
    {
        return closeMatches;
    }

    public void setCloseMatches (String[] closeMatches)
    {
        this.closeMatches = closeMatches;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String[] getRegisters ()
    {
        return registers;
    }

    public void setRegisters (String[] registers)
    {
        this.registers = registers;
    }

    public VariantForms[] getVariantForms ()
    {
        return variantForms;
    }

    public void setVariantForms (VariantForms[] variantForms)
    {
        this.variantForms = variantForms;
    }

    public String[] getSeeAlso ()
    {
        return seeAlso;
    }

    public void setSeeAlso (String[] seeAlso)
    {
        this.seeAlso = seeAlso;
    }

    public String[] getGrammaticalNotes ()
    {
        return grammaticalNotes;
    }

    public void setGrammaticalNotes (String[] grammaticalNotes)
    {
        this.grammaticalNotes = grammaticalNotes;
    }

    public Examples[] getExamples ()
    {
        return examples;
    }

    public void setExamples (Examples[] examples)
    {
        this.examples = examples;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [crossReferences = "+crossReferences+", pronunciations = "+pronunciations+", relatedTo = "+relatedTo+", parentSense = "+parentSense+", markers = "+markers+", domains = "+domains+", definitions = "+definitions+", regions = "+regions+", closeMatches = "+closeMatches+", id = "+id+", registers = "+registers+", variantForms = "+variantForms+", seeAlso = "+seeAlso+", grammaticalNotes = "+grammaticalNotes+", examples = "+examples+"]";
    }
}

