package experiment.textfield.com.dictionaryapi.models;


public class CrossReferences
{
    private String id;

    private String text;

    private String type;

    private String sense_id;

    public CrossReferences() {
    }

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

    public void setText (String text)
    {
        this.text = text;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getSense_id ()
    {
        return sense_id;
    }

    public void setSense_id (String sense_id)
    {
        this.sense_id = sense_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", text = "+text+", type = "+type+", sense_id = "+sense_id+"]";
    }
}
