package com.cltech.qa.entity.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;


@Data
@Entity
@ToString
@Table(name = "jenkins_job_branch")
public class JenkinsJobBranch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

//    @Column(name = "job_id")
//    private int jobId;

    @ManyToOne
    @JoinColumn(name = "job_id")
    @JsonIgnoreProperties(value = "job")
    private JenkinsJob job;

    @Column(name = "branch_id")
    private int branchId;

}
