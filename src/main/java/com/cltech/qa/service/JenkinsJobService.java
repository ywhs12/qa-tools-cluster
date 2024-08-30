package com.cltech.qa.service;

import com.cltech.qa.entity.data.JenkinsJob;

import java.util.List;

public interface JenkinsJobService {

    public List<JenkinsJob> getJenkinsJob();

    public JenkinsJob insertJenkinsJob(JenkinsJob jenkinsJob);
}
