/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscorebound;

import java.util.Scanner;

/**
 *
 * @author theki
 */
public class FootballScoreBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User u1 = new User();
        User u2 = new User();
        Manager m1 = new Manager();
        LiveScoreBean lsBean = new LiveScoreBean();
        lsBean.addPropertyChangeListener(u1);
        lsBean.addPropertyChangeListener(u2);
        lsBean.addPropertyChangeListener(m1);
        boolean isExit = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Score : ");
            String input = sc.nextLine();
            if (input.equals("")) {
                isExit = true;
            } else {
                lsBean.setScoreLine(input);
            }
        } while (!isExit);
    }

}
