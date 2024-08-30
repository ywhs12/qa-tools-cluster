package com.cltech.qa.entity.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
@Table(name = "jenkins_job_conflict")
public class JenkinsJobConflict {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "job_id")
    @JsonIgnoreProperties(value = "job")
    private JenkinsJob job;

    @Column(name = "conflict_job_id")
    private int conflictJobId;

}
