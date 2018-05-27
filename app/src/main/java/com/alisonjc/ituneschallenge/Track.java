
package com.alisonjc.ituneschallenge;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Track {

    @SerializedName("resultCount")
    @Expose
    private Long ResultCount;
    @SerializedName("results")
    @Expose
    private List<Result> Results;

    public Long getResultCount() {
        return ResultCount;
    }

    public void setResultCount(Long resultCount) {
        ResultCount = resultCount;
    }

    public List<Result> getResults() {
        return Results;
    }

    public void setResults(List<Result> results) {
        Results = results;
    }

}
