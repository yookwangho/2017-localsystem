import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
	
		System.out.print("입력할 최대 실수의 갯수를 입력하세요. >> ");    
        Scanner input = new Scanner(System.in);  
        int size = input.nextInt();
        System.out.println("\n중간에 0을 입력하면 이전 입력자료로 계산하고 종료합니다.");  
        System.out.print("실수 " + size + "개를 입력하세요. >> ");    
        
        int i = 0, n = 0;
		double sum = 0;
		
		double[] arry = new double[size];
		
		for(;i<size;i++){	
			arry[i] = input.nextDouble();
			sum += arry[i];
			if(arry[i]==0) break;
			else n++;
		}
        
        System.out.println("합: " + sum + ", 평균: " + sum / n );
	
		
	}
}
