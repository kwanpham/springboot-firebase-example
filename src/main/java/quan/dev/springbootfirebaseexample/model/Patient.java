package quan.dev.springbootfirebaseexample.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Patient {

    private String name;

    private String email;

    private String profile_photo;

    private String uid;

    private String username;

}
