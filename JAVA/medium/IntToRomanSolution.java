package medium;

public class IntToRomanSolution {
    //    罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
//
//    字符          数值
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
//    例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
//
//    通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
//
//    I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//    X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
//    C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
//    给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int qian = num / 1000;
        if (qian != 0) {
            for (int i = 0; i < qian; i++) {
                result.append("M");
            }
        }
        num = num % 1000;
        int bai = num / 100;
        if (bai == 0) {
        } else if (bai == 5) {
            result.append("D");
        } else if (bai == 4) {
            result.append("CD");
        } else if (bai == 9) {
            result.append("CM");
        } else if (bai > 5) {
            result.append("D");
            for (int i = 0; i < bai - 5; i++) {
                result.append("C");
            }
        } else {
            //1~3
            for (int i = 0; i < bai; i++) {
                result.append("C");
            }
        }

        num = num % 100;
        int shi = num / 10;
        if (shi == 0) {
        } else if (shi == 5) {
            result.append("L");
        } else if (shi == 4) {
            result.append("XL");
        } else if (shi == 9) {
            result.append("XC");
        } else if (shi > 5) {
            result.append("L");
            for (int i = 0; i < shi - 5; i++) {
                result.append("X");
            }
        } else {
            //1~3
            for (int i = 0; i < shi; i++) {
                result.append("X");
            }
        }

        num = num % 10;
        int ge = num;
        if (ge == 0) {
        } else if (ge == 5) {
            result.append("V");
        } else if (ge == 4) {
            result.append("IV");
        } else if (ge == 9) {
            result.append("IX");
        } else if (ge > 5) {
            result.append("V");
            for (int i = 0; i < ge - 5; i++) {
                result.append("I");
            }
        } else {
            //1~3
            for (int i = 0; i < ge; i++) {
                result.append("I");
            }
        }
        return result.toString();
    }
}
