package wc.exe;
import java.util.Scanner;
public class testMain {
	public static void main(String[] args) {
		fileUnit fileunit=new fileUnit();
		total total=new total();
		String url=null;
		String str=null;
		String func=null;
		boolean temp=true;
		int line=0;
	System.out.println("程序功能：");
	System.out.println("-c:统计文本特殊字符字数");
	System.out.println("-w:统计文本各种格式词字数");
	System.out.println("-l:统计文本行数");
	System.out.println("-a:返回更复杂的数据（代码行 / 空行 / 注释行）");
	while(temp)
	{
	System.out.println("请输入文本路径：");
	Scanner input1=new Scanner(System.in);
	System.out.println("请选择需要统计的功能：");
	Scanner input2=new Scanner(System.in);
	url=input1.next();
	str=fileunit.ReadTextFile(url);
	line=fileunit.ReadTextFile1(url);
	func=input2.next();
	if(func.equals("-c")||func.equals("-w")||func.equals("-l")||func.equals("-a")) {
		temp=false;
	}else {
		System.out.println("输入错误，请重新输入！");
		temp=true;
	}
	}
	switch(func)
	{
	case "-c":total.accountch(str);break;
	case "-w":total.accountall(str);break;
	case "-l":System.out.println("行数："+line);break;
	case "-a":fileunit.ReadTextFile2(url);
	}
	
  }
}
