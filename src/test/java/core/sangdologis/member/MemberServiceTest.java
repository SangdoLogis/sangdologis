package core.sangdologis.member;


import core.sangdologis.AppConfig;
import core.sangdologis.autowired.AllBeanTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// 테스트는 필수
public class MemberServiceTest {

    MemberService memberService;
    @BeforeEach
    public void beforeEach(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        memberService = ac.getBean(memberService);
    }

    @Test
    void join(){
        //given
        Member member = new Member("김우경", "woo", "123", "pd1125@w232", "01023123", Grade.BASIC);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
