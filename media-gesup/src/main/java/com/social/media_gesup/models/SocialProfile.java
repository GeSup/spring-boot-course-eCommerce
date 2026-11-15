package com.social.media_gesup.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SocialProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne // (mappedBy = "socialProfile" )
    @JoinColumn(name = "social_user")
    @JsonIgnore
    private SocialUser user;

    private String description;

    public void setUser(SocialUser user) {
        this.user = user;
        if(user.getSocialProfile() != this) {
            user.setSocialProfile(this);
        }
    }
}
