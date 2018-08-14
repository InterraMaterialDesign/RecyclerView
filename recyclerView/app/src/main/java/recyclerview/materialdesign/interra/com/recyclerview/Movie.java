package recyclerview.materialdesign.interra.com.recyclerview;

public class Movie {
    private int movieImage;
    private String movieName;
    private String movieRate;

    Movie(int movieImage, String movieName, String movieRate) {
        this.movieImage = movieImage;
        this.movieName = movieName;
        this.movieRate = movieRate;
    }

    public int getMovieImage() {
        return movieImage;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieRate() {
        return movieRate;
    }

    public void setMovieImage(int movieImage) {
        this.movieImage = movieImage;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieRate(String movieRate) {
        this.movieRate = movieRate;
    }
}
