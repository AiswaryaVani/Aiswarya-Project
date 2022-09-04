package com.example.mywebapp.user;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer request_id;
    @Column(length = 200)
    private String request_title;
    @Column(length = 1000)
    private String request_desc;
    @Column(length = 200)
    private String created_by;
    @Column(length = 200)
    private String created_on;

    public Integer getRequest_id() {
        return request_id;
    }

    public void setRequest_id(Integer request_id) {
        this.request_id = request_id;
    }

    public String getRequest_title() {
        return request_title;
    }

    public void setRequest_title(String request_title) {
        this.request_title = request_title;
    }

    public String getRequest_desc() {
        return request_desc;
    }

    public void setRequest_desc(String request_desc) {
        this.request_desc = request_desc;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }
}
