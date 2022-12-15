package Basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
	    int year;
	    int old;
	    Scanner sc = new Scanner(System.in);
	    System.out.format("Nhập vào họ tên của sinh viên: ");
	    name = sc.nextLine();
	    System.out.format("Nhập vào năm sinh của sinh viên: ");
	    year = sc.nextInt();
	    old = 2022 - year;
	    
	    System.out.println("Họ tên của sinh viên: " + name);
	    System.out.println("Tuổi của sinh viên :  " + old);


	    float diemToan, diemLy, diemVan;
	    System.out.format("Nhập vào điểm toán : ");
	    diemToan = sc.nextFloat();
	    System.out.format("Nhập vào điểm lý: ");
	    diemLy = sc.nextFloat();
	    System.out.format("Nhập vào điểm văn: ");
	    diemVan = sc.nextFloat();
	    cau2 (diemToan,diemLy,diemVan);

	    int A,B;
	    System.out.format("Nhập vào cạnh A : ");
	    A = sc.nextInt();
	    System.out.format("Nhập vào cạnh B: ");
	    B = sc.nextInt();

	    cau3(A,B);

	   float x,y;
	    System.out.format("Nhập vào cạnh x : ");
	    x = sc.nextFloat();
	    System.out.format("Nhập vào cạnh y: ");
	    y = sc.nextFloat();

	    cau4 (x,y);

	    float a,b,c;
	    System.out.format("Nhập vào  a : ");
	    a = sc.nextFloat();
	    System.out.format("Nhập vào b: ");
	    b = sc.nextFloat();
	    System.out.format("Nhập vào c: ");
	    c = sc.nextFloat();

	    cau5 (a,b,c);

	    int m,n;
	    System.out.format("Nhập vào  m : ");
	    m = sc.nextInt();
	    System.out.format("Nhập vào n: ");
	    n = sc.nextInt();

	    cau6(m,n);
	  }

	  private static void cau2(float diemToan,float diemLy,float diemVan) {
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
	    private static void cau4(float x,float y) {
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
	    System.out.println("\n số lớn nhất : "+ max);

	    if(b < min){
	     min = b;
	     }

	     if(c < min){
	      min = c;
	     }
	    System.out.println("\n số be nhất : "+ min);

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