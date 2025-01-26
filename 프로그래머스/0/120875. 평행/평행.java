class Solution 
{
    public int solution(int[][] dots) 
    {        
        double[][] _slope = new double[4][4];
        for (int i = 0 ; i < dots.length ; i++)
        {
            for (int j = 0 ; j < dots.length ; j++)
            {
                if (i == j)
                    continue;

                double y = dots[i][1] - dots[j][1];
                double x = dots[i][0] - dots[j][0];
                _slope[i][j] = y / x;                
            }
        }

        int _result = 0;

        for (int j = 0 ; j < _slope.length ; j++)
        {
            for (int i = 0 ; i < 4 ; i++)
            {
                if (j == i)
                    continue;                
                for (int h = 0 ; h < 4 ; h++)
                {
                    for (int g = 0 ; g < 4 ; g++)
                    {
                        if (h == g)
                            continue;

                        if (j == h || j == g || i == h || i == g)
                            continue;

                        if (_slope[j][i] == _slope[h][g])
                            _result = 1;
                    }
                }
            }
        }

        return _result;
    }
}