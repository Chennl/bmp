package com.cocacola.bmp.domain.page;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pagenation {
/*
    @ApiModelProperty(
            value = "记录总条数，默认0",
            hidden = true
    )*/
    private long limit = 0L;
 //   @ApiModelProperty("当前页，当前页是第几页，默认1")
    private long pageIndex = 1L;
//    @ApiModelProperty("每页显示条数，默认10")
    private long pageSize = 10L;
/*   @ApiModelProperty(
            value = "偏移最大条数，默认0",
            hidden = true
    )*/
    private long offset = 0L;
}
