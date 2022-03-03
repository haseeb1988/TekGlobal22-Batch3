package ArrayListDemo;

public class Teacher {
    private int tid;
    private String tname;
    private int tage;

    public Teacher(int tid, String tname, int tage) {
        this.tid = tid;
        this.tname = tname;
        this.tage = tage;
    }

    public Teacher() {
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getTage() {
        return tage;
    }

    public void setTage(int tage) {
        this.tage = tage;
    }
}
