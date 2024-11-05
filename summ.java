import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class summ{
      public static void main(String[] args){

try{

   File file=new File("file.txt");
Scanner sc=new Scanner(file);
if(sc.hasNextLine()){
String line=sc.nextLine();
String[] arr=line.split(",");
for(int i=0;i<arr.length;i++){
int n=Integer.parseInt(arr[i].trim());
StringBuilder seris=new StringBuilder();
for(int j=1;j<=n;j++){
seris.append(j);
if(j<n){
seris.append("+");
}
}
int sum=n*(n+1)/2;
System.out.println(seris+"="+sum);


}
}sc.close();
}catch(FileNotFoundException e){System.out.println("File not found.");}
catch(NumberFormatException e){System.out.println("Invalid number format.");}



}

}
//IT-22023
