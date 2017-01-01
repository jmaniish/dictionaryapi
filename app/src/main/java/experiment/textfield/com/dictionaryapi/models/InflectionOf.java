package experiment.textfield.com.dictionaryapi.models;


public class InflectionOf
{
    private String id;

    private String text;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getText ()
    {
        return text;
    }

    public InflectionOf() {
    }

    public void setText (String text)
    {
        this.text = text;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", text = "+text+"]";
    }
}