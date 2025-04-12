package com.study.project01.discount;

import com.study.project01.member.Grade;
import com.study.project01.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private int discountFixAmount =1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return discountFixAmount;
        }else {
            return 0;
        }
    }
}
