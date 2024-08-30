package com.cltech.qa.entity.data;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
@Table(name = "branch_manage")
public class BranchManage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "branch")
    private String branch;

    @Column(name = "description")
    private String description;

}
