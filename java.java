 public class  ZH{       
         public static void main (String args[])
         {
            int i,j;
          for(i=1;i<=5;i++)
          {
             for(j=1;j<=i;j++)
             {
              System.out.print(“*”）；
              }
               System.out.println( ）；
           }
          }
          }
  public class  ZH{       \\5行等腰三角形
         public static void main (String args[])
         {
            int i,j;
            for(i=1;i<=5;i++）
              {
                for(j=1;j<=5-i;j++)
                   {
                   System.out.print(“ ”）；
                   }  
                for(j=1;j<=2*i-1;)
                    {
                   System.out.print(“*”）；
                     }
                   System.out.println( ）；
                   }  
                }
           }
 public class  ZH{       \\杨辉三角
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
	String color="黄色";
    int age=1;
	String name="花花";
	
	public Dogs()//构造方法
	{
		System.out.println("父类制造");
	}
	public void bark()//bark方法，模拟狗叫
	{
		String voice="汪汪";
		System.out.println(voice);
	}
	public void walk(int steps)//steps需要走的步数
	{
		for(int i=0;i<steps;i++)
		{
			System.out.println("走第"+i+"步");
		}
	}
}

        class DogGirl extends Dogs
	{
		public DogGirl()//构造方法
		{
			System.out.println("DogGirl制造");
		}
		public void bornDogBaby()//生小狗的方法
		{
			System.out.println("new a dog baby");
		}
	}


public final class jicheng_extends {
	public static void main(String[] args)
	{
		DogGirl girl=new DogGirl();
		System.out.println("名字是："+girl.name);
		System.out.println("毛色是："+girl.color);
		girl.name="模范狗";
		System.out.println("改名后："+girl.name);
		girl.bark();
		girl.bornDogBaby();
		girl.walk(6);
		
	}
}
 
import java.applet.*;//接口按钮小窗口
import java.awt.*;
import java.awt.event.*;//InterfaceExample1
public class apple extends Applet implements  ActionListener
{
	TextField password=new TextField("我是密码！");
	Button btn=new Button("隐藏");
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
	public Circle(double n)//参数方程
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
	public void show()//void友好的？普遍的？通用的？
	{
		System.out.println("圆的半径="+radius);
	}
	public void changeradius(double k)
	{
		radius=k;//再次赋值
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
	System.out.println("圆的周长是："+s1.GetArea());
	System.out.println("圆的面积是:"+s1.GetCircumference());
	s1.show();
	s1.changeradius(30);
	s1.show();
	
	}

}


	}

import java.awt.*;//错误的相乘小程序
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
	Button btn=new Button("相乘");
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
class 类人猿 
{  /*private*/int n=100;
   void crySpeak(String s) 
   {  System.out.println(s);  }  
}
class People extends 类人猿
{  void computer(int a,int b) 
  {  int c=a*b;
      System.out.println(c); 
   }
 void crySpeak(String s) 
 {  System.out.println("**"+s+"**");  }  
}
public class t1
{  public static void main(String args[])
  {  类人猿 monkey=new People();   
      monkey.crySpeak("I love this game");
      People people=(People)monkey; 
      people.computer(10,10);
   }
}
public class one<T>//泛型数组
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
	String array[]={"字符串1","字符串2","字符串3","字符串4"};
	str.setT(array);
	System.out.print("泛型数组的内容为：");
	for(int i=0;i<str.getT().length;i++)
		System.out.print(str.getT()[i]+",");
}
}

abstract class A//虚拟方法
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
	A c=new B();//向上转型（泛型）
	B d=new B();
	c.callme();
	d.metoo();
	}
}
interface JieOne  //接口的定义单个接口没有继承
{
	int a=1;
	int b=2;
	int c=3;
	int d=4;
	int f=5;	
	void print();
	void print1();
}
class JieOne1 implements JieOne //实现接口    
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
 interface JieOne  //接口的定义单个接口
{
	int a=1;
	int b=2;
	int c=3;
	int d=4;
	int f=5;	
	void print();
	void print1();
}
 interface JieOne2//第二个接口
 {
	 int e=3;
	 void print4();
 }
 class JieOne5 implements JieOne2//实现第二个接口
 {
	 public void print4()
	 {
		 System.out.println(e*e);
	 }
 }
 interface JieOne4 extends JieOne,JieOne2//第三个接口继承第一二接口
 {
	 void print5();
 }
 class lei2 extends JieOne4
 {
	 System.out.println(c+e);
 }
class JieOne1 implements JieOne //实现第一 个接口
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
class JieOne3 extends JieOne1 implements JieOne//第一类继承实现第一接口的类
{
	public void print1()//覆盖原方法
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
		JieOne k1=new JieOne3();//向上转型
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
		name="书名";
		author="作者";
		press="出版社";
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
		System.out.println("书名:"+name+"书号："+number+"作者："+author+"出版社："+press);
	}
}
public class book {
	public static void main(String[] args) {
		Book1 s1=new Book1();
		Book1 s2=new Book1(6426,"java","赵海延"," 清华大学出版社");
		System.out.println(s1.getnumber());
		System.out.println(s1.getname());
		System.out.println(s2.getnumber());
		System.out.println(s2.getname());
		s1.show();
		s2.show();
		s1.changerauthor("新作者");
		System.out.println("更改后的作者："+s1.author);
		s2.changerauthor("另一个新作者");
		System.out.println("更改后的作者："+s2.author);
		
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
		System.out.println("表面积是："+S);
	}
	public void Ve()
	{
		V=r*r*pi*h;
		System.out.println("体积是："+V);
	}
	
}
public class look {
	public static void main(String[] args) {
		cylinder s1=new cylinder();
		s1.Se();
		s1.Ve();
	}

}
interface 几何图形//老师的接口
{
    double PI=3.1415926;
	double 三角形周长();
	double 矩形周长(double a,double b);
	double 圆周长(double r);
}

class 三角形 implements 几何图形
{
	double a,b,c;
	public 三角形()
	{
		
	}
	public 三角形(double a,double b,double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double 三角形周长()
	{
		return a+b+c;
	}
	
	public double 矩形周长(double a,double b)
	{
		return 0;
	}
	public double 圆周长(double r)
	{
		return 0;
	}
	
}
public class t1 {

	public static void main(String[] args) {
	三角形 a1=new 三角形(7,7,9);	
    double l;
    l=a1.三角形周长();
    System.out.print("l="+l);
	}

}
abstract class Employee
{
	public abstract double earnings();
}
class YearWorker extends Employee//年薪
{
	  int a,b;
      public double earnings()
	{
		return a*b;
	}
}
class MonthWorker extends Employee//月薪
{
	int c,e;
	public double earnings()
	{
	return c*e;
	}
}
class WeekWorker extends Employee//周薪
{
	int c,e;
	public double earnings()
	{
	return c*e;
	}
}
class Company//公司
{
	Employee[] employee;
	double salaries=0;
	Company(Employee[]employee)
	{
		this.employee=employee;//雇员
	}
	public double salariesPay()
	{
		salaries=0;
		int a,b;
		salaries=a*b;//计算工资
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
		System.out.println("公司年工资总额："+company.salariesPay());
	}
  
}

