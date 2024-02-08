public class countingg {
    //Write a java program to separately print the even and odd number in an array with their count value.


        public static void main(String[] args)
        {
            int a[]={12,23,34,45,5,56,89,7,9};
            int even=0;
            int odd=0;
            for(int i=0; i<a.length; i++)
            {
                if(a[i]%2==0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }
            System.out.println("Even numbers:"+even);
            System.out.println("Odd numbers:"+odd);
        }
    }