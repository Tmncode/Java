package Chapter05.GameZone;
import javax.swing.JOptionPane;

public class RockPaperScissors {
    public static void main(String[] args)
    {
        int user;
        int cpu;

        String msg;
        String userPick;
        String cpuPick;

        final int LOW = 1;
        final int HIGH = 3;

        cpu = LOW + (int)(Math.random() * HIGH);
        user = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Type one of the following numbers:\n1 -- Rock" +
                        "\n2 -- Paper\n3 -- Scissors"));

        if(user == 1)
            userPick = "rock";
        else
        if(user == 2)
            userPick = "paper";
        else
            userPick = "scissors";
        if(cpu == 1)
            cpuPick = "rock";
        else
        if(cpu == 2)
            cpuPick = "paper";
        else
            cpuPick = "scissors";
        if(user == 1)
            if(cpu == 1)
                msg = "tie";
            else
            if(cpu == 2)
                msg = "computer";
            else
                msg = "you";
        else
        if(user == 2)
            if(cpu == 2)
                msg = "tie";
            else
            if(cpu == 3)
                msg = "computer";
            else
                msg = "you";
        else
        if(cpu == 3)
            msg = "tie";
        else
        if(cpu == 1)
            msg = "computer";
        else
            msg = "you";
        JOptionPane.showMessageDialog(null,"You picked " +
                userPick + "\nComputer picked " + cpuPick +
                "\nWinner: " + msg);
    }

}
