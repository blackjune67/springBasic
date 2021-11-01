package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {

    //Construct Injection
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService oderService() {
        return new OrderServiceImpl(
                new MemoryMemberRepository(),
                new FixDiscountPolicy());
    }


/*
//이렇게 하는게 더 나을 것 같은데?
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository);
    }

    public OrderService oderService() {
        return new OrderServiceImpl(
                memberRepository,
                new FixDiscountPolicy());
    }
*/



}
