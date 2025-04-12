package com.study.project01.order;

import com.study.project01.discount.DiscountPolicy;
import com.study.project01.discount.FixDiscountPolicy;
import com.study.project01.member.Member;
import com.study.project01.member.MemberRepository;
import com.study.project01.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
}
