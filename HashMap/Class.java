import java.time.LocalTime;

class Class {
    private String classCode;
    private String subjectName;
    private LocalTime time;

    public Class(String classCode, String subjectName, LocalTime time) {
        this.classCode = classCode;
        this.subjectName = subjectName;
        this.time = time;
    }

    public String getClassCode() {
        return classCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public LocalTime getTime() {
        return time;
    }


    @Override
    public String toString() {
        return "Class Code: " + classCode + ", Subject: " + subjectName + ", Time: " + time;
    }
}

