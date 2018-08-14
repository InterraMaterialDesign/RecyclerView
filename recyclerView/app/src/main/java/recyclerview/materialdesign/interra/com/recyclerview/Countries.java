package recyclerview.materialdesign.interra.com.recyclerview;

public class Countries {
    private String mCountry;
    private String mCapital;
    private String mDescription;

    Countries(String mCountry, String mCapital, String mDescription) {
        this.mCountry = mCountry;
        this.mCapital = mCapital;
        this.mDescription = mDescription;
    }

    public String getmCountry() {
        return mCountry;
    }

    public String getmCapital() {
        return mCapital;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmCountry(String mCountry) {
        this.mCountry = mCountry;
    }

    public void setmCapital(String mCapital) {
        this.mCapital = mCapital;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
