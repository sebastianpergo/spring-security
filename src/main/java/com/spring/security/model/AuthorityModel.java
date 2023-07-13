package com.spring.security.model;

import com.spring.security.utils.AuthorityName;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_authority")
public class AuthorityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuthority;

    @Enumerated(EnumType.STRING)
    private AuthorityName name;

    // Constructor
    public AuthorityModel(Long idAuthority, AuthorityName name) {
        this.idAuthority = idAuthority;
        this.name = name;
    }
}
