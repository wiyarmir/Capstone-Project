/*
 * Copyright 2015 Guillermo Orellana Ruiz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package es.guillermoorellana.travisforandroid.services.network.model.entity;

import java.util.List;

import static java.util.Collections.emptyList;

public class BuildHistory {
    @SuppressWarnings("PMD.ImmutableField")
    private List<Build> builds = emptyList();
    @SuppressWarnings("PMD.ImmutableField")
    private List<Commit> commits = emptyList();

    public List<Build> getBuilds() {
        return builds;
    }

    public List<Commit> getCommits() {
        return commits;
    }
}
