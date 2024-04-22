package org.example.Entities;
import java.io.Serializable;

public class Plays implements Serializable{
    private int matchCode;
    private int playerId;
    private int starts;
    private int substituted;
    private int goals;
    private int yellow;
    private boolean red;

    public Plays(int matchCode, int playerId, int starts, int substituted, int goals, int yellow, boolean red) {
        this.matchCode = matchCode;
        this.playerId = playerId;
        this.starts = starts;
        this.substituted = substituted;
        this.goals = goals;
        this.yellow = yellow;
        this.red = red;
    }

    public Plays() {
    }

    public int getMatchCode() {
        return matchCode;
    }

    public void setMatchCode(int matchCode) {
        this.matchCode = matchCode;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getStarts() {
        return starts;
    }

    public void setStarts(int starts) {
        this.starts = starts;
    }

    public int getSubstituted() {
        return substituted;
    }

    public void setSubstituted(int substituted) {
        this.substituted = substituted;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getYellow() {
        return yellow;
    }

    public void setYellow(int yellow) {
        this.yellow = yellow;
    }

    public boolean isRed() {
        return red;
    }

    public void setRed(boolean red) {
        this.red = red;
    }

    @Override
    public String toString() {
        return "Plays [matchCode=" + matchCode + ", playerId=" + playerId + ", starts=" + starts + ", substituted=" + substituted
                + ", goals=" + goals + ", yellow=" + yellow + ", red=" + red + "]";
    }
}
