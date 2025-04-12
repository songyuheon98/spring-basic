package com.study.project01.discount;

import com.study.project01.member.Grade;
import com.study.project01.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP 10% 할인 테스트")
    void vip_o(){
        // given
        Member member = new Member(1L,"memberVIP", Grade.VIP);

        // when
        int discount = discountPolicy.discount(member,10000);

        // then
        assertThat(discount).isEqualTo(1000);

    }


    @Test
    @DisplayName("VIP 가 아니면 할인 적용 X")
    void vip_x(){
// given
        Member member = new Member(2L,"memberVIP", Grade.BASIC);

        // when
        int discount = discountPolicy.discount(member,10000);

        // then
        assertThat(discount).isNotEqualTo(1000);

    }
}