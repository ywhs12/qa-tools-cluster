package com.cltech.qa.entity.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.lang.Nullable;

import java.util.List;

@Data
@Entity
@ToString
@Table(name = "jenkins_job")
public class JenkinsJob {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "folder")
    private String folder;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "is_enabled")
    private Boolean enable;

    @Column(name = "description")
    @Nullable
    private String description;

    @Column(name = "update_time")
    @Nullable
    private Long updateTime;

    @OneToMany(mappedBy = "job")
    @JsonIgnoreProperties(value = "job")
    private List<JenkinsJobBranch> branchList;

    @OneToMany(mappedBy = "job")
    @JsonIgnoreProperties(value = "job")
    private List<JenkinsJobConflict> conflictList;

}
