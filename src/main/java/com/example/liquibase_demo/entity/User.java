package com.example.liquibase_demo.entity;

//import com.yahoo.elide.annotation.*;
import lombok.*;
import org.springframework.data.annotation.Immutable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@ReadPermission(expression = "allow all")
//@UpdatePermission(expression = "allow all")
//@CreatePermission(expression = "allow all")
//@DeletePermission(expression = "allow all")
//@SharePermission
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@ToString(callSuper = true, doNotUseGetters = true)
//@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
//@Include(rootLevel = true)
@Cacheable(value = false)
@Immutable
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false,)
    private String name;

    @Column(name = "email", nullable = false, unique= true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "created_at", nullable = false)
    private String createdAt;
}
