package io.cosmospf.load.javaapi.actions;

import io.cosmospf.load.javaapi.internal.Utils;

import java.util.Map;

public class DBCallActionParamStep {
    private final io.cosmospf.load.jdbc.actions.actions.DBCallActionParamsStep wrapped;

    public DBCallActionParamStep(io.cosmospf.load.jdbc.actions.actions.DBCallActionParamsStep wrapped){
        this.wrapped = wrapped;
    }

    public DBCallActionBuilder params(Map<String, Object> values){
        return new DBCallActionBuilder(wrapped.params(
                Utils.getSeq(values))
        );
    }
}
