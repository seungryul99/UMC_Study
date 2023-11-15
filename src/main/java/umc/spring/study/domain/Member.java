package umc.spring.study.domain;


import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;
import umc.spring.study.domain.base.BaseEntity;
import umc.spring.study.domain.enums.Gender;
import umc.spring.study.domain.mapping.MemberMission;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String memberId;

    @Column(nullable = false, length = 50)
    private String password;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String address;

    @Column(nullable = false, length = 50)
    private String birth;

    @Column(columnDefinition = "VARCHAR(20)")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = false , length = 50)
    private String nickname;

    @Column(nullable = true, length = 50)
    private String email;

    @Column(nullable = true, length = 50)
    private String phoneNumber;


    @Column(nullable = false, length = 50)
    private String status;


    private LocalDate inactiveDate;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberMission> memberMissionList = new ArrayList<>();
}
