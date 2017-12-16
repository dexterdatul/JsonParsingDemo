package dexterdatul.com.jsonparsingdemo.dexterdatul.com.jsonparsingdemo.models;

import java.util.List;

/**
 * Created by Dexter John Datul on 16/12/2017.
 */

public class MovieModel {

    private String movie;
    private int year;
    private float rating;
    private String duration;
    private String director;
    private String tagline;
    private List<Cast>castLists;
    private String image;
    private String story;

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public List<Cast> getCastLists() {
        return castLists;
    }

    public void setCastLists(List<Cast> castLists) {
        this.castLists = castLists;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public static class Cast{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
