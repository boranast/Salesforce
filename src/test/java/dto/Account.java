package dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Account {
    String accountName;
    String website;
    String type;

}
