package Chapter08.ProgrammingExercises;

import java.util.*;
/* A personal phone directory contains room for first names and phone numbers for 30 people.
   Assign names and phone numbers for the first 10 people.
   Prompt the user for a name, and if the name is found in the list, display the corresponding phone number.
   If the name is not found in the list,
   prompt the user for a phone number, and add the new name and phone number to the list.
   Continue to prompt the user for names until the user enters quit.
   After the arrays are full (containing 30 names), do not allow the user to add new entries.*/

public class PhoneNameAndNumber {
    public static void main(String[] args)
    {
        String contact[];
        contact = new String[30];

        String contact_name[];
        contact_name = new String[30];

        Scanner sc = new Scanner(System.in);

        int counter = 9;
        int i;
        int flag;

        contact[0] = "Gina";
        contact_name[0] = "(847) 341-0912";

        contact[1] = "Marcia";
        contact_name[1] = "(847) 341-2392";

        contact[2] = "Rita";
        contact_name[2] = "(847) 354-0654";

        contact[3] = "Jennifer";
        contact_name[3] = "(414) 234-0912";

        contact[4] = "Fred";
        contact_name[4] = "(414) 435-6567";

        contact[5] = "Neil";
        contact_name[5] = "(608) 123-0904";

        contact[6] = "Judy";
        contact_name[6] = "(608) 435-0434";

        contact[7] = "Arlene";
        contact_name[7] = "(847) 341-0912";

        contact[8] = "Deepak";
        contact_name[8] = "(930) 412-0991";

        contact[9] = "LaWanda";
        contact_name[9] = "(920) 787-9813";

        System.out.print("Please enter the name you want to find: >> ");
        String find_name = sc.nextLine();
        while((counter < 30) && (find_name.equals("quit") != true))
        {
            flag = 0;
            for(i = 0; i < counter; i++)
            {
                if(find_name.equals(contact[i]))
                {
                    flag = 1;
                    System.out.println("Phone number is " + contact_name[i]);
                }
            }
            if(flag == 0)
            {
                System.out.print("Please enter the Phone Number >> ");
                String phone_num = sc.nextLine();
                counter++;
                contact[counter] = find_name;
                contact_name[counter] = phone_num.replaceAll("(...)(...)(...)", "($1) $2-$3");
            }
            System.out.print("Please enter the name you want to find >> ");
            find_name = sc.nextLine();

        }
        System.out.println();
        System.out.println("Name Phone #");
        for(i = 0; i <= counter; i++)
        {
            System.out.println(contact[i] + "\n" + contact_name[i]);
        }
    }
}
