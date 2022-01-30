package com.greatlearning.main;

import com.greatlearning.service.BracketService;


public class Driver {

    public static void main(String[] args) {

        BracketService bracketService = new BracketService();

        String bracketStr = "([[{}]])";

        boolean isBalanced = bracketService.isBracketsBalanced(bracketStr);

        if (isBalanced)
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets");
    }

}
