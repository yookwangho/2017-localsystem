import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
	
		System.out.print("�Է��� �ִ� �Ǽ��� ������ �Է��ϼ���. >> ");    
        Scanner input = new Scanner(System.in);  
        int size = input.nextInt();
        System.out.println("\n�߰��� 0�� �Է��ϸ� ���� �Է��ڷ�� ����ϰ� �����մϴ�.");  
        System.out.print("�Ǽ� " + size + "���� �Է��ϼ���. >> ");    
        
        int i = 0, n = 0;
		double sum = 0;
		
		double[] arry = new double[size];
		
		for(;i<size;i++){	
			arry[i] = input.nextDouble();
			sum += arry[i];
			if(arry[i]==0) break;
			else n++;
		}
        
        System.out.println("��: " + sum + ", ���: " + sum / n );
	
		
	}
}
