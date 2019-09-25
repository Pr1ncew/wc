package wc.exe;

public class total {
	static String E1,E2,E3;
    static int chineseCount = 0;
    static int englishCount = 0;
    static int numberCount = 0;

    public void accountall(String str)
    {
        chineseCount = 0;
        englishCount = 0; 
        numberCount = 0;
        String E1 = "[\u4e00-\u9fa5]";// 中文
        String E2 = "[a-zA-Z]";// 英文
        String E3 = "[0-9]";// 数字

        String temp;
        for (int i = 0; i < str.length(); i++)
        {
            temp = String.valueOf(str.charAt(i));
            if (temp.matches(E1))
            {
                chineseCount++;
            }
            if (temp.matches(E2))
            {
                englishCount++;
            }
            if (temp.matches(E3))
            {
                numberCount++;
            }
        }
        System.out.println("汉字数:" + chineseCount);
        System.out.println("英文数:" + englishCount);
        System.out.println("数字数:" + numberCount);
    }
    

    public void accountch(String str)
    {
        chineseCount = 0;
        englishCount = 0;
        numberCount = 0;
        String E1 = "[\u4e00-\u9fa5]";// 中文
        String E2 = "[a-zA-Z]";// 英文
        String E3 = "[0-9]";// 数字

        String temp;
        for (int i = 0; i < str.length(); i++)
        {
            temp = String.valueOf(str.charAt(i));
            if (temp.matches(E1))
            {
                chineseCount++;
            }
            if (temp.matches(E2))
            {
                englishCount++;
            }
            if (temp.matches(E3))
            {
                numberCount++;
            }
        }
        System.out.println("特殊字符:" + (str.length() - (chineseCount + englishCount + numberCount)));
    }
}
