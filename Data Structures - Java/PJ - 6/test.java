public class test 
{
    public static void main(String[] args)
    {
        String[] num = new String[3];

        for(int i = 0; i < num.length; ++i)
        {
            System.out.println(i + " : " + num[i]);
        }
        num[2] = "random";
        System.out.println("num[2]: " + num[2]);
        num[2] = null;
        System.out.println("num[2]: " + num[2]);
    }    
}


/*
 //This for loop goes through the array in order to find the number bieng removed then sets it to null
            
            for(int i = 0; (i <= itemsArray.length - 1) && itemsArray[i] != null; i++)
            {
                    if(itemsArray[i].equals(stackFind()))
                    {
                        System.out.println(itemsArray[i]);
                        itemsArray[i] = null;
                        ++breakcounter;
                        break; //after the element is found, this breaks out of the loop so that you dont delete earlier elements
                }
            }
*/