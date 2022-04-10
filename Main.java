import java.util.*;
public class Main {

    public static void main(String[] args) {
        String[] names = {"Arhum","Drake","Jack","Ana","Bob","Dan","Henry","Ron","Chris","Mike"};
        int[] ast=new int[10];
        int[] maxArrVal=new int[10];
        String[] maxArrName={"","","","","","","","","",""};
        
        int maxAst=0;
        int count=0;
        int indexOfMax=0;
        
        //randomizes # of * per name
        for (int i =0;i<250;i++){

            ast[(int)(Math.random()*10)]++;
        }
        
        //finds max # of *
        for (int i=0;i<ast.length;i++){
            if(ast[i]>maxAst){
                maxAst=ast[i];
                indexOfMax=i;
            }
        }

        for (int i=0;i<names.length;i++){
            if(ast[i]==maxAst){
                maxArrVal[i]=ast[i];
                maxArrName[i]=names[i];
                count++;
            }
        }
        
        for (int i =0; i<names.length;i++){
            System.out.print(i+1+": ");
            for (int j=0;j<ast[i];j++){
                System.out.print("*");
            }
            
            System.out.print(" "+names[i]);
            System.out.println();
        }
        if(count<=1){
            System.out.println("Student Selected: "+(indexOfMax+1)+", "+names[indexOfMax]);
        }
        else{
            String t = "Tie Between ";
            String b ="";
            for (int i=0;i<names.length;i++){
                if (maxArrName[i].compareTo("")>0){
                    b +=(maxArrName[i]+" and ");
                    
                }
            }
            System.out.println((t+b).substring(0,(t+b).length()-4));
            int random = (int)(Math.random()*count+1);
            System.out.print("Student Selected: "+(random+1)+" , "+maxArrName[random]);           
        }
        
        // prints * and names
        
    }

}




