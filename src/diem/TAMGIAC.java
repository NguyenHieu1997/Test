package diem;

import java.util.Scanner;


 class DIEM {
    int x,y;
    int Ax,Ay;
    private int xx;
    private int yy;
   void nhap()
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("\n nhap x:");
       x=sc.nextInt();
       System.out.print("nhap y:");
       y=sc.nextInt();
               
   } 
   void xuat()
   {
       System.out.println("("+x+","+y+")");
   }
   
  public DIEM()
  {
    x=0;
    y=0;
  }
  public DIEM(int xx,int yy)
  {
      x=xx;
      y=yy;
  }
float chieudai(DIEM A)
{
    return (float)Math.sqrt((Ax-x)*(Ax-x)+(Ay-y)*(Ay-y));
}
}
 public class TAMGIAC
  {
     DIEM A,B,C;
     public TAMGIAC()
     {
         A=new DIEM();
         B=new DIEM();
         C=new DIEM();
         
     }
 
public TAMGIAC(int xA,int yA,int xB,int yB,int xC,int yC)
        
      {
         A=new DIEM(xA,yA);
         B=new DIEM(xB,yB);
         C=new DIEM(xC,yC);
         
     }  
void nhap()
{
  System.out.print("A:");
  A.nhap();
  System.out.print("B:");
  B.nhap();
  System.out.print("C:");
  C.nhap();
}
void in()
        
{
  System.out.print("\n A:");
  A.xuat();
  System.out.print("\n B:");
  B.xuat();
  System.out.print("\n C:");
  C.xuat();
  System.out.print( "\n Dien tich:" + Dientich());
  
}
float dientich()
{
    float a,b,c,p,s;
    a=B.chieudai(C);
    b=A.chieudai(C);
    c=A.chieudai(B) ;
    p=(a+b+c)/2;
    s=(float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
    return s;
}
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       float s;
       TAMGIAC t=new TAMGIAC();
       System.out.print("\n nhap toa do cac dnh cua tam giac : ");
       t.nhap();
       System.out.print("\n cac dinh cua tam giac vua nhap : ");
       t.in();
       System.out.println("Dien tich tam gia la: ");
       s=t.dientich();
        // TODO code application logic here
    }

    private String Dientich() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
