package com.marklogic.hub.job;

import com.marklogic.client.pojo.annotation.Id;
import com.marklogic.hub.flow.Flow;

import java.util.Date;

public class Job {
    private String jobId;
    private String flowType;
    private String flowName;
    private String entityName;
    private String jobName;
    private Date startTime;
    private Date endTime;
    private String jobOutput;
    private JobStatus status = JobStatus.STARTED;

    private long successfulEvents = 0;
    private long failedEvents = 0;
    private long successfulBatches = 0;
    private long failedBatches = 0;

    private Job() {
        this.startTime = new Date();
    }

    public Job withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public static Job withFlow(Flow flow) {
        Job job = new Job();
        job.flowType = flow.getType().toString();
        job.flowName = flow.getName();
        job.entityName = flow.getEntityName();
        return job;
    }

    public Job withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    public Job withJobOutput(String jobOutput) {
        this.jobOutput = jobOutput;
        return this;
    }

    public Job withStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public Job withEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Job withStatus(JobStatus status) {
        this.status = status;
        return this;
    }

    public Job setCounts(long successfulEvents, long failedEvents, long successfulBatches, long failedBatches) {
        this.successfulEvents = successfulEvents;
        this.failedEvents = failedEvents;
        this.successfulBatches = successfulBatches;
        this.failedBatches = failedBatches;
        return this;
    }

    @Id
    public String getJobId() {
        return jobId;
    }

    public String getFlowType() {
        return flowType;
    }

    public String getFlowName() {
        return flowName;
    }

    public String getEntityName() {
        return entityName;
    }

    public String getJobName() {
        return jobName;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public JobStatus getStatus() {
        return status;
    }

    public String getJobOutput() {
        return jobOutput;
    }

    public long getSuccessfulEvents() {
        return successfulEvents;
    }

    public long getFailedEvents() {
        return failedEvents;
    }

    public long getSuccessfulBatches() {
        return successfulBatches;
    }

    public long getFailedBatches() {
        return failedBatches;
    }
}
