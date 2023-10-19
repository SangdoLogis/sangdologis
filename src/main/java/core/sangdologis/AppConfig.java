package core.sangdologis;

import core.sangdologis.member.MemberRepository;
import core.sangdologis.member.MemberService;
import core.sangdologis.member.MemberServiceImpl;
import core.sangdologis.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
@Bean : 스프링 컨테이너(ApplicationContext)에 객체를 스프링 빈으로 등록
@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
*/
@Configuration
@ComponentScan
public class AppConfig {


}