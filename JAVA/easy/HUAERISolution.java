package easy;

import java.util.Scanner;

public class HUAERISolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());
        String text = sc.nextLine();
        int index = 0;
        if (k == 0) {
            return;
        }

        for (int i = 0; i < k; i++) {
            String order = sc.nextLine();
            if (order.startsWith("FORWARD")) {
                String orderData = order.replace("FORWARD ", "");
                index = index + Integer.parseInt(orderData);
                index = Math.min(index, text.length());
            } else if (order.startsWith("BACKWARD")) {
                String orderData = order.replace("BACKWARD ", "");
                index = index - Integer.parseInt(orderData);
                index = Math.max(index, 0);
            } else if (order.startsWith("SEARCH-FORWARD")) {
                String word = order.replace("SEARCH-FORWARD ", "");
                for (int j = index; j < text.length(); j++) {
                    if (text.substring(j).toLowerCase().startsWith(word.toLowerCase())) {
                        index = j;
                    }
                }
            } else if (order.startsWith("SEARCH-BACKWARD")) {
                String word = order.replace("SEARCH-BACKWARD ", "");
                for (int j = index; j >= 0; j--) {
                    if (j >= text.length()) {
                        continue;
                    }
                    if (text.substring(j).toLowerCase().startsWith(word.toLowerCase())) {
                        index = j;
                    }
                }
            } else if (order.startsWith("INSERT")) {
                String orderData = order.replace("INSERT ", "");
                text = text.substring(0, index) + orderData + text.substring(index, text.length());
                index += orderData.length();
            } else if (order.startsWith("REPLACE")) {
                String orderData = order.replace("REPLACE ", "");
                String newText = null;
                newText = text.substring(0, index) + orderData;
                if (newText.length() < text.length()) {
                    newText = newText + text.substring(newText.length());
                }
                text = newText;
            } else if (order.startsWith("DELETE")) {
                String orderData = order.replace("DELETE ", "");
                int deleteNum = Integer.parseInt(orderData);
                text = text.substring(0, index) + text.substring(Math.min(index + deleteNum, text.length()));
            }
        }

        System.out.println(text);
    }
}
