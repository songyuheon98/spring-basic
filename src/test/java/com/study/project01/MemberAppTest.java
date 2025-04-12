package com.study.project01;

import com.study.project01.member.Grade;
import com.study.project01.member.Member;
import com.study.project01.member.MemberService;
import com.study.project01.member.MemberServiceImpl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberAppTest {

    MemberService memberService = new MemberServiceImpl();
    @Test
    void join(){
        // given
        Member member = new Member(1L,"memberA", Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}