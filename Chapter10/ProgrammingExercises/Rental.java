package Chapter10.ProgrammingExercises;

public class Rental {
    public static final int MINUTES_IN_HOUR = 60;
    public static final int HOUR_RATE = 40;
    public static final int CONTRACT_NUM_LENGTH = 4;
    public static final String[] EQUIP_TYPES =
            {"jet ski", "pontoon boat", "rowboat", "canoe", "kayak",
                    "beach chair", "umbrella", "other"};
    private String contractNumber;
    private int hours;
    private int extraMinutes;
    private double price;
    private String contactPhone;
    private int equipType;
    public Rental(String num, int minutes)
    {
        setContractNumber(num);
        setHoursAndMinutes(minutes);
    }
    public Rental()
    {
        this("A000", 0);
    }
    public void setContractNumber(String num)
    {
        boolean numOk = true;
        if(num.length() != CONTRACT_NUM_LENGTH ||
                !Character.isLetter(num.charAt(0)) ||
                !Character.isDigit(num.charAt(1)) ||
                !Character.isDigit(num.charAt(2)) ||
                !Character.isDigit(num.charAt(3)))
            contractNumber = "A000";
        else
            contractNumber = num.toUpperCase();
    }
    public void setHoursAndMinutes(int minutes)
    {
        hours = minutes / MINUTES_IN_HOUR;
        extraMinutes = minutes % MINUTES_IN_HOUR;
        if(extraMinutes <= HOUR_RATE)
            price = hours * HOUR_RATE + extraMinutes;
        else
            price = hours * HOUR_RATE + HOUR_RATE;
    }
    public String getContractNumber()
    {
        return contractNumber;
    }
    public int getHours()
    {
        return hours;
    }
    public int getExtraMinutes()
    {
        return extraMinutes;
    }
    public double getPrice()
    {
        return price;
    }
    public String getContactPhone()
    {
        String phone;
        phone = "(" + contactPhone.substring(0, 3) + ") " +
                contactPhone.substring(3, 6) + "-" +
                contactPhone.substring(6, 10);
        return phone;
    }
    public void setContactPhone(String phone)
    {
        final int VALID_LEN = 10;
        final String INVALID_PHONE = "0000000000";
        contactPhone = "";
        int len = phone.length();
        for(int x = 0; x < len; ++x)
        {
            if(Character.isDigit(phone.charAt(x)))
                contactPhone += phone.charAt(x);
        }
        if(contactPhone.length() != VALID_LEN)
            contactPhone = INVALID_PHONE;
    }
    public void setEquipType(int eType)
    {
        if(eType < EQUIP_TYPES.length)
            equipType = eType;
        else
            equipType = EQUIP_TYPES.length - 1;
    }
    public int getEquipType()
    {
        return equipType;
    }
    public String getEquipTypeString()
    {
        return EQUIP_TYPES[equipType];
    }
}
