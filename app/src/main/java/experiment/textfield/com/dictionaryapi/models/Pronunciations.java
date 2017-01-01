package experiment.textfield.com.dictionaryapi.models;


public class Pronunciations
{
    private String phoneticsNotation;

    private String phoneticsSpelling;

    private String[] regions;

    private String audioFile;

    public Pronunciations() {
    }

    public String getPhoneticsNotation ()
    {
        return phoneticsNotation;
    }

    public void setPhoneticsNotation (String phoneticsNotation)
    {
        this.phoneticsNotation = phoneticsNotation;
    }

    public String getPhoneticsSpelling ()
    {
        return phoneticsSpelling;
    }

    public void setPhoneticsSpelling (String phoneticsSpelling)
    {
        this.phoneticsSpelling = phoneticsSpelling;
    }

    public String[] getRegions ()
    {
        return regions;
    }

    public void setRegions (String[] regions)
    {
        this.regions = regions;
    }

    public String getAudioFile ()
    {
        return audioFile;
    }

    public void setAudioFile (String audioFile)
    {
        this.audioFile = audioFile;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [phoneticsNotation = "+phoneticsNotation+", phoneticsSpelling = "+phoneticsSpelling+", regions = "+regions+", audioFile = "+audioFile+"]";
    }
}
