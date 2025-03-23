
package averagepropertyprices;


import java.io.*;
import java.lang.Math;
public class AveragePropertyPrices
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       //Declare the number of rows and columns
			int y =3;
			int x =3;
         int [][] number = new int[x][y];
		
        //inputting the prices into their places in the array
         number[0][0] = 800000;
         number[0][1] = 1500000;
         number[0][2] = 2000000;
         
         number[1][0] = 700000;
         number[1][1] =  1200000;
         number[1][2] = 1600000;
         
         number[2][0] = 750000;
         number[2][1] = 1300000;
         number[2][2] = 1800000;
     
         // Outputting the contents of the array
         System.out.println("Flat\t\tTown House\t\t House\n--------------------------------------------------------");
         
         for(int row = 0; row < x; row++)
         {
             
            for(int col = 0; col < y; col++)
            {
                
               System.out.print(number[row][col]+ "\t\t ");
              
            }
				
            // To skip to the next line
            System.out.println();
         }
         //calculating the average of the total average property type price for each province
         int avgGautengProperty = ((number[0][0] + number[0][1] + number[0][2])/3);
         int avgNatalProperty = ((number[1][0] + number[1][1] + number[1][2])/3);
         int avgCapeProperty = ((number[2][0] + number[2][1] + number[2][2])/3);
         
         //outputting the total average property type price for each province
         System.out.println("Average property prices in Gauteng = R" + avgGautengProperty);
         System.out.println("Average property prices in Natal = R" + avgNatalProperty);
         System.out.println("Average property prices in Cape = R" + avgCapeProperty);
         
    }
    
}
