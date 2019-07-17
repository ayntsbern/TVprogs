package com.tvprog.domain;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.LinkedList;

public class Channel {
    private Integer id;
    private String title;
    private List<TVprogramme> tVprogrammeLinked = new LinkedList<TVprogramme>();

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    static public class TVprogramme {
        private String time;
        private String progTitle;

        public void setProgtitle(String progTitle) {
            this.progTitle = progTitle;
        }

        public String getProgtitle() {
            return progTitle;
        }

        public void setTime(String time) {
            //time.set(Calendar.HOUR_OF_DAY, Integer.parseInt(intTime.toString().substring(0, 1)));
            //time.set(Calendar.MINUTE, Integer.parseInt(intTime.toString().substring(2, 3)));
            this.time = time;
        }

        public String getTime() {
            //time.get(Calendar.HOUR_OF_DAY);
            return time;
        }
    }
}
