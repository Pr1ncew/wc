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
	System.out.println("�����ܣ�");
	System.out.println("-c:ͳ���ı������ַ�����");
	System.out.println("-w:ͳ���ı����ָ�ʽ������");
	System.out.println("-l:ͳ���ı�����");
	System.out.println("-a:���ظ����ӵ����ݣ������� / ���� / ע���У�");
	while(temp)
	{
	System.out.println("�������ı�·����");
	Scanner input1=new Scanner(System.in);
	System.out.println("��ѡ����Ҫͳ�ƵĹ��ܣ�");
	Scanner input2=new Scanner(System.in);
	url=input1.next();
	str=fileunit.ReadTextFile(url);
	line=fileunit.ReadTextFile1(url);
	func=input2.next();
	if(func.equals("-c")||func.equals("-w")||func.equals("-l")||func.equals("-a")) {
		temp=false;
	}else {
		System.out.println("����������������룡");
		temp=true;
	}
	}
	switch(func)
	{
	case "-c":total.accountch(str);break;
	case "-w":total.accountall(str);break;
	case "-l":System.out.println("������"+line);break;
	case "-a":fileunit.ReadTextFile2(url);
	}
	
  }
}
