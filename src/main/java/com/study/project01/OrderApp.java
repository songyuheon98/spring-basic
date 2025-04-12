package com.study.project01;

import com.study.project01.member.Grade;
import com.study.project01.member.Member;
import com.study.project01.member.MemberService;
import com.study.project01.member.MemberServiceImpl;
import com.study.project01.order.Order;
import com.study.project01.order.OrderService;
import com.study.project01.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
    }
}
