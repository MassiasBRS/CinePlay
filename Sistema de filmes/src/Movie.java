import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("Title")
    private String movieName;
    @SerializedName("Year")
    private String yearRelease;
    @SerializedName("Runtime")
    private String durationMovie;
    @SerializedName("Genre")
    private String GenreMovie;


    public Movie(String movieName, String yearRelease, String timeMovie, String GenreMovie) {
        this.movieName = movieName;
        this.yearRelease = yearRelease;
        this.durationMovie = timeMovie;
        this.GenreMovie = GenreMovie;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getYearRelease() {
        return yearRelease;
    }

    public String getDurationMovie() {
        return durationMovie;
    }


    public String getGenreMovie() {
        return GenreMovie;
    }

    @Override
    public String toString() {
        return "= = = = Movie information = = = = " + "\nMovie:" + getMovieName() + "\nYear Released:" + getYearRelease() + "\nDuration:" + getDurationMovie() + "\nGenre:" +getGenreMovie();
    }
}
