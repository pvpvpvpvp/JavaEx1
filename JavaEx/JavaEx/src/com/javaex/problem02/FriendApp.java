package com.javaex.problem02;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        String[]friendd= new String[9];
        
        // 친구정보 입력받기
        for(int i=0;i<friendArray.length*3;i++) {
        	friendd[i]=sc.next();
        }
        // 입력받은 친구정보를 공백으로 분리     
        
//        Friend fd01 = new Friend(friendd[0],friendd[1],friendd[2]);
//        Friend fd02 = new Friend(friendd[3],friendd[4],friendd[5]);
//        Friend fd03 = new Friend(friendd[6],friendd[7],friendd[8]);
        
//        Friend[] fdd= new f;
        
        for(int i=0;i<9;i+=3)
        {
        	friendArray[i/3]= new Friend(friendd[i],friendd[i+1],friendd[i+2]);
//        	friendArray[i/3]=fdd[i/3];
        }
        
        
        // Friend 객체 생성하여 데이터 넣기
        
        
//        friendArray[0]=fd01;
//        friendArray[1]=fd02;
//        friendArray[2]=fd03;
        // 배열에 추가하기

        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
