package com.github.peacetrue.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * @author peace
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sample {

    @Min(1)
    private Long id;
    @Size(min = 1, max = 2)
    private String string;
    @Min(0)
    @Max(2)
    private Byte bytes;
    @Min(0)
    @Max(2)
    private Short shorts;
    @Min(0)
    @Max(2)
    private Integer integer;
}
