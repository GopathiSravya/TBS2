public class Movie {
    public int movieId;
    public String title;
    public String genre;

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                '}';
    }

    public int duration;
    public Movie(int movieId,String title,String genre){
        this.movieId=movieId;
        this.title=title;
        this.genre=genre;

    }
}