
import java.util.ArrayList;
import java.util.Scanner;
 

 
public class Arraylist
{
    public static void main(String[] args)
    { 
        
        ArrayList arr_data = new ArrayList();
         

        System.out.print("Input jumlah Data : ");   int jlh_data = new Scanner(System.in).nextInt();
        
        for(int a = 0; a < jlh_data; a++)
        {
            System.out.print("Masukkan Data ke-"+(a+1)+": ");
            arr_data.add(new Scanner(System.in).nextLine());
        }
         
        System.out.println("\nTampilkan Data yang di input");
        for(Object o : arr_data)
        {
            System.out.println(o);
        }
         
        System.out.print("\nInput Data yang akan dihapus : ");  String data_hapus = new Scanner(System.in).nextLine();
        
        arr_data.remove(data_hapus);
         
        System.out.println("\nTampilkan kembali Data yang ada di dalam ArrayList");
        for(Object o : arr_data)
            System.out.println(o);
         
    }
}
