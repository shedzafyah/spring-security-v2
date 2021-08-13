package zw.co.fyah.springspec.student;

public class Student {
    private Long id;
    private String firstname;

    public Student(Long id, String firstname) {
        this.id = id;
        this.firstname = firstname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
