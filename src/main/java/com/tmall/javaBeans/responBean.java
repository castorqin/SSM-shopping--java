package com.tmall.javaBeans;

import java.io.Serializable;

public class responBean implements Serializable {
    private int stats;
    private  User use;
    public int getStats() {
        return stats;
    }

    public void setStats(int stats) {
        this.stats = stats;
    }
    public User getUse() {
        return use;
    }
    public void setUse(User use) {
        this.use = use;
    }

    @Override
    public String toString() {
        return "responBean{" +
                "stats=" + stats +
                ", use=" + use +
                '}';
    }
}
