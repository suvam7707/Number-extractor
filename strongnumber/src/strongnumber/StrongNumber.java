package strongnumber;
import java.io.*;

public class StrongNumber {

	public static void main(String[] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int count,flag=1,num=Integer.parseInt(str);
		int[] a=new int[num];
		for(int i=1;i<num;i++) {
			count=0;
			for(int j=0;j<num;j++) {
				if(count<i && a[j]==0)
					count++;
				else if(count==i && a[j]==0) {
					count=0;
					a[j]=1;
				}
			}
			if(a[num-1]==1) {
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
