package org.javaforge.plusplusbot;

/**
 * TODO
 *
 * @author Jared Klett
 */

public class Giver {

    private String nick;
    private long plusplusTime;
    private int attempts;

    public Giver(String nick, long plusplusTime) {
        this.nick = nick;
        this.plusplusTime = plusplusTime;
        this.attempts = 0;
    }

    public String getNick() {
        return nick;
    }

    public long getPlusplusTime() {
        return plusplusTime;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPlusplusTime(long plusplusTime) {
        this.plusplusTime = plusplusTime;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

} // class Giver
