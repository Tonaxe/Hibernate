package org.example.Entities;

import java.util.Date;

public class Match {
    private int code;
    private Date played;

    public Match(int code, Date played) {
        this.code = code;
        this.played = played;
    }

    public Match() {
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getPlayed() {
        return played;
    }

    public void setPlayed(Date played) {
        this.played = played;
    }

    @Override
    public String toString() {
        return "Match [code=" + code + ", played=" + played + "]";
    }
}
