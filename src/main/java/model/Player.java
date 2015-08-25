package model;



/**
 * Created by mattcoleman on 8/13/15.
 */
public class Player {

    private String name;
    private String position;
    private String team;
    private int rank;
    private int bye;
    private int bestRank;
    private int worstRank;
    private float averageRank;
    private float standardDeviation;
    private int averageDraftPosition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getBye() {
        return bye;
    }

    public void setBye(int bye) {
        this.bye = bye;
    }

    public int getBestRank() {
        return bestRank;
    }

    public void setBestRank(int bestRank) {
        this.bestRank = bestRank;
    }

    public int getWorstRank() {
        return worstRank;
    }

    public void setWorstRank(int worstRank) {
        this.worstRank = worstRank;
    }

    public float getAverageRank() {
        return averageRank;
    }

    public void setAverageRank(float averageRank) {
        this.averageRank = averageRank;
    }

    public float getStandardDeviation() {
        return standardDeviation;
    }

    public void setStandardDeviation(float standardDeviation) {
        this.standardDeviation = standardDeviation;
    }

    public int getAverageDraftPosition() {
        return averageDraftPosition;
    }

    public void setAverageDraftPosition(int averageDraftPosition) {
        this.averageDraftPosition = averageDraftPosition;
    }
}
