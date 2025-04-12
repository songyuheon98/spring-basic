package com.study.project01;

import com.study.project01.member.Grade;
import com.study.project01.member.Member;
import com.study.project01.member.MemberService;
import com.study.project01.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("member.getName() = " + member.getName());
        System.out.println("findMember.getName() = " + findMember.getName());

    }
}
