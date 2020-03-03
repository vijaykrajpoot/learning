package org.vkrajput.learning.spring.boot.integration.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Getter
@Setter
public class MovieMessage {
    private Movie movie;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
