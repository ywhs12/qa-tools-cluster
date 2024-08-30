package com.cltech.qa.entity.data;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
@Table(name = "jenkins_record")
public class JenkinsRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "status")
    private int status;

    @Column(name = "message")
    private String message;

    @Column(name = "err")
    private String err;

}
