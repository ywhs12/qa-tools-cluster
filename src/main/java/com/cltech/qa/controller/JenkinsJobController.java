package com.cltech.qa.controller;

import com.cltech.qa.entity.data.JenkinsJob;
import com.cltech.qa.service.JenkinsJobService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/api/qa")
public class JenkinsJobController {

    private final JenkinsJobService jenkinsJobService;

    @RequestMapping(value = "getJenkinsJob", method = RequestMethod.GET)
    public List<JenkinsJob> getJenkinsJob() {
        return jenkinsJobService.getJenkinsJob();
    }

    @RequestMapping(value = "insertJenkinsJob", method = RequestMethod.POST)
    public JenkinsJob insertJenkinsJob(@RequestBody JenkinsJob jenkinsJob) {
        return jenkinsJobService.insertJenkinsJob(jenkinsJob);
    }

}
