package experiment.textfield.com.dictionaryapi.models;


public class Examples
{
    private String text;

    public String getText ()
    {
        return text;
    }

    public Examples() {
    }

    public void setText (String text)

    {
        this.text = text;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [text = "+text+"]";
    }
}

