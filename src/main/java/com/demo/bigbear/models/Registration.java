package com.demo.bigbear.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "conf_registration")
@NamedQueries({
        @NamedQuery(
                name = Registration.REGISTRATION_REPORT,
                query = Registration.REGISTRATION_REPORT_JPQL
        )
})
public class Registration {

    public static final String REGISTRATION_REPORT = "registrationReport";

    public static final String REGISTRATION_REPORT_JPQL =
            "SELECT new com.demo.bigbear.models.RegistrationReport " +
            "(R.name, R.description, C.name, C.description, C.totalHours) " +
            "FROM Registration R, Course C " +
            "WHERE R.id = C.registration.id";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "user_id")
    private Long userId;

    @JsonManagedReference
    @OneToMany(mappedBy = "registration", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Course> courses = new ArrayList<Course>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
