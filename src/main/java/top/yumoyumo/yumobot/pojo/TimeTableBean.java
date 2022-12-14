package top.yumoyumo.yumobot.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: yumo
 * @Description: 课表bean
 * @DateTime: 2022/10/30 15:25
 **/
@NoArgsConstructor
@Data
public class TimeTableBean {

    @JsonProperty("day")
    private Integer day;
    @JsonProperty("name")
    private String name;
    @JsonProperty("weekarr")
    private List<Integer> weekarr;
    @JsonProperty("sectionstart")
    private Integer sectionstart;
    @JsonProperty("sectionend")
    private Integer sectionend;
    @JsonProperty("locale")
    private String locale;
}
