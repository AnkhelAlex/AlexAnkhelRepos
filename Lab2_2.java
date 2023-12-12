public class Lab2_2
{
    public static void main(String[] args) 
    {
        CreateArray(3, 4, 0);
        CreateArray(5, 5, 2);
        CreateArray(7, 8, 7);
    }

    public static void CreateArray(int y, int x, int startValue)
    {        
        int[][] array = new int[y][x];

        for(int i = 0; i < y; i++ )
        {
            for(int j = 0; j < x; j++)
            {
                array[i][j] = startValue;
                startValue += 3;
            }
        }

        for(int i = 0; i < y; i++ )
        {
            for(int j = 0; j < x; j++)
            {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }

}