package com.cubecart;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Exercise {


//    @Test(enabled = false)
//    public void permissionTest() {
//        String token = getTokenForUserWithoutPermissions(user1);
//        PseudoCode pseudoCode = new PseudoCode(token);
//        try {
//            pseudoCode.createTheThing();
//        } catch (SdkResponseException e) {
//            Assert.assertTrue(e.getStatusCode() == 404);
//        }
//
//        String token2 = getTokenForUserWithPermissions(user2);
//        PseudoCode pseudoCode2 = new PseudoCode(token2);
//        pseudoCode.createTheThing();
//    }



    public static void main(String[] args) {

        String str="I am heading home";

        StringBuilder str1=new StringBuilder(str);

        System.out.println(str1.reverse());
        //

        char[] array =str.toCharArray();

        System.out.println(array.length);

        StringBuilder reverse= new StringBuilder();

        for (int i=array.length-1; i>=0;i--){

            reverse.append(str.charAt(i));

        }

        System.out.println(reverse);
        //

        Integer[]  a={1,2,3,4,5,5};

        ArrayList arrayList=new ArrayList();

        arrayList.add(1);

        arrayList.add(2);

        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(5);

        System.out.println(a.length-2);

        /*
    Assumptions:
        user1 does NOT have permissions to "create the thing".
        user2 DOES have permissions to "create the thing".
    Test:
        Make sure user1 CANNOT "create the thing" and make sure user2 CAN "create the thing".
 */



    }
}
