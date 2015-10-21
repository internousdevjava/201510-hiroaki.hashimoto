import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kisokadai1 {
	  public static void main(String args[]) throws IOException {
		  int xx = 10;
		  int yy = 10;
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		  System.out.println("x軸の最大値を1～"+ xx +"迄の数字で入力してください:");

		    try{

		        int x = Integer.parseInt(br.readLine());

		        if(x > xx){
		        	System.out.println("入力した数字は使用できません!!");
		        	main(args);
		        }

		        System.out.println("y軸の最大値を1～"+ yy +"迄の数字で入力してください:");

		        int y = Integer.parseInt(br.readLine());

		        if(y > yy){
		        	System.out.println("入力した数字は使用できません!!\r\nやり直してください");
		      		        	main(args);
		        }

		        int keisan [][] = new int [xx][yy];

		        for( int i=0; i<y; i++ ) {

		        	for( int j=0; j<x; j++ ){

		        		keisan[i][j] = (i+1) * (j+1);

		        		if(keisan[i][j] >= 10){
		        			System.out.print(" " + keisan[i][j]);
		        		}else{
		        			if(keisan[i][j] >= 10){
		        				System.out.print("  " + keisan[i][j]);
		        			}else{
		        				System.out.print("   " + keisan[i][j]);
		        			}
		        		}
		        	}
		        	System.out.println();
		        }

		    }catch(NumberFormatException e){
		    	System.out.println("数字以外が入力されました\r\nやり直してください");
		    	main(args);
		    }catch(IOException e){
		    	System.out.println(e);
		    	main(args);
		    }finally{
		    	System.out.println("プログラムを終了します");
		    	System.exit(0);
		    }
	 }

}