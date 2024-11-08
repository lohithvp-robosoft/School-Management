public class Assignment {
    //    studentName;
    String title;
    boolean isCompleted;
    String format;


    public String getTitle() {

        return title;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean bool) {
        this.isCompleted = bool;
    }

    Assignment(String title) {
//        this.studentName = studentName;
        this.title = title;
        isCompleted = false;
    }


}
