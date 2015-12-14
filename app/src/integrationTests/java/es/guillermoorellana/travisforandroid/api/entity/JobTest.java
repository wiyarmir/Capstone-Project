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

package es.guillermoorellana.travisforandroid.api.entity;

import com.google.gson.Gson;

import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;
import org.junit.Test;
import org.junit.runner.RunWith;

import es.guillermoorellana.travisforandroid.TravisDroidRobolectricTestRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(TravisDroidRobolectricTestRunner.class)
public class JobTest {
    private static final String JSON_STRING = "{\n" +
            "      \"id\": 94825893,\n" +
            "      \"repository_id\": 82,\n" +
            "      \"build_id\": 94825892,\n" +
            "      \"commit_id\": 26947606,\n" +
            "      \"log_id\": 67657671,\n" +
            "      \"state\": \"passed\",\n" +
            "      \"number\": \"1059.1\",\n" +
            "      \"config\": {\n" +
            "        \"language\": \"ruby\",\n" +
            "        \"rvm\": \"1.8.7\",\n" +
            "        \"sudo\": false,\n" +
            "        \".result\": \"configured\",\n" +
            "        \"group\": \"stable\",\n" +
            "        \"dist\": \"precise\",\n" +
            "        \"os\": \"linux\"\n" +
            "      },\n" +
            "      \"started_at\": \"2015-12-04T08:54:43Z\",\n" +
            "      \"finished_at\": \"2015-12-04T08:55:00Z\",\n" +
            "      \"queue\": \"builds.docker\",\n" +
            "      \"allow_failure\": false,\n" +
            "      \"tags\": null,\n" +
            "      \"annotation_ids\": []\n" +
            "    }";

    @Test
    public void test_fromJson() {
        Gson gson = TravisDroidRobolectricTestRunner.travisApp().applicationComponent().gson();
        Job job = gson.fromJson(JSON_STRING, Job.class);
        assertThat(job.getId()).isEqualTo(94825893L);
        assertThat(job.getRepositoryId()).isEqualTo(82);
        assertThat(job.getBuildId()).isEqualTo(94825892L);
        assertThat(job.getCommitId()).isEqualTo(26947606L);
        assertThat(job.getLogId()).isEqualTo(67657671L);
        assertThat(job.getState()).isEqualTo("passed");
        assertThat(job.getNumber()).isEqualTo("1059.1");
        assertThat(job.getStartedAt())
                .usingComparator(DateTimeComparator.getInstance())
                .isEqualTo(DateTime.parse("2015-12-04T08:54:43Z"));
        assertThat(job.getFinishedAt())
                .usingComparator(DateTimeComparator.getInstance())
                .isEqualTo(DateTime.parse("2015-12-04T08:55:00Z"));
    }
    
}