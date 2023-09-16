import java.util.Scanner;
class searching
{
    private int[] a;
    private int len;
    public int binary_search(int s)
    {
        int min = 0, max = len-1, mid;
        while(min<=max)
        {
            mid = (min+max)/2;
            if(a[mid]==s) return mid;
            else if (s<a[mid]) 
            {
                max = mid-1;
            }
            else {
                min = mid+1;
            }
        }
        return -1;
    }
    public int linear_search(int s)
    {
        for(int i = 0; i < len; i++)
        {
            if (a[i] == s) return i;
        }
        return -1;
    }
    public searching(int[] array,int arr_len)
    {
        a = array;
        len = arr_len;
    }
}
public class Search
{
	public static void main(String[] args) 
	{
	    int[] array = {1, 3, 4, 4, 5, 8, 9, 10, 12, 21, 22, 41, 55, 58, 70, 74, 77, 100, 101, 110, 111, 112, 114, 115, 152, 200};
	    int arr_len = 26;
	    searching search = new searching(array,arr_len);
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter Element to search: ");
	    int s = scan.nextInt();
	    int f = search.binary_search(s);
	    if(f==-1) System.out.println("Element not found");
	    else System.out.println("Element found at index "+f);
	}
}
