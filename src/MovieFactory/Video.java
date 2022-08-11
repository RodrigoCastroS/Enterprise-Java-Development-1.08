package MovieFactory;

import java.util.Date;

public abstract class Video {
    private String title;
    private String genre;
    private int length;

    public Video(String title, String genre, int length) {
        this.title = title;
        this.genre = genre;
        this.length = length;
    }

    public abstract Date dateReleased();

    @Override
    public String toString() {
        return " Title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", length=" + length;
    }
}
