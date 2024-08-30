package com.cltech.qa.entity.data;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Entity
@ToString
@Table(name = "jenkins_server")
public class JenkinsServer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ip")
    private String ip;

    @Column(name = "port")
    private int port;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "available")
    private boolean available;

    @Column(name = "update_time")
    private long updateTime;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "jenkins_id")
    private List<DeployServer> deployServers;

}
