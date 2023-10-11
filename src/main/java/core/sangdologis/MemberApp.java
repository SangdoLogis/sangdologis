package core.sangdologis;

import core.sangdologis.member.Grade;
import core.sangdologis.member.Member;
import core.sangdologis.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {

/*
        메인메서드에서 테스트 하는 것은 안좋다
        순수 자바 테스트
        MemberService memberService = new MemberServiceImpl();
        AppCofig appCofig = new AppCofig();
        MemberService memberService = appCofig.memberService();
*/
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        //스프링 컨테이너에서 꺼내는것
        MemberService memberService = ac.getBean("memberService", MemberService.class);

        Member member = new Member("woo","woo1125","123456","woo1125@naver.com","01012341234", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember("woo1125");
        System.out.println("member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
