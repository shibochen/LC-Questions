	public boolean isUgly(int num) {
        for(int i = 2; i < 6 && num > 0; i++){
            while( num % i == 0) num /= i;
        }
        return num == 1;
    }

    //Note: since the ugly number only contains prime number 2, 3, 5
    //The above loop shows i will be 2, 3, 4, 5     4 = 2 * 2;