 public class  ZH{       
         public static void main (String args[])
         {
            int i,j;
          for(i=1;i<=5;i++)
          {
             for(j=1;j<=i;j++)
             {
              System.out.print(��*������
              }
               System.out.println( ����
           }
          }
          }
  public class  ZH{       \\5�е���������
         public static void main (String args[])
         {
            int i,j;
            for(i=1;i<=5;i++��
              {
                for(j=1;j<=5-i;j++)
                   {
                   System.out.print(�� ������
                   }  
                for(j=1;j<=2*i-1;)
                    {
                   System.out.print(��*������
                     }
                   System.out.println( ����
                   }  
                }
           }
 public class  ZH{       \\�������
         public static void main (String args[])
         {
            int a[][]=new int [10][];
            int i,j;
            for(i=0;i<a.length;i++)
             {
               a[i]=new int[i+i];
              }
             for(i=0;i<a.length;i++);
              {
                 for(j=0;j<a[i].length;j++)
                 if(j==0||i==j)
                     a[i][j]=1;
              eles
                  a[i][j]=a[i-1][j-1]+a[i-1][j];
              }
            for(i=0;i<a.length;i++)
            {
                System.out.print(a[i][j]+" ");
             }
                System.out.println();
           }
          }
         }
                   class Dogs
{
	String color="��ɫ";
    int age=1;
	String name="����";
	
	public Dogs()//���췽��
	{
		System.out.println("��������");
	}
	public void bark()//bark������ģ�⹷��
	{
		String voice="����";
		System.out.println(voice);
	}
	public void walk(int steps)//steps��Ҫ�ߵĲ���
	{
		for(int i=0;i<steps;i++)
		{
			System.out.println("�ߵ�"+i+"��");
		}
	}
}

        class DogGirl extends Dogs
	{
		public DogGirl()//���췽��
		{
			System.out.println("DogGirl����");
		}
		public void bornDogBaby()//��С���ķ���
		{
			System.out.println("new a dog baby");
		}
	}


public final class jicheng_extends {
	public static void main(String[] args)
	{
		DogGirl girl=new DogGirl();
		System.out.println("�����ǣ�"+girl.name);
		System.out.println("ëɫ�ǣ�"+girl.color);
		girl.name="ģ����";
		System.out.println("������"+girl.name);
		girl.bark();
		girl.bornDogBaby();
		girl.walk(6);
		
	}
}
 
import java.applet.*;//�ӿڰ�ťС����
import java.awt.*;
import java.awt.event.*;//InterfaceExample1
public class apple extends Applet implements  ActionListener
{
	TextField password=new TextField("�������룡");
	Button btn=new Button("����");
	public void init()
	{
		add(password);
		add(btn);
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) 
	{
		password.setEchoChar('*');
		password.selectAll();
		
	}
class Circle
{
	double radius;
	final static double pi=3.14;
	public Circle()
	{
		radius=3;
	}
	public Circle(double n)//��������
	{
		radius=n;
	}
	public double GetCircumference()
	{
		return radius*2*pi;
	}
	public double GetArea()
	{
		return radius*radius*pi;
	}
	public void show()//void�Ѻõģ��ձ�ģ�ͨ�õģ�
	{
		System.out.println("Բ�İ뾶="+radius);
	}
	public void changeradius(double k)
	{
		radius=k;//�ٴθ�ֵ
	}
	public double Getradius()
	{
		return radius;
	}
	
}
public class Basic_class {
	public static void main(String[] args)
	{Circle s1=new Circle();
	Circle s2=new Circle();
	System.out.println("Բ���ܳ��ǣ�"+s1.GetArea());
	System.out.println("Բ�������:"+s1.GetCircumference());
	s1.show();
	s1.changeradius(30);
	s1.show();
	
	}

}


	}

import java.awt.*;//��������С����
import java.applet.Applet;
import java.awt.event.*;//InterfaceExample1
//applet code=anniu.class  width=280 height=89
public class anniu extends Applet implements  ActionListener
{
	Label p1=new Label("*");
	Label p2=new Label("=");
	TextField file1=new TextField(6);
	TextField file2=new TextField(6);
	TextField file3=new TextField(6);
	Button btn=new Button("���");
	public void init()
	{
		add(file1);
		add(p1);
		add(file2);
		add(p2);
		add(file3);
		add(btn);
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) 
	{
		int x=Integer.parseInt(file1.getText())*Integer.parseInt(file1.getText());
		file3.setText(Integer.toString(x));
	}
}
class ����Գ 
{  /*private*/int n=100;
   void crySpeak(String s) 
   {  System.out.println(s);  }  
}
class People extends ����Գ
{  void computer(int a,int b) 
  {  int c=a*b;
      System.out.println(c); 
   }
 void crySpeak(String s) 
 {  System.out.println("**"+s+"**");  }  
}
public class t1
{  public static void main(String args[])
  {  ����Գ monkey=new People();   
      monkey.crySpeak("I love this game");
      People people=(People)monkey; 
      people.computer(10,10);
   }
}
public class one<T>//��������
{
	T[] array;
	public void setT(T[]  array1)
	{
		array=array1;
	}
	public T[] getT()
	{
		return array;
	}
public static void main(String[] args)
{
	one<String>str=new one<String>();
	String array[]={"�ַ���1","�ַ���2","�ַ���3","�ַ���4"};
	str.setT(array);
	System.out.print("�������������Ϊ��");
	for(int i=0;i<str.getT().length;i++)
		System.out.print(str.getT()[i]+",");
}
}

abstract class A//���ⷽ��
{
	abstract void callme();
	void metoo()
	{
		System.out.println("inside A's metoo() method");
	}
}
class B extends A
{
	void callme()
	{
		System.out.println("inside B's metoo() method");
	}
}

public class Abstract {
	public static void main(String[] args) {
	A c=new B();//����ת�ͣ����ͣ�
	B d=new B();
	c.callme();
	d.metoo();
	}
}
interface JieOne  //�ӿڵĶ��嵥���ӿ�û�м̳�
{
	int a=1;
	int b=2;
	int c=3;
	int d=4;
	int f=5;	
	void print();
	void print1();
}
class JieOne1 implements JieOne //ʵ�ֽӿ�    
{
	public void print()
	{
		System.out.println(a+b);
	}
	
	public void print1()
	{
		System.out.println(c+d+f);
	}
}
public class one
{
	public static void main(String args[])
	{
		JieOne1 a1=new JieOne1();
		a1.print();
		a1.print1();
	}
}
 interface JieOne  //�ӿڵĶ��嵥���ӿ�
{
	int a=1;
	int b=2;
	int c=3;
	int d=4;
	int f=5;	
	void print();
	void print1();
}
 interface JieOne2//�ڶ����ӿ�
 {
	 int e=3;
	 void print4();
 }
 class JieOne5 implements JieOne2//ʵ�ֵڶ����ӿ�
 {
	 public void print4()
	 {
		 System.out.println(e*e);
	 }
 }
 interface JieOne4 extends JieOne,JieOne2//�������ӿڼ̳е�һ���ӿ�
 {
	 void print5();
 }
 class lei2 extends JieOne4
 {
	 System.out.println(c+e);
 }
class JieOne1 implements JieOne //ʵ�ֵ�һ ���ӿ�
{
	public void print()
	{
		System.out.println(a+b);
	}
	
	public void print1()
	{
		System.out.println(c+d+f);
	}
}
class JieOne3 extends JieOne1 implements JieOne//��һ��̳�ʵ�ֵ�һ�ӿڵ���
{
	public void print1()//����ԭ����
	{
		System.out.println(a*d);
	}
}
public class one
{
	public static void main(String args[])
	{
		JieOne3 b1=new JieOne3();
		JieOne1 a1=new JieOne1();
		JieOne k1=new JieOne3();//����ת��
		a1.print();
		a1.print1();
		b1.print1();
		k1.print1();
	}
}
class Book1
{
	int number;
	String name;
	String author;
	String press;
	public Book1()
	{
		number=140403002;
		name="����";
		author="����";
		press="������";
	}
	public Book1(int number,String name,String author,String press)
	{
		this.number=number;
		this.name=name;
		this.author=author;
		this.press=press;
		
	}
	public int getnumber()
	{
		return number;
	}
	public String getname()
	{
		return name;
	}
	public void changerauthor(String x)
	{
		author=x;
	}
	public void show()
	{
		System.out.println("����:"+name+"��ţ�"+number+"���ߣ�"+author+"�����磺"+press);
	}
}
public class book {
	public static void main(String[] args) {
		Book1 s1=new Book1();
		Book1 s2=new Book1(6426,"java","�Ժ���"," �廪��ѧ������");
		System.out.println(s1.getnumber());
		System.out.println(s1.getname());
		System.out.println(s2.getnumber());
		System.out.println(s2.getname());
		s1.show();
		s2.show();
		s1.changerauthor("������");
		System.out.println("���ĺ�����ߣ�"+s1.author);
		s2.changerauthor("��һ��������");
		System.out.println("���ĺ�����ߣ�"+s2.author);
		
	}
}

class cylinder
{
	int r=10;
	int h=5;
	double S;
	double V;
	final static double pi=3.14;
	public void Se()
	{
		S=2*r*pi*h+r*r*pi;
		System.out.println("������ǣ�"+S);
	}
	public void Ve()
	{
		V=r*r*pi*h;
		System.out.println("����ǣ�"+V);
	}
	
}
public class look {
	public static void main(String[] args) {
		cylinder s1=new cylinder();
		s1.Se();
		s1.Ve();
	}

}
interface ����ͼ��//��ʦ�Ľӿ�
{
    double PI=3.1415926;
	double �������ܳ�();
	double �����ܳ�(double a,double b);
	double Բ�ܳ�(double r);
}

class ������ implements ����ͼ��
{
	double a,b,c;
	public ������()
	{
		
	}
	public ������(double a,double b,double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double �������ܳ�()
	{
		return a+b+c;
	}
	
	public double �����ܳ�(double a,double b)
	{
		return 0;
	}
	public double Բ�ܳ�(double r)
	{
		return 0;
	}
	
}
public class t1 {

	public static void main(String[] args) {
	������ a1=new ������(7,7,9);	
    double l;
    l=a1.�������ܳ�();
    System.out.print("l="+l);
	}

}
abstract class Employee
{
	public abstract double earnings();
}
class YearWorker extends Employee//��н
{
	  int a,b;
      public double earnings()
	{
		return a*b;
	}
}
class MonthWorker extends Employee//��н
{
	int c,e;
	public double earnings()
	{
	return c*e;
	}
}
class WeekWorker extends Employee//��н
{
	int c,e;
	public double earnings()
	{
	return c*e;
	}
}
class Company//��˾
{
	Employee[] employee;
	double salaries=0;
	Company(Employee[]employee)
	{
		this.employee=employee;//��Ա
	}
	public double salariesPay()
	{
		salaries=0;
		int a,b;
		salaries=a*b;//���㹤��
		return salaries;
	}
}
public class Hardwork {
	public static void mian(String[] args)
	{
		Employee[]employee=new Employee[20];
		for(int i=0;i<=employee.length;i++)
		{
			if(i%3==0)
				employee[i]=new WeekWorker();
			else if(i%3==1)
				employee[i]=new MonthWorker();
			else if(i%3==2)
				employee[i]=new YearWorker();
		}
		Company company=new Company(employee);
		System.out.println("��˾�깤���ܶ"+company.salariesPay());
	}
  
}

