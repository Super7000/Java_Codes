class sorting
{
    private int[] a;
    private int len;
    public sorting(int array[],int arr_len)
    {
        a = array;
        len = arr_len;
    }
    public void selection_sort()
    {
        for(int i = 0; i < len; i++)
        {
            int min = i;
            for(int j = i; j < len; j++)
            {
                if(a[j] < a[min]) min = j;
            }
            if(min != i)
            {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }
    public void bubble_sort()
    {
        for(int i = 0; i < len; i++)
        {
            for(int j=0; j < len-1-i; j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    // --------------- Quick Sort ----------------


    public int partition(int l,int r)
    {
        int pivot = a[r];
        int i = l-1;
        for(int j = l; j < r; j++)
        {
            if(a[j] < pivot)
            {
                ++i;
                if(j != i)
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int temp = a[i+1];
        a[i+1] = a[r];
        a[r] = temp;
        return i+1;
    }
    public void quick_sort_func(int l, int r)
    {
        if(l<r)
        {
            int p = partition(l,r);
            quick_sort_func(l,p-1);
            quick_sort_func(p+1,r);
        }
    }
    public void quick_sort()
    {
        quick_sort_func(0,len-1);
    }
}
public class Short
{
	public static void main(String[] args) 
	{
	    int[] a= {21, 3, 4, 1, 4, 5, 8, 9, 12, 10, 55, 22, 41, 58, 70, 152, 100, 200, 111, 110, 112, 115, 114, 101, 77, 74};
	    int arr_len = 26;
	    sorting sort = new sorting(a,arr_len);
	    sort.quick_sort();
	    for(int i = 0; i < arr_len; i++)
	    {
	        System.out.print(a[i]+" ");
	    }
	}
}
