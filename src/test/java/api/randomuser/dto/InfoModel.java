package api.randomuser.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InfoModel {

    private String seed;
    private Integer results;
    private Integer page;
    private String version;
}
