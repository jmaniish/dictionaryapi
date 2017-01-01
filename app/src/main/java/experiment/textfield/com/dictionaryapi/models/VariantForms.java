package experiment.textfield.com.dictionaryapi.models;


public class VariantForms
{
    private String text;

    private String[] regions;

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String[] getRegions ()
    {
        return regions;
    }

    public VariantForms() {
    }

    public void setRegions (String[] regions)
    {
        this.regions = regions;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [text = "+text+", regions = "+regions+"]";
    }
}
