package recyclerview.materialdesign.interra.com.recyclerview;

public class StarWars  {
    public static final int FIRST_TYPE = 0;
    public static final int SECOND_TYPE = 1;

    private String mName;
    private String mAffiliations;
    private String mSpecies;
    private int mImage;
    private int type;

    public StarWars(String name, String affiliations, String species, int image, int type) {
        mName = name;
        mAffiliations = affiliations;
        mSpecies = species;
        mImage = image;
        this.type = type;
    }

    public int getType () {
        return type;
    }

    public String getmName() {
        return mName;
    }

    public String getmAffiliations() {
        return mAffiliations;
    }

    public String getmSpecies() {
        return mSpecies;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmAffiliations(String mAffiliations) {
        this.mAffiliations = mAffiliations;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmSpecies(String mSpecies) {
        this.mSpecies = mSpecies;
    }
}
