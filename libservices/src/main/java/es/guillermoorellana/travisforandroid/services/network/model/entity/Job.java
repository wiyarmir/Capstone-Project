
package es.guillermoorellana.travisforandroid.services.network.model.entity;

import java.util.Date;

public class Job {
    private long id;

    private long repositoryId;

    private long buildId;

    private long commitId;

    private long logId;

    private String state;

    private String number;

    private Date startedAt;

    private Date finishedAt;

    private long duration;

    private String queue;

    private boolean allowFailure;

    public long getId() {
        return id;
    }

    public long getRepositoryId() {
        return repositoryId;
    }

    public long getBuildId() {
        return buildId;
    }

    public long getCommitId() {
        return commitId;
    }

    public long getLogId() {
        return logId;
    }

    public String getState() {
        return state;
    }

    public String getNumber() {
        return number;
    }

    public Date getStartedAt() {
        return new Date(startedAt.getTime());
    }

    public Date getFinishedAt() {
        return new Date(finishedAt.getTime());
    }

    public long getDuration() {
        return duration;
    }

    public String getQueue() {
        return queue;
    }

    public boolean isAllowFailure() {
        return allowFailure;
    }
}
