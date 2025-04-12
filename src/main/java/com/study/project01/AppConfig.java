package com.study.project01;

import com.study.project01.discount.DiscountPolicy;
import com.study.project01.discount.FixDiscountPolicy;
import com.study.project01.discount.RateDiscountPolicy;
import com.study.project01.member.MemberRepository;
import com.study.project01.member.MemberService;
import com.study.project01.member.MemberServiceImpl;
import com.study.project01.member.MemoryMemberRepository;
import com.study.project01.order.OrderService;
import com.study.project01.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(),discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
