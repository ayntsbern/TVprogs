package com.tvprog.domain;

import java.util.*;

public class Channel {
    private Integer id;
    private String title;
    private List<TVprogramme> tVprogrammeLinked = new LinkedList<>();

    public Channel(Integer id, String title){
        this.id = id;
        this.title = title;
    }
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

    public void setProgramme (Integer id, String time, String progTitle){
        TVprogramme prog1 = new TVprogramme();
        prog1.setId(id);
        prog1.setTime(time);
        prog1.setProgtitle(progTitle);
        tVprogrammeLinked.add(prog1);
        Collections.sort(tVprogrammeLinked);
    }
    public void setProgramme (String time, String progTitle){
        TVprogramme prog1 = new TVprogramme();
        Integer id = tVprogrammeLinked.size();
        prog1.setId(id);
        prog1.setTime(time);
        prog1.setProgtitle(progTitle);
        tVprogrammeLinked.add(prog1);
        Collections.sort(tVprogrammeLinked);
    }

    public List<TVprogramme> getProgramme(){
        return tVprogrammeLinked;
    }

    static public class TVprogramme implements Comparable< TVprogramme >{

        private Integer id;
        private String time;
        private String progTitle;

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getId() {
            return id;
        }

        public void setProgtitle(String progTitle) {
            this.progTitle = progTitle;
        }

        public String getProgtitle() {
            return progTitle;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTime() {
            return time;
        }

        @Override
        public int compareTo(TVprogramme o) {
            String[] timeS = this.getTime().split(":");
            String newTimeS = "";
            for (int i=0; i < timeS.length; i++) newTimeS += timeS[i];
            Integer time = Integer.parseInt(newTimeS);

            String[] timeS2 = o.getTime().split(":");
            String newTimeS2 = "";
            for (int i=0; i < timeS2.length; i++) newTimeS2 += timeS2[i];
            Integer time2 = Integer.parseInt(newTimeS2);
            return time.compareTo(time2);
        }
    }
}
