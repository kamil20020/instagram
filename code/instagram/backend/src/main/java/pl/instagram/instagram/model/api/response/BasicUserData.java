package pl.instagram.instagram.model.api.response;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BasicUserData {

    private Integer userId;
    private String nickname;
    private String firstname;
    private String surname;
    private String avatar;
}
