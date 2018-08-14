package recyclerview.materialdesign.interra.com.recyclerview;

public class Pixar {
    private int pixarImage;
    private String pixarName;

    Pixar(int pixarImage, String pixarName) {
        this.pixarImage = pixarImage;
        this.pixarName = pixarName;
    }

    public int getPixarImage() {
        return pixarImage;
    }

    public String getPixarName() {
        return pixarName;
    }

    public void setPixarImage(int pixarImage) {
        this.pixarImage = pixarImage;
    }

    public void setPixarName(String pixarName) {
        this.pixarName = pixarName;
    }
}
