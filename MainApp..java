package Basic.dev;
import java.util.Scanner;
public class MainApp {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
	  
	String name;
    int year;

    Scanner sc = new Scanner(System.in);
    System.out.format("Nhập vào họ tên của sinh viên: ");
    name = sc.nextLine();
    System.out.format("Nhập vào năm sinh của sinh viên: ");
    year = sc.nextInt();

    System.out.println("Họ tên của sinh viên: " + name);
    System.out.println("Tuổi của sinh viên :  " + year);
    
   
    int diemToan, diemLy, diemVan;
    System.out.format("Nhập vào điểm toán : ");
    diemToan = sc.nextInt();
    System.out.format("Nhập vào điểm lý: ");
    diemLy = sc.nextInt();
    System.out.format("Nhập vào điểm văn: ");
    diemVan = sc.nextInt();
    cau2 (diemToan,diemLy,diemVan);
    
    int A,B;
    System.out.format("Nhập vào cạnh A : ");
    A = sc.nextInt();
    System.out.format("Nhập vào cạnh B: ");
    B = sc.nextInt();
    
    cau3(A,B);
    
    int x,y;
    System.out.format("Nhập vào cạnh x : ");
    x = sc.nextInt();
    System.out.format("Nhập vào cạnh y: ");
    y = sc.nextInt();
    
    cau4 (x,y);
    
    float a,b,c;
    System.out.format("Nhập vào  a : ");
    a = sc.nextInt();
    System.out.format("Nhập vào b: ");
    b = sc.nextInt();
    System.out.format("Nhập vào c: ");
    c = sc.nextInt();
    
    cau5 (a,b,c);
    
    int m,n;
    System.out.format("Nhập vào  m : ");
    m = sc.nextInt();
    System.out.format("Nhập vào n: ");
    n = sc.nextInt();
    
    cau6(m,n);
  }
  
  private static void cau2(int diemToan,int diemLy,int diemVan) {
    // TODO Auto-generated method stub
	double diemTrungBinh;
    diemTrungBinh = (diemToan + diemLy + diemVan)  /3;

   
    System.out.println(" điểm trung bình"+diemTrungBinh);
    
  } 
    private static void cau3(int A,int B) {
        // TODO Auto-generated method stub
    float dienTich;
    float chuVi;
    
    dienTich = (A*B)	;
    chuVi = (A+B)*2	;
    
    System.out.println("Diện tích : " + dienTich);
    System.out.println("Chu Vi" + chuVi);
    } 
    private static void cau4(int x,int y) {
        // TODO Auto-generated method stub
    	float tong,hieu,tich,thuong;
    	
    tong = x+y;
    hieu = x-y;
    tich = x*y;
    thuong = x/y;
    	
    System.out.println("Tổng : " + tong);
    System.out.println("Hiệu" + hieu);
    System.out.println("Tích : " + tich);
    System.out.println("Thương" + thuong);
    
    }
    
    private static void cau5(float a,float b,float c) {
      // TODO Auto-generated method stub
    float min,max; 
    max = min = a;
    	 
    if(b > max){
     max = b;
     }
    	 
    if(c > max){
     max = c;
     }
    System.out.format("\n số lớn nhất %d", max);
    	    
    if(b < min){
     min = b;
     }
    	 
     if(c < min){
      min = c;
     }
    System.out.format("\n số be nhất %d", min);
    	    
    } 
    private static void cau6(int m,int n) {
        // TODO Auto-generated method stub
    	 
    	if (m % n ==0) {
    		System.out.println("m chia hết cho n");
    	}else	{
    		System.out.println("m không chia hết cho n");
    	}
  }
}