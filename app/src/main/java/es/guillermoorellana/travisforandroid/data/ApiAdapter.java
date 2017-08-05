package es.guillermoorellana.travisforandroid.data;

import es.guillermoorellana.travisforandroid.model.BuildBuilder;
import es.guillermoorellana.travisforandroid.model.CommitBuilder;
import es.guillermoorellana.travisforandroid.model.GHCommit;
import es.guillermoorellana.travisforandroid.model.RepoBuilder;
import es.guillermoorellana.travisforandroid.services.network.model.entity.Build;
import es.guillermoorellana.travisforandroid.services.network.model.entity.Commit;
import es.guillermoorellana.travisforandroid.services.network.model.entity.Repo;

public final class ApiAdapter {
    private ApiAdapter() {
        // util class
    }

    public static es.guillermoorellana.travisforandroid.model.Repo fromApi(Repo repo) {
        return new RepoBuilder()
                .setId(repo.getId())
                .setSlug(repo.getSlug())
                .setActive(repo.isActive())
                .setDescription(repo.getDescription())
                .setLastBuildId(repo.getLastBuildId())
                .setLastBuildState(repo.getLastBuildState())
                .setLastBuildDuration(repo.getLastBuildDuration())
                .setLastBuildLanguage(repo.getLastBuildLanguage())
                .setLastBuildNumber(repo.getLastBuildNumber())
                .setLastBuildStartedAt(repo.getLastBuildStartedAt().getTime())
                .setLastBuildFinishedAt(repo.getLastBuildFinishedAt().getTime())
                .setGithubLanguage(repo.getGithubLanguage())
                .createRepo();
    }

    public static es.guillermoorellana.travisforandroid.model.Build fromApi(Build build) {
        return new BuildBuilder().setCommitId(build.getCommitId())
                .setDuration(build.getDuration())
                .setFinishedAt(build.getFinishedAt().getTime())
                .setId(build.getId())
                .setNumber(build.getNumber())
                .setPullRequest(build.isPullRequest())
                .setPullRequestNumber(build.getPullRequestNumber())
                .setPullRequestTitle(build.getPullRequestTitle())
                .setRepositoryId(build.getRepositoryId())
                .setStartedAt(build.getStartedAt().getTime())
                .setState(build.getState())
                .createBuild();
    }

    public static GHCommit fromApi(Commit commit) {
        return new CommitBuilder()
                .setCommitId(commit.getId())
                .setAuthorEmail(commit.getAuthorEmail())
                .setAuthorName(commit.getAuthorName())
                .setBranch(commit.getBranch())
                .setCommittedAt(commit.getCommittedAt().getTime())
                .setCommitterEmail(commit.getCommitterEmail())
                .setCommitterName(commit.getCommitterName())
                .setMessage(commit.getMessage())
                .setPullRequestNumber(commit.getPullRequestNumber())
                .setCompareUrl(commit.getCompareUrl())
                .setSha(commit.getSha())
                .createCommit();
    }
}
