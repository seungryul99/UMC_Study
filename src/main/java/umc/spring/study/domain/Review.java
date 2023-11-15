package umc.spring.study.domain;


import lombok.*;
import umc.spring.study.domain.base.BaseEntity;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Review extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer star;

    @Column(nullable = false, length = 50)
    private String content;
}
