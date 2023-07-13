package com.spring.security.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tb_user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Column(length = 15, nullable = false, unique = true)
    private String username;

    @Column(length = 15, nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "tb_user_authority",
            joinColumns = @JoinColumn(name = "idUser"),
            inverseJoinColumns = @JoinColumn(name = "idAuthority"))
    private List<AuthorityModel> authorities;

    // COnstructor
    public UserModel(String username, String password, List<AuthorityModel> authorities) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

}
