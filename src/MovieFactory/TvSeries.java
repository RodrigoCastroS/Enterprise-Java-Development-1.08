package MovieFactory;

import java.util.Date;

public class TvSeries extends Video{

    private double seasons;
    private String broadcastedOn;
    private Date releasedOn;

    public TvSeries(String title, String genre, int length, double seasons, String broadcastedOn, Date releasedOn) {
        super(title, genre, length);
        this.seasons = seasons;
        this.broadcastedOn = broadcastedOn;
        this.releasedOn = releasedOn;
    }


    public double getSeasons() {
        return seasons;
    }

    public String getBroadcastedOn() {
        return broadcastedOn;
    }

    public void setSeasons(double seasons) {
        this.seasons = seasons;
    }

    public void setBroadcastedOn(String broadcastedOn) {
        this.broadcastedOn = broadcastedOn;
    }

    @Override
    public Date dateReleased() {
       return this.releasedOn;
    }

    @Override
    public String toString() {
        return "TvSeries{ " +
                super.toString() +
                "seasons=" + seasons +
                ", broadcastedOn='" + broadcastedOn + '\'' +
                ", releasedOn=" + releasedOn +
                " } " ;
    }
}
