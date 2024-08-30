package com.cltech.qa.service;

import com.cltech.qa.entity.data.JenkinsJob;
import com.cltech.qa.repository.JenkinsJobRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class JenkinsJobServiceImpl implements JenkinsJobService {

    private final JenkinsJobRepository jenkinsJobRepository;

    @Override
    public List<JenkinsJob> getJenkinsJob() {
        return jenkinsJobRepository.findAll();
    }

    @Override
    public JenkinsJob insertJenkinsJob(JenkinsJob jenkinsJob) {
        jenkinsJob.setUpdateTime(System.currentTimeMillis());
        return jenkinsJobRepository.save(jenkinsJob);
    }
}
