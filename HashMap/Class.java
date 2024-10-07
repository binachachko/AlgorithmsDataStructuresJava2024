import java.time.LocalDateTime;

class Class {
    private final String classCode;
    private final String subjectName;
    private final LocalDateTime time;

    public Class(String classCode, String subjectName, LocalDateTime time) {
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

    public LocalDateTime getTime() {
        return time;
    }


    @Override
    public String toString() {
        return "Class Code: " + classCode + ", Subject: " + subjectName + ", Time: " + time;
    }
}

