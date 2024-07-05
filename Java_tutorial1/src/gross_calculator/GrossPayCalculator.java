package gross_calculator;
import java.util.*;
public class GrossPayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Inventory arr[]=new Inventory[4];
		for(int i=0;i<arr.length;i++) {
			int a=sc.nextInt();sc.nextLine();
			int b=sc.nextInt();sc.nextLine();
			int c=sc.nextInt();sc.nextLine();
			int d=sc.nextInt();sc.nextLine();
			arr[i]=new Inventory(a,b,c,d);
		}
		int limit=sc.nextInt();
		Inventory ans[]=f(arr,limit);
		for(int i=0;i<ans.length;i++) {
		if(ans[i].getthreshold()>75) {
			System.out.println("Critical");
		}
		else if(ans[i].getthreshold()>50 && ans[i].getthreshold()<75) {
			System.out.println("Moderate");
		}
		else {
			System.out.println("Non-critical");
		}
		}
	}
	
	public static Inventory[] f(Inventory[] arr,int limit) {
		Inventory temp[]=new Inventory[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getthreshold()<=limit) {
				temp=Arrays.copyOf(temp,temp.length+1);
				temp[temp.length-1]=arr[i];
			}
		}
		
		return temp;
	}

}


class Inventory{
	int inventoryId;
	int maximumQty;
	int currentQty;
	int threshold;
	
	public Inventory(int inventoryId,int maximumQty,int currentQty,int threshold) {
		this.inventoryId=inventoryId;
		this.maximumQty=maximumQty;
		this.currentQty=currentQty;
		this.threshold=threshold;
	}
	public int getInventoryId() {
	return inventoryId;
	}
	
	public int getmaximumQty() {
		return inventoryId;
    }
	
	public int getcurrentQty() {
		return currentQty;
    }
	
	public int getthreshold() {
		return threshold;
    }
};